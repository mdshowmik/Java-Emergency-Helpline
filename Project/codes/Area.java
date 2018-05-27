package codes;

public class Area{
	
	private String areaName;
	private String number;
	private String location;
	private String Name;
	
	public Area(){
		
	}
	
	public Area(String areaName){
		
		this.areaName=areaName;
		
	}
	
	public void setAreaName(String areaName){
		
		this.areaName=areaName;
		
	}
	
	public String getAreaName(){
		
		return this.areaName;
	}
	
	public void setName(String Name){
		
		this.Name=Name;

	}
	public String getName(){
		
		return this.Name=Name;

	}
	
	public void setnumber(String number){
		
		this.number=number;
		
	}
	public String getnumber(){
		
		return this.number;
	}
	public void setlocation(String location){
		
		this.location=location;
		
	}
	public String getlocation(){
		
		return this.location;
	}
	public String toString(){
		return this.areaName;
	}
}
	
	