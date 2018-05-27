package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class AboutPanel extends JPanel{
	
	JButton back;
	JTextField about;
	
	private static AboutPanel aboutp=null;
	
	public AboutPanel(){
		
		this.setBounds(0, 0, 850, 500);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		back=new JButton("Back");
		this.back.setBounds(30, 30, 100, 30);
		this.add(back);
		
		about=new JTextField("  Here you will find information about police station,hospital,ambulance service,fire service,atm booth,taxi service.Thank you for using our service.");
		this.about.setBounds(15,100,800,80);
		this.about.setEditable(false);
		this.about.setBackground(Color.white);
		this.add(about);
		
		EventHandler eh=new EventHandler(this);
		this.back.addActionListener(eh);
		
	}
	
	
	public static AboutPanel getAboutPanelRef(){
		if(aboutp==null){
			aboutp = new AboutPanel();
		}
		return aboutp; 
	}
	
}