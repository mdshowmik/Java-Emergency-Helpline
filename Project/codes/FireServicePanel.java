package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;


class FireServicePanel extends JPanel{

	JButton back;
	
	JComboBox fireserviceCombo;
	JComboBox districtcombo;
	
	JLabel district;
	JLabel fireserviceArea;
	JLabel name;
	JLabel location;
	JLabel number;
	
	JTextField nameField;
	JTextField locationField;
	JTextField numberField;
	
	private static FireServicePanel fsp=null;
	
	public FireServicePanel(){
		
		this.setBounds(0, 0, 850, 500);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\fire.PNG");	
        JLabel label1 = new JLabel();
        label1.setBounds(645, 0, 250, 463);
        label1.setIcon(icon1);
		this.add(label1);
		
		back=new JButton("Back");
		this.back.setBounds(30, 30, 100, 30);
		this.add(back);
		
		district=new JLabel("District");
		this.district.setBounds(200,100,80,20);
		this.add(district);
		
		districtcombo=new JComboBox();
		this.districtcombo.setBounds(260,100,150,30);
		this.add(districtcombo);
		
		ArrayList<District> FSDistrictList=DBDataProvider.getFSDistrictList();
		
		for(District district:FSDistrictList){
			this.districtcombo.addItem(district.getDistrictName());
		}
		
		fireserviceArea=new JLabel("Area");
		this.fireserviceArea.setBounds(200,160,80,20);
		this.add(fireserviceArea);
		
		fireserviceCombo=new JComboBox();
		this.fireserviceCombo.setBounds(260,160,150,30);
		this.add(fireserviceCombo);
		
		ArrayList<Area> FSAreaList=DBDataProvider.getFSAreaList();
		
		for(Area area:FSAreaList){
			this.fireserviceCombo.addItem(area.getAreaName());
		}
		
		name=new JLabel("Name:");
		this.name.setBounds(200,230,80,30);
		this.add(name);
		
		nameField=new JTextField();
		this.nameField.setBounds(265,230,280,30);
		this.nameField.setEditable(false);
		//this.nameField.setForeground(Color.blue);
		this.add(nameField);
		
		location=new JLabel("Location:");
		this.location.setBounds(200,280,80,30);
		this.add(location);
		
		locationField=new JTextField();
		this.locationField.setBounds(265,280,280,30);
		this.locationField.setEditable(false);
		this.add(locationField);
		
		number=new JLabel("Number:");
		this.number.setBounds(200,330,80,30);
		this.add(number);
		
		numberField=new JTextField();
		this.numberField.setBounds(265,330,280,30);
		this.numberField.setEditable(false);
		this.add(numberField);
		
		
		EventHandler eh=new EventHandler(this);
		
		this.back.addActionListener(eh);
		
		FSAreaHandler fsah=new FSAreaHandler(this);
		this.fireserviceCombo.addActionListener(fsah);
		
	}
	
	public static FireServicePanel getFireServicePanelRef(){
		if(fsp==null){
			fsp = new FireServicePanel();
		}
		return fsp; 
	}
}