package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.image.BufferedImage;



class ServicePanel extends JPanel{
	JButton HospitalServiceButton;
	JButton PoliceServiceButton;
	JButton FireServiceButton;
	JButton AmbulanceServiceButton;
	JButton ATMServiceButton;
	JButton TaxiServiceButton;
	JButton About;
	JButton Contact;
	JButton Admin;
	
	private static ServicePanel sp=null;
	
	public ServicePanel(){
		
		this.setBounds(0, 0, 850, 500);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		ImageIcon icon0 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\Capture.PNG");	
        JLabel label0 = new JLabel();
        label0.setBounds(190, 20, 550, 150);
        label0.setIcon(icon0);
		this.add(label0);
		
		ImageIcon icon1 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\logo.PNG");	
        JLabel label1 = new JLabel();
        label1.setBounds(120, 40, 125, 80);
        label1.setIcon(icon1);
		this.add(label1);
		
		ImageIcon icon2 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\hospital.png");
		HospitalServiceButton=new JButton("Hospital");
		HospitalServiceButton.setBounds(150, 200, 180, 70);
		HospitalServiceButton.setIcon(icon2);
		this.HospitalServiceButton.setBackground(Color.lightGray);
		this.add(HospitalServiceButton);
		
		ImageIcon icon3 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\police.png");	
		PoliceServiceButton=new JButton("Police Station");
		PoliceServiceButton.setBounds(330, 200, 180, 70);
		PoliceServiceButton.setIcon(icon3);
		this.PoliceServiceButton.setBackground(Color.lightGray);
		this.add(PoliceServiceButton);
		
		ImageIcon icon4 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\firefighter.png");
		FireServiceButton=new JButton("Fire Service");
		FireServiceButton.setBounds(510, 200, 180, 70);
		FireServiceButton.setIcon(icon4);
		this.FireServiceButton.setBackground(Color.lightGray);
		this.add(FireServiceButton);
		
		ImageIcon icon5 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\ambulance.png");
		AmbulanceServiceButton=new JButton("Ambulance");
		AmbulanceServiceButton.setBounds(150, 270, 180, 70);
		AmbulanceServiceButton.setIcon(icon5);
		this.AmbulanceServiceButton.setBackground(Color.lightGray);
		this.add(AmbulanceServiceButton);
		
		ImageIcon icon6 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\atm.png");
		ATMServiceButton=new JButton("ATM Booth");
		ATMServiceButton.setBounds(330, 270, 180, 70);
		ATMServiceButton.setIcon(icon6);
		this.ATMServiceButton.setBackground(Color.lightGray);
		this.add(ATMServiceButton);
		
		ImageIcon icon7 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\taxi.png");
		TaxiServiceButton=new JButton("Taxi Service");
		TaxiServiceButton.setBounds(510, 270, 180, 70);
		TaxiServiceButton.setIcon(icon7);
		this.TaxiServiceButton.setBackground(Color.lightGray);
		this.add(TaxiServiceButton);
		
		About=new JButton("ABOUT US");
		About.setBounds(580, 400, 100, 30);
		this.About.setBackground(Color.lightGray);
		this.add(About);
		
		Contact=new JButton("CONTACT US");
		Contact.setBounds(680, 400, 120, 30);
		this.Contact.setBackground(Color.lightGray);
		this.add(Contact);
		
		Admin=new JButton("ADMIN");
		Admin.setBounds(10, 400, 120, 30);
		this.Admin.setBackground(Color.lightGray);
		this.add(Admin);
		
		EventHandler eh=new EventHandler(this);
		
		this.HospitalServiceButton.addActionListener(eh);
		this.PoliceServiceButton.addActionListener(eh);
		this.FireServiceButton.addActionListener(eh);
		this.AmbulanceServiceButton.addActionListener(eh);
		this.ATMServiceButton.addActionListener(eh);
		this.TaxiServiceButton.addActionListener(eh);
		this.About.addActionListener(eh);
		this.Contact.addActionListener(eh);
		this.Admin.addActionListener(eh);
		
	}
	
	public static ServicePanel getServicePanelRef(){
		if(sp==null){
			sp = new ServicePanel();
		}
		return sp; 
	}	
}