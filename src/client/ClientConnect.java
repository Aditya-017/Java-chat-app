package client;
import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class ClientConnect implements Runnable {
	String server;
	static BufferedReader input;
	private Socket s;
	private cwindow Gui;
	Thread t;
	Object lock1;
	ClientConnect(Socket s,cwindow Gui,Object l1) throws IOException{
		t=new Thread(this);
		this.Gui=Gui;
         this.s=s;
         this.lock1=l1;
		input =new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	@Override
	public void run(){
		
		try {
			server=input.readLine();
			System.out.println(server);
			Gui.serverresponse.setText(server);//server response for connection allowed or not
			do {
			server= input.readLine();
			Gui.serverresponse.setText(server);//response of server for name acceptance
			}while(!server.contains("Accepted"));
			server=input.readLine();
			if(!server.equals("")) {
			StringTokenizer stoc=new StringTokenizer(server,"@");
			int j=0;
			String set;
				for(JButton jbut:Gui.arcli) {
					set=stoc.nextToken();
				jbut.setText(set);
				JPanel jp=Gui.arpan.get(j);
				JLabel lb=(JLabel) jp.getComponent(5);
				lb.setText(set);
				j++;
					if(!stoc.hasMoreTokens())
						break;
				}
			}
		
				
				
			
			while(!s.isClosed()) {
		    System.out.println("in while loop for reading");
			server= input.readLine();
			System.out.println(server);
			if(server!=null) {
				if(server.startsWith("$")) {
					int i=0;
					System.out.println(server+"joined");
					for(JButton jb:Gui.arcli) {
						
						if(jb.getText().equals("")) {
							jb.setText(server.substring(1));
							JPanel j=Gui.arpan.get(i);
							JLabel l=(JLabel) j.getComponent(5);
							l.setText(server.substring(1));
						    break;}
						i++;
					}
				
				}
				else if(server.startsWith("%$%$%update cli_list$%$%")){
					String remName =server.substring(24);
					int k=0;
				
						for(JButton jbut:Gui.arcli) {
							if(jbut.getText().equals(remName)) {
								jbut.setText("");
								JPanel jap =Gui.arpan.get(k);
								JLabel jal=(JLabel) jap.getComponent(5);
								jal.setText(null);
								JTextArea jtxt=(JTextArea) jap.getComponent(0);
								jtxt.setText(null);
								break;
							}
							k++;
						}
				}
				else {System.out.println("recieving "+server);
					StringTokenizer st=new StringTokenizer(server,"#");
					String msg=st.nextToken();
					String sender=st.nextToken();
					System.out.println("tokenize success sender is "+sender);
					for(JPanel ar:Gui.arpan) {
						System.out.println("in for loopp");
						JLabel jl=(JLabel) ar.getComponent(5);
						JTextArea jt=(JTextArea) ar.getComponent(0);
						if(sender.equals(jl.getText())) {
							jt.append("\n"+sender+">"+msg);
							System.out.println("printing to "+jl.getText());
							break;
						}
						
					}
				}
			//Gui.client_text_area.append("\nserver >"+server);
			
			if(server.equals("quit"))  {System.out.println("server out");break;}
			}
			            }
		}
		 
		 catch (IOException e) {
		System.out.println("exception");
		   }
		
			
			System.out.println("end");
		}
		
	}




