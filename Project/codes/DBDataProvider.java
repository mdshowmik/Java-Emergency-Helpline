package codes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBDataProvider {
	
	
	public static ArrayList<District> getPSDistrictList(){
        ArrayList<District> PSDistrictList = new ArrayList<District>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct district FROM emergency_helpline.policestation";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                District district = new District();
                
                district.setDistrictName(rs.getString("District"));
              
                
                // add this district to DistrictList
                PSDistrictList.add(district);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
     
        
        return PSDistrictList;
    }
	
	public static ArrayList<Area> getPSAreaList(){
        ArrayList<Area> PSAreaList = new ArrayList<Area>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct area FROM emergency_helpline.policestation";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Area area = new Area();
                
                area.setAreaName(rs.getString("Area"));
              
                
                // add this district to DistrictList
                PSAreaList.add(area);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
        
        
        return PSAreaList;
    }
	
	public static ArrayList<District> getFSDistrictList(){
        ArrayList<District> FSDistrictList = new ArrayList<District>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct district FROM emergency_helpline.fireservice";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                District district = new District();
                
                district.setDistrictName(rs.getString("District"));
              
                
                // add this district to DistrictList
                FSDistrictList.add(district);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
     
        
        return FSDistrictList;
    }
	
	public static ArrayList<Area> getFSAreaList(){
        ArrayList<Area> FSAreaList = new ArrayList<Area>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct area FROM emergency_helpline.fireservice";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Area area = new Area();
                
                area.setAreaName(rs.getString("Area"));
              
                
                // add this district to DistrictList
                FSAreaList.add(area);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
        
        
        return FSAreaList;
    }
	
	public static ArrayList<District> getATMDistrictList(){
        ArrayList<District> ATMDistrictList = new ArrayList<District>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct district FROM emergency_helpline.atm";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                District district = new District();
                
                district.setDistrictName(rs.getString("District"));
              
                
                // add this district to DistrictList
                ATMDistrictList.add(district);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
     
        
        return ATMDistrictList;
    }
	
	public static ArrayList<Area> getATMAreaList(){
        ArrayList<Area> ATMAreaList = new ArrayList<Area>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct area FROM emergency_helpline.atm";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Area area = new Area();
                
                area.setAreaName(rs.getString("Area"));
              
                
                // add this district to DistrictList
                ATMAreaList.add(area);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
        
        
        return ATMAreaList;
    }
	
		public static ArrayList<District> getASDistrictList(){
        ArrayList<District> ASDistrictList = new ArrayList<District>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct district FROM emergency_helpline.ambulance";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                District district = new District();
                
                district.setDistrictName(rs.getString("District"));
              
                
                // add this district to DistrictList
                ASDistrictList.add(district);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
     
        
        return ASDistrictList;
    }
	
	public static ArrayList<Area> getASAreaList(){
        ArrayList<Area> ASAreaList = new ArrayList<Area>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct area FROM emergency_helpline.ambulance";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Area area = new Area();
                
                area.setAreaName(rs.getString("Area"));
              
                
                // add this district to DistrictList
                ASAreaList.add(area);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
        
        
        return ASAreaList;
    }
	
	public static ArrayList<District> getTSDistrictList(){
        ArrayList<District> TSDistrictList = new ArrayList<District>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct district FROM emergency_helpline.taxiservice";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                District district = new District();
                
                district.setDistrictName(rs.getString("District"));
              
                
                // add this district to DistrictList
                TSDistrictList.add(district);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
     
        
        return TSDistrictList;
    }
	
	public static ArrayList<Area> getTSAreaList(){
        ArrayList<Area> TSAreaList = new ArrayList<Area>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct area FROM emergency_helpline.taxiservice";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Area area = new Area();
                
                area.setAreaName(rs.getString("Area"));
              
                
                // add this district to DistrictList
                TSAreaList.add(area);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
        
        
        return TSAreaList;
    }
	
	 public static ArrayList<District> getHSDistrictList(){
        ArrayList<District> HSDistrictList = new ArrayList<District>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct district FROM emergency_helpline.hospital";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                District district = new District();
                
                district.setDistrictName(rs.getString("District"));
              
                
                // add this district to DistrictList
                HSDistrictList.add(district);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
     
        
        return HSDistrictList;
    }
	
	public static ArrayList<Area> getHSAreaList(){
        ArrayList<Area> HSAreaList = new ArrayList<Area>();
        try {
            //Get the Dbconn from DBConnectionProvider
            Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
            Statement stmt = conn.createStatement();
            String query = "SELECT distinct area FROM emergency_helpline.hospital";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Area area = new Area();
                
                area.setAreaName(rs.getString("Area"));
              
                
                // add this district to DistrictList
                HSAreaList.add(area);
            }
            
        } catch (Exception ex) {
			System.out.println(ex.getMessage());
        }
        
        
        
        
        return HSAreaList;
    }
	 
}
