package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;


class ATMPanel extends JPanel{

	JButton back;
	
	JComboBox atmCombo;
	JComboBox districtcombo;
	
	JLabel district;
	JLabel atmArea;
	JLabel name;
	JLabel location;
	JLabel number;
	
	JTextField nameField;
	JTextField locationField;
	JTextField numberField;
	
	private static ATMPanel ap=null;
	
	public ATMPanel(){
		
		this.setBounds(0, 0, 850, 500);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("E:\\STUDY\\6TH SEMESTER\\Object Oriented Programming 1\\Project\\image\\atms.PNG");	
        JLabel label1 = new JLabel();
        label1.setBounds(634, 0, 250, 460);
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
		
		ArrayList<District> ATMDistrictList=DBDataProvider.getATMDistrictList();
		
		for(District district:ATMDistrictList){
			this.districtcombo.addItem(district.getDistrictName());
		}
		
		atmArea=new JLabel("Area");
		this.atmArea.setBounds(200,160,80,20);
		this.add(atmArea);
		
		atmCombo=new JComboBox();
		this.atmCombo.setBounds(260,160,150,30);
		this.add(atmCombo);
		
		ArrayList<Area> ATMAreaList=DBDataProvider.getATMAreaList();
		
		for(Area area:ATMAreaList){
			this.atmCombo.addItem(area.getAreaName());
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
		
		ATMAreaHandler atmah=new ATMAreaHandler(this);
		this.atmCombo.addActionListener(atmah);
		
	}
	
	
	
	public static ATMPanel getATMPanelRef(){
		if(ap==null){
			ap = new ATMPanel();
		}
		return ap; 
	}
}