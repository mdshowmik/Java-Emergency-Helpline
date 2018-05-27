package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class AdminPanel extends JPanel{
	
	JButton back;
	JButton login;
	
	JLabel username;
	JLabel password;
	
	JTextField usernameField;
	JPasswordField passwordField;
	
	private static AdminPanel adminp=null;
	
	public AdminPanel(){
		
		this.setBounds(0, 0, 850, 500);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		back=new JButton("Back");
		this.back.setBounds(30, 30, 100, 30);
		this.add(back);
		
		username=new JLabel("User Name");
		this.username.setBounds(200,100,80,20);
		this.add(username);
		
		usernameField=new JTextField();
		this.usernameField.setBounds(275,100,150,30);
		this.add(usernameField);
		
		password=new JLabel("Password");
		this.password.setBounds(200,160,80,20);
		this.add(password);
		
		passwordField=new JPasswordField();
		this.passwordField.setBounds(275,160,150,30);
		this.add(passwordField);
		
		login=new JButton("Log In");
		this.login.setBounds(350, 210, 75, 30);
		this.add(login);
		
		EventHandler eh=new EventHandler(this);
		this.back.addActionListener(eh);
		LogInHandler lh=new LogInHandler(this);
		this.login.addActionListener(lh);
		
	}
	
	
	public static AdminPanel getAdminPanelRef(){
		if(adminp==null){
			adminp = new AdminPanel();
		}
		return adminp; 
	}
	
}