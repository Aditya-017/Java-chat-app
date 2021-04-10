package server;
import java.io.*;  
import java.net.*;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class server {
    static Vector<ClientHandler> ar=new Vector<>();
    private static ExecutorService pool=Executors.newFixedThreadPool(11);
	public static void main(String[] args) throws IOException {
		ServerSocket ser= new ServerSocket(65);
		Socket s;
		int i=0;
		String cname,names="";
		boolean namecaught=false;
		System.out.println("server waiting for 1st request");
		while(true) {
		s= ser.accept();
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
		if(i==10) {
			out.println("server saturated");
			s.close();
		}
		if(i<10) {
			out.println("connection allowed");
		}

		do {
			cname=in.readLine();
			if(i==0)break;
		for(ClientHandler ch:ar) {
			if(cname.equals(ch.name)||cname.equals("")) {
				out.println("name already exists   enter another");
			    break;
			}	
		namecaught=true;
		}
		}while(!namecaught);
		out.println(cname+" Accepted");
		ClientHandler mtch=new ClientHandler(s,cname,out,in);
		for(ClientHandler clih:ar) {
			clih.out.println("$" + cname);
		}
		for(ClientHandler clih:ar) {
			names=names+clih.name+"@";
		}
		out.println(names);
		ar.add(mtch);
		pool.execute(mtch);
		i++;
		System.out.println(s+"accepted"+cname);
		
		}
	}
}

