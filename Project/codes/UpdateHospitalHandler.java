package codes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


class UpdateHospitalHandler implements ActionListener
{     UpdateHospital uh;
     // functions f;

    String id_field=null;
    String district_field=null;
    String area_field=null;
    String name_field=null;
    String location_field=null;
    String number_field=null;
    
    public UpdateHospitalHandler(UpdateHospital uh)
    {
        this.uh=uh;
    }

    public void Update(UpdateHospital uh) throws SQLException
    {         this.uh= uh;
		Connection conn=DBConnectionProvider.getDBConnection();
		Statement stmt = conn.createStatement();
        //   String query = "update emergency_helpline.policestation set name='"+name_field+"',location='"+location_field+"',number='"+number_field+"', area='"+area_field+"',district='"+district_field+"' where id='"+id_field+"' "; 
           
        String query="INSERT INTO emergency_helpline.hospital(id, name, location, number, area, district) VALUES ('"+id_field+"','"+name_field+"','"+location_field+"','"+area_field+"','"+district_field+"','"+number_field+"')";
        System.out.println(query);
           
        stmt.executeUpdate(query);
//           System.out.println(query);
           
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {   
        id_field=this.uh.idField.getText();
        district_field=this.uh.districtField.getText();
        area_field=this.uh.areaField.getText();
        name_field=this.uh.nameField.getText();
        location_field=this.uh.locationField.getText();
        number_field=this.uh.numberField.getText();
        
        boolean flag=true;
        
        if(id_field.length()==0){
                JOptionPane.showMessageDialog(uh,"You have to provide an id.");
                System.out.println("Provide");
                flag=false;
        }	

        String s=e.getActionCommand();

        if(flag && s.equals("Update")){
             try {
                 Update(uh);
                 System.out.println("updated");
				 JOptionPane.showMessageDialog(null,"Update Completed!");
             } catch (SQLException ex) {
                 System.out.println("invalid");
                 ex.printStackTrace();
             }
        }
		
		if(e.getActionCommand().equals("Update")){
			UpdateHospital.getUpdateHospitalRef().idField.setText("");
			UpdateHospital.getUpdateHospitalRef().districtField.setText("");
			UpdateHospital.getUpdateHospitalRef().areaField.setText("");
			UpdateHospital.getUpdateHospitalRef().nameField.setText(""); 
			UpdateHospital.getUpdateHospitalRef().locationField.setText("");
			UpdateHospital.getUpdateHospitalRef().numberField.setText(""); 
		}
    }
			
}
    
		
	
		
	
	

