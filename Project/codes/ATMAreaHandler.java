package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ATMAreaHandler implements ActionListener{
	
	ATMPanel atmp;
	
	public ATMAreaHandler(ATMPanel atmp){
		
		this.atmp = atmp;
	}
	public void actionPerformed(ActionEvent e){
		
	try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM emergency_helpline.atm where area='"+atmp.atmCombo.getSelectedItem()+"'";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
				Area a=new Area();
                a.setName(rs.getString("name"));
			    String  s=a.getName();
			    a.setlocation(rs.getString("location"));
			    String  s1=a.getlocation();
				a.setnumber(rs.getString("number"));
				String  s2=a.getnumber();
				 
				
				  
				atmp.nameField.setText(s);
				atmp.locationField.setText(s1);
				atmp.numberField.setText(s2);
				   
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
	}
	
}