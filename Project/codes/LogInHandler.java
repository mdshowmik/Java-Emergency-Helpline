package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LogInHandler implements ActionListener{
	
	AdminPanel adminp;
	
	public LogInHandler(AdminPanel adminp){
		
		this.adminp = adminp;
	}
	
	public void actionPerformed(ActionEvent e){
		
		try{
			
		System.out.println("Show update page");
			
			Connection conn=DBConnectionProvider.getDBConnection();
			
			String u=this.adminp.usernameField.getText();
			String p=this.adminp.passwordField.getText();
			
			Statement stmt = conn.createStatement();
            String query = "SELECT username,password FROM emergency_helpline.admin where username='"+u+"'and password='"+p+"'";
            ResultSet rs = stmt.executeQuery(query);
			
			if(rs.next()){
				String uname=(rs.getString("username"));
				String pass=(rs.getString("password"));
                
            if(uname.equals(u) && pass.equals(p)){ 
				EmergencyServiceProgram.getEmergencyRef().remove(AdminPanel.getAdminPanelRef());
				EmergencyServiceProgram.getEmergencyRef().add(UpdatePanel.getUpdatePanelRef());
			
				EmergencyServiceProgram.getEmergencyRef().pack();
				EmergencyServiceProgram.getEmergencyRef().setBounds(50,100, 850, 500);	
			}
			  
			
			}
			else{
				  JOptionPane.showMessageDialog(null,"Incorrect Username or password");
			}
			
			
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			
		}
		
		
		
	}
	
}
