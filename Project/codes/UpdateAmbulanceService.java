package codes;

import java.awt.Color;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class UpdateAmbulanceService extends JPanel{

	JButton BACK;
	JButton update;
	
	JLabel id;
	JLabel district;
	JLabel policeArea;
	JLabel name;
	JLabel location;
	JLabel number;
	
	JTextField idField;
	JTextField districtField;
	JTextField areaField;
	JTextField nameField;
	JTextField locationField;
	JTextField numberField;
	
	private static UpdateAmbulanceService uas=null;
	
	public UpdateAmbulanceService(){
		
		this.setBounds(0, 0, 850, 500);
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		
		BACK=new JButton("BACK");
		this.BACK.setBounds(30, 30, 100, 30);
		this.add(BACK);
		
		id=new JLabel("ID");
		this.id.setBounds(200,40,80,20);
		this.add(id);
		
		idField=new JTextField();
		this.idField.setBounds(260,40,280,30);
		this.add(idField);
		
		
		district=new JLabel("District");
		this.district.setBounds(200,100,80,20);
		this.add(district);
		
		districtField=new JTextField();
		this.districtField.setBounds(260,100,280,30);
		this.add(districtField);

		policeArea=new JLabel("Area");
		this.policeArea.setBounds(200,160,80,20);
		this.add(policeArea);
		
		areaField=new JTextField();
		this.areaField.setBounds(260,160,280,30);
		this.add(areaField);
		
		name=new JLabel("Name");
		this.name.setBounds(200,220,80,30);
		this.add(name);
		
		nameField=new JTextField();
		this.nameField.setBounds(260,220,280,30);
		this.add(nameField);
		
		location=new JLabel("Location");
		this.location.setBounds(200,280,80,30);
		this.add(location);
		
		locationField=new JTextField();
		this.locationField.setBounds(260,280,280,30);
		this.add(locationField);
		
		number=new JLabel("Number");
		this.number.setBounds(200,340,80,30);
		this.add(number);
		
		numberField=new JTextField();
		this.numberField.setBounds(260,340,280,30);
		this.add(numberField);
		
		update=new JButton("Update");
		this.update.setBounds(440,390,100,30);
		this.add(update);
		
		
		EventHandler eh=new EventHandler(this);
		this.BACK.addActionListener(eh);
		
        UpdateAmbulanceServiceHandler uash=new UpdateAmbulanceServiceHandler(this);
		this.update.addActionListener(uash);
		
	}

	
	public static UpdateAmbulanceService getUpdateAmbulanceServiceRef(){
		if(uas==null){
			uas = new UpdateAmbulanceService();
		}
		return uas; 
	}

    }



    

