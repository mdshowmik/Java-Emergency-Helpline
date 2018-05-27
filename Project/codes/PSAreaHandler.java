package codes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PSAreaHandler implements ActionListener{
	
	PolicePanel pp;
	
	public PSAreaHandler(PolicePanel pp){
		
		this.pp = pp;
	}
	public void actionPerformed(ActionEvent e){
		
	try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM emergency_helpline.policestation where area='"+pp.policeCombo.getSelectedItem()+"'";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
				Area a=new Area();
                a.setName(rs.getString("name"));
			    String  s=a.getName();
			    a.setlocation(rs.getString("location"));
			    String  s1=a.getlocation();
				a.setnumber(rs.getString("number"));
				String  s2=a.getnumber();
				 
				
				  
				pp.nameField.setText(s);
				pp.locationField.setText(s1);
				pp.numberField.setText(s2);
				   
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
	}
	
}