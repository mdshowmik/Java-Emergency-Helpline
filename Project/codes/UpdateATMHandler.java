package codes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


class UpdateATMHandler implements ActionListener
{     UpdateATM uat;
     // functions f;

    String id_field=null;
    String district_field=null;
    String area_field=null;
    String name_field=null;
    String location_field=null;
    String number_field=null;
    
    public UpdateATMHandler(UpdateATM uat)
    {
        this.uat=uat;
    }

    public void Update(UpdateATM uat) throws SQLException
    {         this.uat= uat;
		Connection conn=DBConnectionProvider.getDBConnection();
		Statement stmt = conn.createStatement();
        //   String query = "update emergency_helpline.policestation set name='"+name_field+"',location='"+location_field+"',number='"+number_field+"', area='"+area_field+"',district='"+district_field+"' where id='"+id_field+"' "; 
           
        String query="INSERT INTO emergency_helpline.atm(id, name, location, number, area, district) VALUES ('"+id_field+"','"+name_field+"','"+location_field+"','"+area_field+"','"+district_field+"','"+number_field+"')";
        System.out.println(query);
           
        stmt.executeUpdate(query);
//      System.out.println(query);
           
    }
    

    public void actionPerformed(ActionEvent e) {   
        id_field=this.uat.idField.getText();
        district_field=this.uat.districtField.getText();
        area_field=this.uat.areaField.getText();
        name_field=this.uat.nameField.getText();
        location_field=this.uat.locationField.getText();
        number_field=this.uat.numberField.getText();
        
        boolean flag=true;
        
        if(id_field.length()==0){
                JOptionPane.showMessageDialog(uat,"You have to provide an id.");
                System.out.println("Provide");
                flag=false;
        }	

        String s=e.getActionCommand();

        if(flag && s.equals("Update")){
             try {
                 Update(uat);
                 System.out.println("updated");
				 JOptionPane.showMessageDialog(null,"Update Completed!");
             } catch (SQLException ex) {
                 System.out.println("invalid");
                 ex.printStackTrace();
             }
        }
		
		if(e.getActionCommand().equals("Update")){
			UpdateATM.getUpdateATMRef().idField.setText("");
			UpdateATM.getUpdateATMRef().districtField.setText("");
			UpdateATM.getUpdateATMRef().areaField.setText("");
			UpdateATM.getUpdateATMRef().nameField.setText(""); 
			UpdateATM.getUpdateATMRef().locationField.setText("");
			UpdateATM.getUpdateATMRef().numberField.setText("");
		}
    }
			
}
    
		
	
		
	
	


