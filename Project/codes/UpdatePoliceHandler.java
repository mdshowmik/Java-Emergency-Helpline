package codes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


class UpdatePoliceHandler implements ActionListener
{     UpdatePolice up;
     // functions f;

    String id_field=null;
    String district_field=null;
    String area_field=null;
    String name_field=null;
    String location_field=null;
    String number_field=null;
    
    public UpdatePoliceHandler(UpdatePolice up)
    {
        this.up=up;
    }

    public void Update(UpdatePolice up) throws SQLException
    {         this.up= up;
		Connection conn=DBConnectionProvider.getDBConnection();
		Statement stmt = conn.createStatement();
        //   String query = "update emergency_helpline.policestation set name='"+name_field+"',location='"+location_field+"',number='"+number_field+"', area='"+area_field+"',district='"+district_field+"' where id='"+id_field+"' "; 
           
        String query="INSERT INTO emergency_helpline.policestation(id, name, location, number, area, district) VALUES ('"+id_field+"','"+name_field+"','"+location_field+"','"+area_field+"','"+district_field+"','"+number_field+"')";
        System.out.println(query);
           
        stmt.executeUpdate(query);
//           System.out.println(query);
           
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {   
        id_field=this.up.idField.getText();
        district_field=this.up.districtField.getText();
        area_field=this.up.areaField.getText();
        name_field=this.up.nameField.getText();
        location_field=this.up.locationField.getText();
        number_field=this.up.numberField.getText();
        
        boolean flag=true;
        
        if(id_field.length()==0){
                JOptionPane.showMessageDialog(up,"You have to provide an id.");
                System.out.println("Provide");
                flag=false;
        }	

        String s=e.getActionCommand();

        if(flag && s.equals("Update")){
             try {
                 Update(up);
                 System.out.println("updated");
				 JOptionPane.showMessageDialog(null,"Update Completed!");
             } catch (SQLException ex) {
                 System.out.println("invalid");
                 ex.printStackTrace();
             }
        }
		
		if(e.getActionCommand().equals("Update")){
			UpdatePolice.getUpdatePoliceRef().idField.setText("");
			UpdatePolice.getUpdatePoliceRef().districtField.setText("");
			UpdatePolice.getUpdatePoliceRef().areaField.setText("");
			UpdatePolice.getUpdatePoliceRef().nameField.setText(""); 
			UpdatePolice.getUpdatePoliceRef().locationField.setText("");
			UpdatePolice.getUpdatePoliceRef().numberField.setText("");
		}
    }
			
}
    
		
	
		
	
	

