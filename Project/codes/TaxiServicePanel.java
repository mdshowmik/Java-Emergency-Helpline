package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;


class TaxiServicePanel extends JPanel{

	JButton back;
	
	JComboBox taxiserviceCombo;
	JComboBox districtcombo;
	
	JLabel district;
	JLabel taxiArea;
	JLabel name;
	JLabel location;
	JLabel number;
	
	JTextField nameField;
	JTextField locationField;
	JTextField numberField;
	
	private static TaxiServicePanel tsp=null;
	
	public TaxiServicePanel(){
		
		this.setBounds(0, 0, 850, 500);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\taxis.PNG");	
        JLabel label1 = new JLabel();
        label1.setBounds(638, 0, 250, 460);
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
		
		ArrayList<District> TSDistrictList=DBDataProvider.getTSDistrictList();
		
		for(District district:TSDistrictList){
			this.districtcombo.addItem(district.getDistrictName());
		}
		
		taxiArea=new JLabel("Area");
		this.taxiArea.setBounds(200,160,80,20);
		this.add(taxiArea);
		
		taxiserviceCombo=new JComboBox();
		this.taxiserviceCombo.setBounds(260,160,150,30);
		this.add(taxiserviceCombo);
		
		ArrayList<Area> TSAreaList=DBDataProvider.getTSAreaList();
		
		for(Area area:TSAreaList){
			this.taxiserviceCombo.addItem(area.getAreaName());
		}
		
		
		name=new JLabel("Name:");
		this.name.setBounds(200,230,80,30);
		this.add(name);
		
		nameField=new JTextField();
		this.nameField.setBounds(265,230,280,30);
		this.nameField.setEditable(false);
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
		
		TSAreaHandler tsah=new TSAreaHandler(this);
		this.taxiserviceCombo.addActionListener(tsah);
		
	}
	
	
	public static TaxiServicePanel getTaxiServicePanelRef(){
		if(tsp==null){
			tsp = new TaxiServicePanel();
		}
		return tsp; 
	}
}