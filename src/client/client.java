package client;
import java.io.*;  
//import java.net.InetAddress;
import java.net.Socket;
//import java.util.Scanner;

public class client{
	static PrintWriter out;
	public client() throws InterruptedException, IOException  {
		Socket s=new Socket("192.168.1.8",65);
				Object lock=new Object();
		Object lock1=new Object();
		cwindow Gui=new cwindow(lock,s,lock1);
		ClientConnect Cconn= new ClientConnect(s,Gui,lock1);
		//new Thread(Cconn).start();
		//Gui.serverresponse.setText(ClientConnect.input.readLine());
		Cconn.t.start();
		System.out.println("read thread created");

		
		

		out=new PrintWriter(s.getOutputStream(),true);
		synchronized(lock) {
			
		while(!s.isClosed()) { 
			 System.out.println("before wait");
	    lock.wait();
	    
		String command=Gui.cinput;
		out.println(command);
		System.out.println(command);
		if(command.equals("$%$%logout$%$%")) {s.close(); break;}
		}
		System.out.println("line32");
		

	}
	}
	public static void main(String[] args) throws InterruptedException, IOException  {
		new client();
	}

}



