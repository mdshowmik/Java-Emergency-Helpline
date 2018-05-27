package codes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


class UpdateAmbulanceServiceHandler implements ActionListener
{    
    UpdateAmbulanceService uas;

    String id_field=null;
    String district_field=null;
    String area_field=null;
    String name_field=null;
    String location_field=null;
    String number_field=null;
    
    public UpdateAmbulanceServiceHandler(UpdateAmbulanceService uas)
    {
        this.uas=uas;
    }

    public void Update(UpdateAmbulanceService uas) throws SQLException
    {        
        this.uas= uas;
		Connection conn=DBConnectionProvider.getDBConnection();
		Statement stmt = conn.createStatement();
        //   String query = "update emergency_helpline.ambulance set name='"+name_field+"',location='"+location_field+"',number='"+number_field+"', area='"+area_field+"',district='"+district_field+"' where id='"+id_field+"' "; 
           
        String query="INSERT INTO emergency_helpline.ambulance(id, name, location, number, area, district) VALUES ('"+id_field+"','"+name_field+"','"+location_field+"','"+area_field+"','"+district_field+"','"+number_field+"')";
        System.out.println(query);
           
        stmt.executeUpdate(query);
//           System.out.println(query);
           
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e)
    {   
        
        id_field=this.uas.idField.getText();
        district_field=this.uas.districtField.getText();
        area_field=this.uas.areaField.getText();
        name_field=this.uas.nameField.getText();
        location_field=this.uas.locationField.getText();
        number_field=this.uas.numberField.getText();
        
        boolean flag=true;
        
        if(id_field.length()==0){
                JOptionPane.showMessageDialog(uas,"You have to provide an id.");
                System.out.println("Provide");
                flag=false;
        }	

        String s=e.getActionCommand();

        if(flag && s.equals("Update")){
             try {
                Update(uas);
                System.out.println("updated");
				JOptionPane.showMessageDialog(null,"Update Completed!");
             } catch (SQLException ex) {
                System.out.println("invalid");
                ex.printStackTrace();
             }
        }
		
		if(e.getActionCommand().equals("Update")){
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().idField.setText("");
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().districtField.setText("");
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().areaField.setText("");
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().nameField.setText(""); 
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().locationField.setText("");
			UpdateAmbulanceService.getUpdateAmbulanceServiceRef().numberField.setText("");
		}
    }
			
}
    
		
	
		
	
	

