package client;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class cwindow  {
	JFrame frame;
	private JTextField client_type;
	JTextArea client_text_area;
	String cinput="";
    Object lock;
    Object lock1;
    Socket cli;
    JTextField serverresponse = new JTextField();
    private JTextField user_name;
    Vector<JButton> arcli = new Vector<>();
    Vector<JPanel> arpan =new Vector<>();
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
	/**
	 * Launch the application.
	 */
	public cwindow(Object l,Socket s,Object l1) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lock=l;
					cli=s;
					lock1=l1;
					initialize();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private void initialize() {
		frame = new JFrame("client");
		frame.setBackground(new Color(128, 128, 128));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		JPanel cli_list = new JPanel();
		JPanel chat_win1 = new JPanel();
		JPanel chat_win2 = new JPanel();
		JPanel chat_win3 = new JPanel();
		JPanel chat_win4 = new JPanel();
		JPanel chat_win5 = new JPanel();
		JPanel chat_win6 = new JPanel();
		JPanel chat_win7 = new JPanel();
		JPanel chat_win8 = new JPanel();
		JPanel chat_win9 = new JPanel();
		JPanel chat_win10 = new JPanel();
		JLabel lblYo = new JLabel();
		lblYo.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		lblYo.setForeground(Color.GREEN);
		JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		label_2.setForeground(Color.GREEN);
		JLabel lblSup = new JLabel();
		lblSup.setForeground(Color.GREEN);
		lblSup.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		label_4.setForeground(Color.GREEN);
		JLabel label_5 = new JLabel();
		label_5.setForeground(Color.GREEN);
		label_5.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		JLabel label_6 = new JLabel();
		label_6.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		label_6.setForeground(Color.GREEN);
		JLabel label_7 = new JLabel();
		label_7.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		label_7.setForeground(Color.GREEN);
		JLabel label_8 = new JLabel();
		label_8.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		label_8.setForeground(Color.GREEN);
		JLabel label_9 = new JLabel();
		label_9.setForeground(Color.GREEN);
		label_9.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		JLabel label_10 = new JLabel();
		label_10.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		label_10.setForeground(Color.GREEN);
	    

		frame.addWindowListener(new WindowAdapter() {
			 
			@Override
			 
			public void windowClosing(WindowEvent e)  {
			 
				synchronized(lock) {	
		        	  cinput="$%$%logout$%$%";
		        	  lock.notify();}
			 
			}
			 
			  });
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		chat_win1.setBackground(new Color(47, 79, 79));
		frame.getContentPane().add(chat_win1, "name_26139565437884");
		chat_win1.setLayout(null);
		chat_win1.setVisible(false);
		arpan.add(chat_win1);
		
	    client_text_area = new JTextArea();
	    client_text_area.setBounds(19, 29, 318, 206);
	    chat_win1.add(client_text_area);
	    client_text_area.setEditable(false);
	    client_text_area.setForeground(Color.ORANGE);
	    client_text_area.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    client_text_area.setBackground(Color.DARK_GRAY);
	    client_text_area.setRows(20);
	    
	    
	    client_type = new JTextField();
	    client_type.setBackground(new Color(240, 255, 255));
	    client_type.setBounds(10, 237, 327, 23);
	    chat_win1.add(client_type);
	    client_type.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    client_type.setColumns(10);
	    
	    JButton btnNewButton = new JButton("CLEAR");
	    btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 12));
	    btnNewButton.setForeground(new Color(240, 248, 255));
	    btnNewButton.setBackground(new Color(72, 61, 139));
	    btnNewButton.setBounds(327, 0, 97, 23);
	    chat_win1.add(btnNewButton);
	    
	    JButton client_send = new JButton("SEND");
	    client_send.setBackground(new Color(255, 0, 0));
	    client_send.setBounds(356, 237, 78, 23);
	    chat_win1.add(client_send);
	    
	    JButton back = new JButton("Back");
	    back.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win1.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    back.setBackground(new Color(255, 0, 255));
	    back.setBounds(19, 6, 90, 19);
	    chat_win1.add(back);
	    
	    
	    lblYo.setHorizontalAlignment(SwingConstants.CENTER);
	    lblYo.setBounds(108, 3, 207, 31);
	    chat_win1.add(lblYo);
	    
	    
	    cli_list.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(cli_list, "name_26139686207818");
	    cli_list.setLayout(null);
	    cli_list.setVisible(false);
	    
	    JButton button_1 = new JButton("");
	    button_1.setBackground(new Color(169, 169, 169));
	    button_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		if(!button_1.getText().equals("")) {
	    			//label_1.setText(button_1.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(true);
	    			chat_win2.setVisible(false);
	    			chat_win3.setVisible(false);
	    			chat_win4.setVisible(false);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(false);
	    			chat_win7.setVisible(false);
	    			chat_win8.setVisible(false);
	    			chat_win9.setVisible(false);
	    			chat_win10.setVisible(false);
	    			
	    		}
	    	}
	    });
	    button_1.setBounds(29, 22, 90, 28);
	    cli_list.add(button_1);
	    arcli.add(button_1);
	    
	    JButton button_2 = new JButton("");
	    button_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(!button_2.getText().equals("")) {
	    			//label_2.setText(button_2.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(false);
	    			chat_win2.setVisible(true);
	    			chat_win3.setVisible(false);
	    			chat_win4.setVisible(false);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(false);
	    			chat_win7.setVisible(false);
	    			chat_win8.setVisible(false);
	    			chat_win9.setVisible(false);
	    			chat_win10.setVisible(false);
	    			
	    			
	    		}
	    	}
	    });
	    button_2.setBounds(29, 62, 90, 28);
	    cli_list.add(button_2);
	    arcli.add(button_2);
	    
	    JButton button_3 = new JButton("");
	    button_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(!button_3.getText().equals("")) {
	    			//label_3.setText(button_3.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(false);
	    			chat_win2.setVisible(false);
	    			chat_win3.setVisible(true);
	    			chat_win4.setVisible(false);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(false);
	    			chat_win7.setVisible(false);
	    			chat_win8.setVisible(false);
	    			chat_win9.setVisible(false);
	    			chat_win10.setVisible(false);
	    			
	    			
	    		}
	    	}
	    });
	    button_3.setBounds(29, 114, 90, 28);
	    cli_list.add(button_3);
	    arcli.add(button_3);
	    
	    JButton button_4 = new JButton("");
	    button_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(!button_4.getText().equals("")) {
	    			//label_4.setText(button_4.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(false);
	    			chat_win2.setVisible(false);
	    			chat_win3.setVisible(false);
	    			chat_win4.setVisible(true);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(false);
	    			chat_win7.setVisible(false);
	    			chat_win8.setVisible(false);
	    			chat_win9.setVisible(false);
	    			chat_win10.setVisible(false);
	    			
	    			
	    		}
	    	}
	    });
	    button_4.setBounds(29, 164, 90, 28);
	    cli_list.add(button_4);
	    arcli.add(button_4);
	    
	    JButton button_5 = new JButton("");
	    button_5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(!button_5.getText().equals("")) {
	    			//label_5.setText(button_5.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(false);
	    			chat_win2.setVisible(false);
	    			chat_win3.setVisible(false);
	    			chat_win4.setVisible(true);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(false);
	    			chat_win7.setVisible(false);
	    			chat_win8.setVisible(false);
	    			chat_win9.setVisible(false);
	    			chat_win10.setVisible(false);
	    			
	    			
	    		}
	    	}
	    });
	    button_5.setBounds(150, 22, 90, 28);
	    cli_list.add(button_5);
	    arcli.add(button_5);
	    
	    JButton button_6 = new JButton("");
	    button_6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(!button_6.getText().equals("")) {
	    			//label_6.setText(button_6.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(false);
	    			chat_win2.setVisible(false);
	    			chat_win3.setVisible(false);
	    			chat_win4.setVisible(false);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(true);
	    			chat_win7.setVisible(false);
	    			chat_win8.setVisible(false);
	    			chat_win9.setVisible(false);
	    			chat_win10.setVisible(false);
	    			
	    			
	    		}
	    	}
	    });
	    button_6.setBounds(150, 62, 90, 28);
	    cli_list.add(button_6);
	    arcli.add(button_6);
	    
	    JButton button_7 = new JButton("");
	    button_7.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(!button_7.getText().equals("")) {
	    			//label_7.setText(button_7.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(false);
	    			chat_win2.setVisible(false);
	    			chat_win3.setVisible(false);
	    			chat_win4.setVisible(false);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(false);
	    			chat_win7.setVisible(true);
	    			chat_win8.setVisible(false);
	    			chat_win9.setVisible(false);
	    			chat_win10.setVisible(false);
	    			
	    			
	    		}
	    	}
	    });
	    button_7.setBounds(150, 114, 90, 28);
	    cli_list.add(button_7);
	    arcli.add(button_7);
	    
	    JButton button_8 = new JButton("");
	    button_8.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(!button_8.getText().equals("")) {
	    			//label_8.setText(button_8.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(false);
	    			chat_win2.setVisible(false);
	    			chat_win3.setVisible(false);
	    			chat_win4.setVisible(false);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(false);
	    			chat_win7.setVisible(false);
	    			chat_win8.setVisible(true);
	    			chat_win9.setVisible(false);
	    			chat_win10.setVisible(false);
	    			
	    			
	    		}
	    	}
	    });
	    button_8.setBounds(150, 164, 90, 28);
	    cli_list.add(button_8);
	    arcli.add(button_8);
	    
	    JButton button_9 = new JButton("");
	    button_9.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(!button_9.getText().equals("")) {
	    			//label_9.setText(button_9.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(false);
	    			chat_win2.setVisible(false);
	    			chat_win3.setVisible(false);
	    			chat_win4.setVisible(false);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(false);
	    			chat_win7.setVisible(false);
	    			chat_win8.setVisible(false);
	    			chat_win9.setVisible(true);
	    			chat_win10.setVisible(false);
	    			
	    			
	    		}
	    	}
	    });
	    button_9.setBounds(276, 22, 90, 28);
	    cli_list.add(button_9);
	    arcli.add(button_9);
	    
	    JButton button_10 = new JButton("");
	    button_10.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(!button_10.getText().equals("")) {
	    		//	label_10.setText(button_10.getText());
	    			cli_list.setVisible(false);
	    			chat_win1.setVisible(false);
	    			chat_win2.setVisible(false);
	    			chat_win3.setVisible(false);
	    			chat_win4.setVisible(false);
	    			chat_win5.setVisible(false);
	    			chat_win6.setVisible(false);
	    			chat_win7.setVisible(false);
	    			chat_win8.setVisible(false);
	    			chat_win9.setVisible(false);
	    			chat_win10.setVisible(true);
	    			
	    			
	    		}
	    	}
	    });
	
	    button_10.setBounds(276, 72, 90, 28);
	    cli_list.add(button_10);
	    arcli.add(button_10);
	    
	    JButton logout = new JButton("Logout");
	    logout.setBackground(new Color(255, 0, 0));
	    logout.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		 synchronized(lock) {	
	        	  cinput="$%$%logout$%$%";
	        	  lock.notify();
				
	    		 }
	    	}
	    });
	    logout.setBounds(167, 217, 90, 28);
	    cli_list.add(logout);
	    
	    JPanel login_pan = new JPanel();
	    login_pan.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(login_pan, "name_26139793178152");
	    login_pan.setLayout(null);
	    login_pan.setVisible(true);
	    
	    
	    serverresponse.setEditable(false);
	    serverresponse.setHorizontalAlignment(SwingConstants.CENTER);
	    serverresponse.setFont(new Font("Segoe UI", Font.BOLD, 14));
	    serverresponse.setBackground(new Color(255, 20, 147));
	    serverresponse.setBounds(6, 198, 422, 58);
	    login_pan.add(serverresponse);
	    serverresponse.setColumns(10);
	    
	    JLabel lblServerResponse = new JLabel("Server response");
	    lblServerResponse.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
	    lblServerResponse.setForeground(new Color(124, 252, 0));
	    lblServerResponse.setBounds(168, 170, 107, 16);
	    login_pan.add(lblServerResponse);
	    
	    user_name = new JTextField();
	    user_name.setBounds(152, 94, 122, 28);
	    login_pan.add(user_name);
	    user_name.setColumns(10);
	    
	    JLabel lblNewLabel_1 = new JLabel("Enter User Name");
	    lblNewLabel_1.setForeground(new Color(124, 252, 0));
	    lblNewLabel_1.setBounds(31, 100, 109, 16);
	    login_pan.add(lblNewLabel_1);
	    
	    JButton login = new JButton("Login");
	    login.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		
	    		if(!(serverresponse.getText().equals("server saturated"))) {
	    		client.out.println(user_name.getText());
	    		int delay = 4000;
	    		Timer timer = new Timer( delay, new ActionListener(){
	    		  @Override
	    		  public void actionPerformed( ActionEvent e ){
	    			  if(serverresponse.getText().contains("Accepted")) {
	  	    			frame.setTitle(user_name.getText());
	  	    			login_pan.setVisible(false);
	  	    			cli_list.setVisible(true);
	  	    		} 
	    		  }
	    		} );
	    		timer.setRepeats( false );
	    		timer.start();
	    		
	    		}
	    		
	    	}
	    });
	    login.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
	    login.setBackground(Color.RED);
	    login.setBounds(300, 94, 90, 28);
	    login_pan.add(login);
	    
	    
	    chat_win2.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(chat_win2, "name_26139894976845");
	    chat_win2.setLayout(null);
	    chat_win2.setVisible(false);
	    arpan.add(chat_win2);
	    
	    JTextArea textArea = new JTextArea();
	    textArea.setRows(20);
	    textArea.setForeground(Color.ORANGE);
	    textArea.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    textArea.setEditable(false);
	    textArea.setBackground(Color.DARK_GRAY);
	    textArea.setBounds(0, 31, 318, 206);
	    chat_win2.add(textArea);
	    
	    
	    textField = new JTextField();
	    textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    textField.setColumns(10);
	    textField.setBackground(new Color(240, 255, 255));
	    textField.setBounds(0, 239, 327, 23);
	    chat_win2.add(textField);
	    
	    JButton button = new JButton("CLEAR");
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textArea.setText(null);
	    	}
	    });
	    button.setForeground(new Color(240, 248, 255));
	    button.setFont(new Font("SansSerif", Font.BOLD, 12));
	    button.setBackground(new Color(72, 61, 139));
	    button.setBounds(331, 0, 97, 23);
	    chat_win2.add(button);
	    
	    JButton button_11 = new JButton("SEND");
	    button_11.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		 synchronized(lock) {		
	                	
		    			cinput=textField.getText();
		    			textArea.append("\nyou >"+cinput);
		    			cinput=cinput+"#"+label_2.getText();
		    			textField.setText(null);
		    		     lock.notify();
		    		 }
	    		 
	    	}
	    });
	    button_11.setBackground(Color.RED);
	    button_11.setBounds(339, 240, 78, 23);
	    chat_win2.add(button_11);
	    
	    JButton button_12 = new JButton("Back");
	    button_12.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win2.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    button_12.setBackground(Color.MAGENTA);
	    button_12.setBounds(0, 0, 90, 19);
	    chat_win2.add(button_12);
	    
	   
	    label_2.setHorizontalAlignment(SwingConstants.CENTER);
	    label_2.setBounds(111, 0, 207, 31);
	    chat_win2.add(label_2);
	    
	    
	    chat_win3.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(chat_win3, "name_26140093111489");
	    chat_win3.setLayout(null);
	    chat_win3.setVisible(false);
		arpan.add(chat_win3);
	    
	    JTextArea textArea_1 = new JTextArea();
	    textArea_1.setRows(20);
	    textArea_1.setForeground(Color.ORANGE);
	    textArea_1.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    textArea_1.setEditable(false);
	    textArea_1.setBackground(Color.DARK_GRAY);
	    textArea_1.setBounds(10, 34, 318, 206);
	    chat_win3.add(textArea_1);
	    
	    
	    textField_1 = new JTextField();
	    textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    textField_1.setColumns(10);
	    textField_1.setBackground(new Color(240, 255, 255));
	    textField_1.setBounds(1, 239, 327, 23);
	    chat_win3.add(textField_1);
	    
	    JButton button_13 = new JButton("CLEAR");
	    button_13.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textArea_1.setText(null);
	    	}
	    });
	    button_13.setForeground(new Color(240, 248, 255));
	    button_13.setFont(new Font("SansSerif", Font.BOLD, 12));
	    button_13.setBackground(new Color(72, 61, 139));
	    button_13.setBounds(331, 0, 97, 23);
	    chat_win3.add(button_13);
	    
	    JButton button_14 = new JButton("SEND");
	    button_14.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		synchronized(lock) {		
                	
	    			cinput=textField_1.getText();
	    			textArea_1.append("\nyou >"+cinput);
	    			cinput=cinput+"#"+lblSup.getText();
	    			textField_1.setText(null);
	    		     lock.notify();
	    		 }
	    		
	    	}
	    });
	    button_14.setBackground(Color.RED);
	    button_14.setBounds(350, 233, 78, 23);
	    chat_win3.add(button_14);
	    
	    JButton button_15 = new JButton("Back");
	    button_15.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win3.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    button_15.setBackground(Color.MAGENTA);
	    button_15.setBounds(0, 0, 90, 19);
	    chat_win3.add(button_15);
	    
	    
	    lblSup.setHorizontalAlignment(SwingConstants.CENTER);
	    lblSup.setBounds(111, 6, 207, 31);
	    chat_win3.add(lblSup);
	    
	    
	    chat_win4.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(chat_win4, "name_26140467335755");
	    chat_win4.setLayout(null);
	    chat_win4.setVisible(false);
		arpan.add(chat_win4);
		
	    JTextArea textArea_2 = new JTextArea();
	    textArea_2.setRows(20);
	    textArea_2.setForeground(Color.ORANGE);
	    textArea_2.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    textArea_2.setEditable(false);
	    textArea_2.setBackground(Color.DARK_GRAY);
	    textArea_2.setBounds(10, 31, 318, 206);
	    chat_win4.add(textArea_2);
	    
	    
	    textField_2 = new JTextField();
	    textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    textField_2.setColumns(10);
	    textField_2.setBackground(new Color(240, 255, 255));
	    textField_2.setBounds(1, 234, 327, 23);
	    chat_win4.add(textField_2);
	    
	    JButton button_16 = new JButton("CLEAR");
	    button_16.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textArea_2.setText(null);
	    	}
	    });
	    button_16.setForeground(new Color(240, 248, 255));
	    button_16.setFont(new Font("SansSerif", Font.BOLD, 12));
	    button_16.setBackground(new Color(72, 61, 139));
	    button_16.setBounds(331, 6, 97, 23);
	    chat_win4.add(button_16);
	    
	    JButton button_17 = new JButton("SEND");
	    button_17.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
                    synchronized(lock) {		
                	cinput=textField_2.getText();
	    			textArea_2.append("\nyou >"+cinput);
	    			cinput=cinput+"#"+label_4.getText();
	    			textField_2.setText(null);
	    		     lock.notify();
	    		 }
	    		
	    	}
	    });
	    button_17.setBackground(Color.RED);
	    button_17.setBounds(340, 234, 78, 23);
	    chat_win4.add(button_17);
	    
	    JButton button_18 = new JButton("Back");
	    button_18.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win4.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    button_18.setBackground(Color.MAGENTA);
	    button_18.setBounds(0, 0, 90, 23);
	    chat_win4.add(button_18);
	    
	    
	    label_4.setHorizontalAlignment(SwingConstants.CENTER);
	    label_4.setBounds(113, -2, 207, 31);
	    chat_win4.add(label_4);
	    
	    
	    chat_win5.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(chat_win5, "name_26140578433233");
	    chat_win5.setLayout(null);
	    chat_win5.setVisible(false);
		arpan.add(chat_win5);
	    
	    JTextArea textArea_3 = new JTextArea();
	    textArea_3.setRows(20);
	    textArea_3.setForeground(Color.ORANGE);
	    textArea_3.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    textArea_3.setEditable(false);
	    textArea_3.setBackground(Color.DARK_GRAY);
	    textArea_3.setBounds(6, 33, 318, 206);
	    chat_win5.add(textArea_3);
	    	    
	    
	    textField_3 = new JTextField();
	    textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    textField_3.setColumns(10);
	    textField_3.setBackground(new Color(240, 255, 255));
	    textField_3.setBounds(6, 239, 327, 23);
	    chat_win5.add(textField_3);
	    
	    JButton button_19 = new JButton("CLEAR");
	    button_19.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textArea_3.setText(null);
	    	}
	    });
	    button_19.setForeground(new Color(240, 248, 255));
	    button_19.setFont(new Font("SansSerif", Font.BOLD, 12));
	    button_19.setBackground(new Color(72, 61, 139));
	    button_19.setBounds(331, 0, 97, 23);
	    chat_win5.add(button_19);
	    
	    JButton button_20 = new JButton("SEND");
	    button_20.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
                   synchronized(lock) {		
                	cinput=textField_3.getText();
	    			textArea_3.append("\nyou >"+cinput);
	    			cinput=cinput+"#"+label_5.getText();
	    			textField_3.setText(null);
	    		     lock.notify();
	    		 }
	    	}
	    });
	    button_20.setBackground(Color.RED);
	    button_20.setBounds(350, 234, 78, 23);
	    chat_win5.add(button_20);
	    
	    JButton button_21 = new JButton("Back");
	    button_21.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win5.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    button_21.setBackground(Color.MAGENTA);
	    button_21.setBounds(0, 0, 90, 19);
	    chat_win5.add(button_21);
	    
	   
	    label_5.setHorizontalAlignment(SwingConstants.CENTER);
	    label_5.setBounds(112, 6, 207, 31);
	    chat_win5.add(label_5);
	    
	    
	    chat_win6.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(chat_win6, "name_26140691247907");
	    chat_win6.setLayout(null);
	    chat_win6.setVisible(false);
		arpan.add(chat_win6);
		
	    JTextArea textArea_4 = new JTextArea();
	    textArea_4.setRows(20);
	    textArea_4.setForeground(Color.ORANGE);
	    textArea_4.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    textArea_4.setEditable(false);
	    textArea_4.setBackground(Color.DARK_GRAY);
	    textArea_4.setBounds(0, 31, 318, 206);
	    chat_win6.add(textArea_4);
	   
	    
	    textField_4 = new JTextField();
	    textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    textField_4.setColumns(10);
	    textField_4.setBackground(new Color(240, 255, 255));
	    textField_4.setBounds(0, 233, 327, 23);
	    chat_win6.add(textField_4);
	    
	    JButton button_22 = new JButton("CLEAR");
	    button_22.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textArea_4.setText(null);
	    	}
	    });
	    button_22.setForeground(new Color(240, 248, 255));
	    button_22.setFont(new Font("SansSerif", Font.BOLD, 12));
	    button_22.setBackground(new Color(72, 61, 139));
	    button_22.setBounds(331, 0, 97, 23);
	    chat_win6.add(button_22);
	    
	    JButton button_23 = new JButton("SEND");
	    button_23.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		synchronized(lock) {		
                	cinput=textField_4.getText();
	    			textArea_4.append("\nyou >"+cinput);
	    			cinput=cinput+"#"+label_6.getText();
	    			textField_4.setText(null);
	    		     lock.notify();
	    		 }
	    	}
	    });
	    button_23.setBackground(Color.RED);
	    button_23.setBounds(339, 234, 78, 23);
	    chat_win6.add(button_23);
	    
	    JButton button_24 = new JButton("Back");
	    button_24.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win6.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    button_24.setBackground(Color.MAGENTA);
	    button_24.setBounds(0, 0, 90, 19);
	    chat_win6.add(button_24);
	    
	    
	    label_6.setHorizontalAlignment(SwingConstants.CENTER);
	    label_6.setBounds(102, 3, 207, 31);
	    chat_win6.add(label_6);
	    
	    
	    chat_win7.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(chat_win7, "name_26140804715683");
	    chat_win7.setLayout(null);
	    chat_win7.setVisible(false);
		arpan.add(chat_win7);
	    
	    JTextArea textArea_5 = new JTextArea();
	    textArea_5.setRows(20);
	    textArea_5.setForeground(Color.ORANGE);
	    textArea_5.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    textArea_5.setEditable(false);
	    textArea_5.setBackground(Color.DARK_GRAY);
	    textArea_5.setBounds(0, 31, 318, 206);
	    chat_win7.add(textArea_5);
	   
	    
	    textField_5 = new JTextField();
	    textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    textField_5.setColumns(10);
	    textField_5.setBackground(new Color(240, 255, 255));
	    textField_5.setBounds(0, 233, 327, 23);
	    chat_win7.add(textField_5);
	    
	    JButton button_25 = new JButton("CLEAR");
	    button_25.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textArea_5.setText(null);
	    	}
	    });
	    button_25.setForeground(new Color(240, 248, 255));
	    button_25.setFont(new Font("SansSerif", Font.BOLD, 12));
	    button_25.setBackground(new Color(72, 61, 139));
	    button_25.setBounds(331, 0, 97, 23);
	    chat_win7.add(button_25);
	    
	    JButton button_26 = new JButton("SEND");
	    button_26.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		synchronized(lock) {		
                	cinput=textField_5.getText();
	    			textArea_5.append("\nyou >"+cinput);
	    			cinput=cinput+"#"+label_7.getText();
	    			textField_5.setText(null);
	    		     lock.notify();
	    		 }

	    	}
	    });
	    button_26.setBackground(Color.RED);
	    button_26.setBounds(339, 234, 78, 23);
	    chat_win7.add(button_26);
	    
	    JButton button_27 = new JButton("Back");
	    button_27.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win7.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    button_27.setBackground(Color.MAGENTA);
	    button_27.setBounds(0, 2, 90, 21);
	    chat_win7.add(button_27);
	    
	    
	    label_7.setHorizontalAlignment(SwingConstants.CENTER);
	    label_7.setBounds(111, 6, 207, 31);
	    chat_win7.add(label_7);
	    
	    
	    chat_win8.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(chat_win8, "name_26140929959838");
	    chat_win8.setLayout(null);
	    chat_win8.setVisible(false);
		arpan.add(chat_win8);
		
	    JTextArea textArea_6 = new JTextArea();
	    textArea_6.setRows(20);
	    textArea_6.setForeground(Color.ORANGE);
	    textArea_6.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    textArea_6.setEditable(false);
	    textArea_6.setBackground(Color.DARK_GRAY);
	    textArea_6.setBounds(0, 34, 318, 206);
	    chat_win8.add(textArea_6);
	 
	    
	    textField_6 = new JTextField();
	    textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    textField_6.setColumns(10);
	    textField_6.setBackground(new Color(240, 255, 255));
	    textField_6.setBounds(0, 239, 327, 23);
	    chat_win8.add(textField_6);
	    
	    JButton button_28 = new JButton("CLEAR");
	    button_28.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textArea_6.setText(null);
	    	}
	    });
	    button_28.setForeground(new Color(240, 248, 255));
	    button_28.setFont(new Font("SansSerif", Font.BOLD, 12));
	    button_28.setBackground(new Color(72, 61, 139));
	    button_28.setBounds(331, 0, 97, 23);
	    chat_win8.add(button_28);
	    
	    JButton button_29 = new JButton("SEND");
	    button_29.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		synchronized(lock) {		
                	cinput=textField_6.getText();
	    			textArea_6.append("\nyou >"+cinput);
	    			cinput=cinput+"#"+label_8.getText();
	    			textField_6.setText(null);
	    		     lock.notify();
	    		 }
	    	}
	    });
	    button_29.setBackground(Color.RED);
	    button_29.setBounds(339, 240, 78, 23);
	    chat_win8.add(button_29);
	    
	    JButton button_30 = new JButton("Back");
	    button_30.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win8.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    button_30.setBackground(Color.MAGENTA);
	    button_30.setBounds(0, 0, 90, 22);
	    chat_win8.add(button_30);
	    
	    
	    label_8.setHorizontalAlignment(SwingConstants.CENTER);
	    label_8.setBounds(112, 6, 207, 31);
	    chat_win8.add(label_8);
	    
	    
	    chat_win9.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(chat_win9, "name_26141048766265");
	    chat_win9.setLayout(null);
	    chat_win9.setVisible(false);
		arpan.add(chat_win9);
		
	    JTextArea textArea_7 = new JTextArea();
	    textArea_7.setRows(20);
	    textArea_7.setForeground(Color.ORANGE);
	    textArea_7.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    textArea_7.setEditable(false);
	    textArea_7.setBackground(Color.DARK_GRAY);
	    textArea_7.setBounds(19, 30, 318, 206);
	    chat_win9.add(textArea_7);
	    
	    
	    textField_7 = new JTextField();
	    textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    textField_7.setColumns(10);
	    textField_7.setBackground(new Color(240, 255, 255));
	    textField_7.setBounds(10, 233, 327, 23);
	    chat_win9.add(textField_7);
	    
	    JButton button_31 = new JButton("CLEAR");
	    button_31.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textArea_7.setText(null);
	    	}
	    });
	    button_31.setForeground(new Color(240, 248, 255));
	    button_31.setFont(new Font("SansSerif", Font.BOLD, 12));
	    button_31.setBackground(new Color(72, 61, 139));
	    button_31.setBounds(331, 0, 97, 23);
	    chat_win9.add(button_31);
	    
	    JButton button_32 = new JButton("SEND");
	    button_32.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		synchronized(lock) {		
                	cinput=textField_7.getText();
	    			textArea_7.append("\nyou >"+cinput);
	    			cinput=cinput+"#"+label_9.getText();
	    			textField_7.setText(null);
	    		     lock.notify();
	    		 }
	    	}
	    });
	    button_32.setBackground(Color.RED);
	    button_32.setBounds(349, 234, 78, 23);
	    chat_win9.add(button_32);
	    
	    JButton button_33 = new JButton("Back");
	    button_33.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win9.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    button_33.setBackground(Color.MAGENTA);
	    button_33.setBounds(0, 0, 90, 19);
	    chat_win9.add(button_33);
	    
	    label_9.setHorizontalAlignment(SwingConstants.CENTER);
	    label_9.setBounds(101, 0, 207, 31);
	    chat_win9.add(label_9);
	    
	    
	    chat_win10.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(chat_win10, "name_26141163035025");
	    chat_win10.setLayout(null);
	    chat_win10.setVisible(false);
		arpan.add(chat_win10);
	    
	    JTextArea textArea_8 = new JTextArea();
	    textArea_8.setRows(20);
	    textArea_8.setForeground(Color.ORANGE);
	    textArea_8.setFont(new Font("Arial Narrow", Font.BOLD, 14));
	    textArea_8.setEditable(false);
	    textArea_8.setBackground(Color.DARK_GRAY);
	    textArea_8.setBounds(25, 32, 318, 206);
	    chat_win10.add(textArea_8);
	    
	    
	    textField_8 = new JTextField();
	    textField_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    textField_8.setColumns(10);
	    textField_8.setBackground(new Color(240, 255, 255));
	    textField_8.setBounds(16, 239, 327, 23);
	    chat_win10.add(textField_8);
	    
	    JButton button_34 = new JButton("CLEAR");
	    button_34.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textArea_8.setText(null);
	    	}
	    });
	    button_34.setForeground(new Color(240, 248, 255));
	    button_34.setFont(new Font("SansSerif", Font.BOLD, 12));
	    button_34.setBackground(new Color(72, 61, 139));
	    button_34.setBounds(331, 0, 97, 23);
	    chat_win10.add(button_34);
	    
	    JButton button_35 = new JButton("SEND");
	    button_35.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		synchronized(lock) {		
                	cinput=textField_8.getText();
	    			textArea_8.append("\nyou >"+cinput);
	    			cinput=cinput+"#"+label_10.getText();
	    			textField_8.setText(null);
	    		     lock.notify();
	    		 }
	    	}
	    });
	    button_35.setBackground(Color.RED);
	    button_35.setBounds(345, 234, 78, 23);
	    chat_win10.add(button_35);
	    
	    JButton button_36 = new JButton("Back");
	    button_36.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		chat_win10.setVisible(false);
	    		cli_list.setVisible(true);
	    	}
	    });
	    button_36.setBackground(Color.MAGENTA);
	    button_36.setBounds(0, 0, 90, 19);
	    chat_win10.add(button_36);
	    
	    
	    label_10.setHorizontalAlignment(SwingConstants.CENTER);
	    label_10.setBounds(112, 4, 207, 31);
	    chat_win10.add(label_10);
	    
	    client_send.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	                 synchronized(lock) {		
	                	
	    			cinput=client_type.getText();
	    			client_text_area.setText(client_text_area.getText()+"\nyou >"+cinput);
	    			cinput=cinput+"#"+lblYo.getText();
	    		     client_type.setText(null);
	    		     lock.notify();
	    		 }
	    	}
	    });
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		client_text_area.setText(null);
	    	}
	    });
	}
}

