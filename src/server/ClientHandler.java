package server;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class ClientHandler implements Runnable{
	String name;
   protected PrintWriter out;
	protected BufferedReader in;
	 Socket s;
	 ClientHandler(Socket s,String name,PrintWriter out,BufferedReader in){
		 this.s=s;
		 this.out=out;
		 this.in=in;
		 this.name=name;
	 }
	@Override
	public void run() {
		String receive;
		while(!s.isClosed()) {
			try {
				receive=in.readLine();
				
				if(receive.equals("logout")) {
					server.ar.remove(this);
					s.close();
					break;
				}
				StringTokenizer st=new StringTokenizer(receive,"#");
				String msg=st.nextToken();
				String rec=st.nextToken();
				for(ClientHandler ch:server.ar) {
					if(ch.name.equals(rec)&&!ch.s.isClosed()) {
						ch.out.println(msg+"#"+this.name);
						break;
					}
				}
				
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		try {
			this.out.close();
			this.in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
