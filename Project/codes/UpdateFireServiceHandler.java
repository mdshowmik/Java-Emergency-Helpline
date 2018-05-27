package codes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


class UpdateFireServiceHandler implements ActionListener
{    UpdateFireService ufs;
     // functions f;

    String id_field=null;
    String district_field=null;
    String area_field=null;
    String name_field=null;
    String location_field=null;
    String number_field=null;
    
    public UpdateFireServiceHandler(UpdateFireService ufs)
    {
        this.ufs=ufs;
    }

    public void Update(UpdateFireService ufs) throws SQLException
    {         this.ufs= ufs;
		Connection conn=DBConnectionProvider.getDBConnection();
		Statement stmt = conn.createStatement();
        //   String query = "update emergency_helpline.policestation set name='"+name_field+"',location='"+location_field+"',number='"+number_field+"', area='"+area_field+"',district='"+district_field+"' where id='"+id_field+"' "; 
           
        String query="INSERT INTO emergency_helpline.fireservice(id, name, location, number, area, district) VALUES ('"+id_field+"','"+name_field+"','"+location_field+"','"+area_field+"','"+district_field+"','"+number_field+"')";
        System.out.println(query);
           
        stmt.executeUpdate(query);
//           System.out.println(query);
           
    }
    
   
    public void actionPerformed(ActionEvent e) {   
        id_field=this.ufs.idField.getText();
        district_field=this.ufs.districtField.getText();
        area_field=this.ufs.areaField.getText();
        name_field=this.ufs.nameField.getText();
        location_field=this.ufs.locationField.getText();
        number_field=this.ufs.numberField.getText();
        
        boolean flag=true;
        
        if(id_field.length()==0){
                JOptionPane.showMessageDialog(ufs,"You have to provide an id.");
                System.out.println("Provide");
                flag=false;
        }	

        String s=e.getActionCommand();

        if(flag && s.equals("Update")){
             try {
                 Update(ufs);
                 System.out.println("updated");
				 JOptionPane.showMessageDialog(null,"Update Completed!");
             } catch (SQLException ex) {
                 System.out.println("invalid");
                 ex.printStackTrace();
             }
        }
		
		if(e.getActionCommand().equals("Update")){
			UpdateFireService.getUpdateFireServiceRef().idField.setText("");
			UpdateFireService.getUpdateFireServiceRef().districtField.setText("");
			UpdateFireService.getUpdateFireServiceRef().areaField.setText("");
			UpdateFireService.getUpdateFireServiceRef().nameField.setText(""); 
			UpdateFireService.getUpdateFireServiceRef().locationField.setText("");
			UpdateFireService.getUpdateFireServiceRef().numberField.setText("");
		}
    }
			
}
    
		
	
		
	
	


