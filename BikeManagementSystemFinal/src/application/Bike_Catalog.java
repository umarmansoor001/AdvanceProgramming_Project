package application;

public class Bike_Catalog 
{

	private String BikeDescription;
	
	
	public String getBikeDescription() 
	{
		return BikeDescription;
	}


	public void setBikeDescription(String bikeDescription) 
	{
		BikeDescription = bikeDescription;
	}


	public boolean Find_Bike(String engineNumber,String name) throws ClassNotFoundException 
	{
	 
		boolean DBFlag=false;
		
		DB_Handler bike_DB_obj=new DB_Handler();
		DBFlag= bike_DB_obj.Find_Bike(engineNumber,name);
		
		return DBFlag;
		
		
	}
	
}


