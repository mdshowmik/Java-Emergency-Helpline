package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class UpdatePanel extends JPanel{
	
	JButton logout;
	JButton update;
	
	JButton UpdateHospital;
	JButton UpdatePolice;
	JButton UpdateFireService;
	JButton UpdateAmbulanceService;
	JButton UpdateATM;
	JButton UpdateTaxiService;
	
	private static UpdatePanel updatep=null;
	
	public UpdatePanel(){
		
		this.setBounds(0, 0, 850, 500);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		logout=new JButton("Log Out");
		this.logout.setBounds(30, 30, 100, 30);
		this.add(logout);
		
		ImageIcon icon2 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Java Final\\project\\image\\hospital.png");
		UpdateHospital=new JButton("Up Hospital");
		UpdateHospital.setBounds(150, 200, 180, 70);
		UpdateHospital.setIcon(icon2);
		this.UpdateHospital.setBackground(Color.lightGray);
		this.add(UpdateHospital);
		
		ImageIcon icon3 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Java Final\\project\\image\\police.png");	
		UpdatePolice=new JButton("Up Police Station");
		UpdatePolice.setBounds(330, 200, 180, 70);
		UpdatePolice.setIcon(icon3);
		this.UpdatePolice.setBackground(Color.lightGray);
		this.add(UpdatePolice);
		
		ImageIcon icon4 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Java Final\\project\\image\\firefighter.png");
		UpdateFireService=new JButton("Up Fire Service");
		UpdateFireService.setBounds(510, 200, 180, 70);
		UpdateFireService.setIcon(icon4);
		this.UpdateFireService.setBackground(Color.lightGray);
		this.add(UpdateFireService);
		
		ImageIcon icon5 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Java Final\\project\\image\\ambulance.png");
		UpdateAmbulanceService=new JButton("Up Ambulance");
		UpdateAmbulanceService.setBounds(150, 270, 180, 70);
		UpdateAmbulanceService.setIcon(icon5);
		this.UpdateAmbulanceService.setBackground(Color.lightGray);
		this.add(UpdateAmbulanceService);
		
		ImageIcon icon6 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Java Final\\project\\image\\atm.png");
		UpdateATM=new JButton("Up ATM Booth");
		UpdateATM.setBounds(330, 270, 180, 70);
		UpdateATM.setIcon(icon6);
		this.UpdateATM.setBackground(Color.lightGray);
		this.add(UpdateATM);
		
		ImageIcon icon7 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Java Final\\project\\image\\taxi.png");
		UpdateTaxiService=new JButton("Up Taxi Service");
		UpdateTaxiService.setBounds(510, 270, 180, 70);
		UpdateTaxiService.setIcon(icon7);
		this.UpdateTaxiService.setBackground(Color.lightGray);
		this.add(UpdateTaxiService);
	
	
		EventHandler eh=new EventHandler(this);
		this.logout.addActionListener(eh);
		this.UpdatePolice.addActionListener(eh);
                this.UpdateAmbulanceService.addActionListener(eh);
                this.UpdateATM.addActionListener(eh);
                this.UpdateFireService.addActionListener(eh);
                this.UpdateTaxiService.addActionListener(eh);
                this.UpdateHospital.addActionListener(eh);
		
	}
	
	
	public static UpdatePanel getUpdatePanelRef(){
		if(updatep==null){
			updatep = new UpdatePanel();
		}
		return updatep; 
	}
	
}