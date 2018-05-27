package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EventHandler implements ActionListener{
	
	ServicePanel sp;
	PolicePanel pp;
	ATMPanel ap;
	AmbulanceServicePanel asp;
	HospitalServicePanel hsp;
	FireServicePanel fsp;
	TaxiServicePanel tsp;
	AboutPanel aboutp;
	ContactPanel contactp;
	AdminPanel adminp;
	UpdatePanel updatep;
	UpdatePolice up;
    UpdateAmbulanceService uas;
	UpdateHospital uh;
	UpdateATM uat;
    UpdateFireService ufs;
    UpdateTaxiService uts;
	
	public EventHandler(ServicePanel sp){
		
		this.sp = sp;
	}
	
	public EventHandler(PolicePanel pp){
		
		this.pp = pp;
	}
	
	public EventHandler(ATMPanel ap){
		
		this.ap = ap;
	}
	
	public EventHandler(AmbulanceServicePanel asp){
		
		this.asp = asp;
	}
	
	public EventHandler(HospitalServicePanel hsp){
		
		this.hsp = hsp;
	}
	
	public EventHandler(FireServicePanel fsp){
		
		this.fsp = fsp;
	}
	
	public EventHandler(TaxiServicePanel tsp){
		
		this.tsp = tsp;
	}
	
	public EventHandler(AboutPanel aboutp){
		
		this.aboutp = aboutp;
	}
	
	public EventHandler(ContactPanel contactp){
		
		this.contactp = contactp;
	}
	
	public EventHandler(AdminPanel adminp){
		
		this.adminp = adminp;
	}
	
	public EventHandler(UpdatePanel updatep){
		
		this.updatep = updatep;
	}

  
	public EventHandler(UpdatePolice up){
		
		this.up = up;
	}
        
       

     public EventHandler( UpdateAmbulanceService uas){
		
		this.uas = uas;
	}

    public EventHandler(UpdateHospital uh){
        this.uh = uh;
    }
     
    public EventHandler(UpdateATM uat){
        this.uat = uat;
    }

    public EventHandler(UpdateFireService ufs) {
        this.ufs = ufs;
    }

  
    public EventHandler(UpdateTaxiService uts) {
        this.uts = uts;
    }
	
	
	public void actionPerformed(ActionEvent e){
	if(e.getActionCommand().equals("Hospital")){
			
			System.out.println("Hospital");
			
			EmergencyServiceProgram.getEmergencyRef().remove(ServicePanel.getServicePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(HospitalServicePanel.getHospitalServicePanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Police Station")){
			
			System.out.println("Police");
			
			EmergencyServiceProgram.getEmergencyRef().remove(ServicePanel.getServicePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(PolicePanel.getPolicePanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Fire Service")){
			
			System.out.println("Fire Service");
			
			EmergencyServiceProgram.getEmergencyRef().remove(ServicePanel.getServicePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(FireServicePanel.getFireServicePanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Ambulance")){
			
			System.out.println("Ambulance");
			
			EmergencyServiceProgram.getEmergencyRef().remove(ServicePanel.getServicePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(AmbulanceServicePanel.getAmbulanceServicePanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("ATM Booth")){
			
			System.out.println("ATM Booth");
			
			EmergencyServiceProgram.getEmergencyRef().remove(ServicePanel.getServicePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(ATMPanel.getATMPanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Taxi Service")){
			
			System.out.println("Taxi Service");
			
			EmergencyServiceProgram.getEmergencyRef().remove(ServicePanel.getServicePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(TaxiServicePanel.getTaxiServicePanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("ABOUT US")){
			
			System.out.println("Show About US");
			
			EmergencyServiceProgram.getEmergencyRef().remove(ServicePanel.getServicePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(AboutPanel.getAboutPanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("CONTACT US")){
			
			System.out.println("Show Contact US");
			
			EmergencyServiceProgram.getEmergencyRef().remove(ServicePanel.getServicePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(ContactPanel.getContactPanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("ADMIN")){
			
			System.out.println("Show Admin Site");
			
			EmergencyServiceProgram.getEmergencyRef().remove(ServicePanel.getServicePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(AdminPanel.getAdminPanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Log Out")){
			
			System.out.println("Back to admin site");
			AdminPanel.getAdminPanelRef().usernameField.setText("");
			AdminPanel.getAdminPanelRef().passwordField.setText(""); 
			EmergencyServiceProgram.getEmergencyRef().remove(UpdatePanel.getUpdatePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(AdminPanel.getAdminPanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Up Police Station")){
			
			System.out.println("Update Police");
		    EmergencyServiceProgram.getEmergencyRef().remove(UpdatePanel.getUpdatePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdatePolice.getUpdatePoliceRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
        if(e.getActionCommand().equals("Up Ambulance")){
			
			System.out.println("Update Ambulance");
		    EmergencyServiceProgram.getEmergencyRef().remove(UpdatePanel.getUpdatePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdateAmbulanceService.getUpdateAmbulanceServiceRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
        if(e.getActionCommand().equals("Up Hospital")){
			
			System.out.println("Update Hospital");
		    EmergencyServiceProgram.getEmergencyRef().remove(UpdatePanel.getUpdatePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdateHospital.getUpdateHospitalRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Up ATM Booth")){
			
			System.out.println("Update ATM");
		    EmergencyServiceProgram.getEmergencyRef().remove(UpdatePanel.getUpdatePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdateATM.getUpdateATMRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Up Fire Service")){
			
			System.out.println("Update Fire Service");
		    EmergencyServiceProgram.getEmergencyRef().remove(UpdatePanel.getUpdatePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdateFireService.getUpdateFireServiceRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Up Taxi Service")){
			
			System.out.println("Update Taxi Service");
		    EmergencyServiceProgram.getEmergencyRef().remove(UpdatePanel.getUpdatePanelRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdateTaxiService.getUpdateTaxiServiceRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}  
		if(e.getActionCommand().equals("BACK")){
			
			System.out.println("Back to Update Panel");
			UpdatePolice.getUpdatePoliceRef().idField.setText("");
			UpdatePolice.getUpdatePoliceRef().districtField.setText("");
			UpdatePolice.getUpdatePoliceRef().areaField.setText("");
			UpdatePolice.getUpdatePoliceRef().nameField.setText(""); 
			UpdatePolice.getUpdatePoliceRef().locationField.setText("");
			UpdatePolice.getUpdatePoliceRef().numberField.setText(""); 
			EmergencyServiceProgram.getEmergencyRef().remove(UpdatePolice.getUpdatePoliceRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdatePanel.getUpdatePanelRef());
            
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().idField.setText("");
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().districtField.setText("");
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().areaField.setText("");
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().nameField.setText(""); 
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().locationField.setText("");
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().numberField.setText("");
            EmergencyServiceProgram.getEmergencyRef().remove(UpdateAmbulanceService.getUpdateAmbulanceServiceRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdatePanel.getUpdatePanelRef());
             
			UpdateHospital.getUpdateHospitalRef().idField.setText("");
			UpdateHospital.getUpdateHospitalRef().districtField.setText("");
			UpdateHospital.getUpdateHospitalRef().areaField.setText("");
			UpdateHospital.getUpdateHospitalRef().nameField.setText(""); 
			UpdateHospital.getUpdateHospitalRef().locationField.setText("");
			UpdateHospital.getUpdateHospitalRef().numberField.setText(""); 
            EmergencyServiceProgram.getEmergencyRef().remove(UpdateHospital.getUpdateHospitalRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdatePanel.getUpdatePanelRef());
            
            UpdateATM.getUpdateATMRef().idField.setText("");
			UpdateATM.getUpdateATMRef().districtField.setText("");
			UpdateATM.getUpdateATMRef().areaField.setText("");
			UpdateATM.getUpdateATMRef().nameField.setText(""); 
			UpdateATM.getUpdateATMRef().locationField.setText("");
			UpdateATM.getUpdateATMRef().numberField.setText(""); 
            EmergencyServiceProgram.getEmergencyRef().remove(UpdateATM.getUpdateATMRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdatePanel.getUpdatePanelRef());
            
            UpdateFireService.getUpdateFireServiceRef().idField.setText("");
			UpdateFireService.getUpdateFireServiceRef().districtField.setText("");
			UpdateFireService.getUpdateFireServiceRef().areaField.setText("");
			UpdateFireService.getUpdateFireServiceRef().nameField.setText(""); 
			UpdateFireService.getUpdateFireServiceRef().locationField.setText("");
			UpdateFireService.getUpdateFireServiceRef().numberField.setText(""); 
            EmergencyServiceProgram.getEmergencyRef().remove(UpdateFireService.getUpdateFireServiceRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdatePanel.getUpdatePanelRef());
			
			UpdateTaxiService.getUpdateTaxiServiceRef().idField.setText("");
			UpdateTaxiService.getUpdateTaxiServiceRef().districtField.setText("");
			UpdateTaxiService.getUpdateTaxiServiceRef().areaField.setText("");
			UpdateTaxiService.getUpdateTaxiServiceRef().nameField.setText(""); 
			UpdateTaxiService.getUpdateTaxiServiceRef().locationField.setText("");
			UpdateTaxiService.getUpdateTaxiServiceRef().numberField.setText(""); 
            EmergencyServiceProgram.getEmergencyRef().remove(UpdateTaxiService.getUpdateTaxiServiceRef());
			EmergencyServiceProgram.getEmergencyRef().add(UpdatePanel.getUpdatePanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		if(e.getActionCommand().equals("Back")){
			
			System.out.println("Back");
			
			//removing current panel
			PolicePanel.getPolicePanelRef().nameField.setText("");
			PolicePanel.getPolicePanelRef().locationField.setText("");
			PolicePanel.getPolicePanelRef().numberField.setText("");
			EmergencyServiceProgram.getEmergencyRef().remove(PolicePanel.getPolicePanelRef());
			
			FireServicePanel.getFireServicePanelRef().nameField.setText("");
			FireServicePanel.getFireServicePanelRef().locationField.setText("");
			FireServicePanel.getFireServicePanelRef().numberField.setText("");
			EmergencyServiceProgram.getEmergencyRef().remove(FireServicePanel.getFireServicePanelRef());
			
			AmbulanceServicePanel.getAmbulanceServicePanelRef().nameField.setText("");
			AmbulanceServicePanel.getAmbulanceServicePanelRef().locationField.setText("");
			AmbulanceServicePanel.getAmbulanceServicePanelRef().numberField.setText("");
			EmergencyServiceProgram.getEmergencyRef().remove(AmbulanceServicePanel.getAmbulanceServicePanelRef());
			
			ATMPanel.getATMPanelRef().nameField.setText("");
			ATMPanel.getATMPanelRef().locationField.setText("");
			ATMPanel.getATMPanelRef().numberField.setText("");
			EmergencyServiceProgram.getEmergencyRef().remove(ATMPanel.getATMPanelRef());
			
			
			EmergencyServiceProgram.getEmergencyRef().remove(HospitalServicePanel.getHospitalServicePanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().remove(TaxiServicePanel.getTaxiServicePanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().remove(AboutPanel.getAboutPanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().remove(ContactPanel.getContactPanelRef());
			
			EmergencyServiceProgram.getEmergencyRef().remove(AdminPanel.getAdminPanelRef());
			
			
			//adding previuos panel
			EmergencyServiceProgram.getEmergencyRef().add(ServicePanel.getServicePanelRef());
			
			
			EmergencyServiceProgram.getEmergencyRef().pack();
			EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);
			
			
			
			
		}
		
		

	
	}
	
}


