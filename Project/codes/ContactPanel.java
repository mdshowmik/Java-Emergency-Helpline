package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class ContactPanel extends JPanel{
	
	JButton back;
	
	JTextField contact;
	
	private static ContactPanel contactp=null;
	
	public ContactPanel(){
		
		this.setBounds(0, 0, 850, 500);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		back=new JButton("Back");
		this.back.setBounds(30, 30, 100, 30);
		this.add(back);
		
		contact=new JTextField("  For any kind of help & support e-mail us at bd.showmik@gmail.com");
		this.contact.setBounds(220,100,400,100);
		this.contact.setEditable(false);
		this.contact.setBackground(Color.white);
		this.add(contact);
		
		EventHandler eh=new EventHandler(this);
		this.back.addActionListener(eh);
		
	}
	
	
	public static ContactPanel getContactPanelRef(){
		if(contactp==null){
			contactp = new ContactPanel();
		}
		return contactp; 
	}
	
}