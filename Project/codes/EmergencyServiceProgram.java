package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class EmergencyServiceProgram extends JFrame{
	
	  private static EmergencyServiceProgram esp=null;
	  
	  public EmergencyServiceProgram(){
		this.setTitle("WE CARE SERVICE PROVIDER");
		this.setLayout(null);
		this.add(ServicePanel.getServicePanelRef());
		
		this.setVisible(true);
		this.setBounds(50,100, 850, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		esp = this;
	  }
	 
	
	  public static EmergencyServiceProgram getEmergencyRef(){
		if(esp==null){
			esp = new EmergencyServiceProgram();
		}
		return esp; 
	}
		public static void main(String[] args) {
		
		EmergencyServiceProgram esp = new EmergencyServiceProgram();
		
	}	
}