package application;

public class Bike 
{
	
	private int BikeId;
	private int BikeEngine;
	private String BikeModel;
	private String BikeName;
	private String BikeColor;
	
	
	
	
	public int getBikeId()
	{
		return BikeId;
	}

	public void setBikeId(int bikeId) 
	{
		BikeId = bikeId;
	}

	public int getBikeEngine()
	{
		return BikeEngine;
	}

	public void setBikeEngine(int bikeEngine)
	{
		BikeEngine = bikeEngine;
	}

	public String getBikeModel() 
	{
		return BikeModel;
	}

	public void setBikeModel(String bikeModel) 
	{
		BikeModel = bikeModel;
	}

	public String getBikeName() 
	{
		return BikeName;
	}

	public void setBikeCompanyName(String bikeName) 
	{
		BikeName = bikeName;
	}

	public String getBikeColor() 
	{
		return BikeColor;
	}

	public void setBikeColor(String bikeColor) 
	{
		BikeColor = bikeColor;
	}

	public void Create_Bike(String BikeName, int BikeId, String Quantity, String price) 
	{
		
	}
	
	public boolean Enter_Bike(int engine_number, String model, String name, String color) throws ClassNotFoundException
	{
		boolean AddBikeFlag=false;
		int Engine_Number = engine_number;
		String Model = model;
		String Name = name;
		String Color = color;
		DB_Handler objAddBike=new DB_Handler();
		AddBikeFlag= objAddBike.create_Bike(engine_number,model,name,color);
		
		return AddBikeFlag;
	}
	
	
	public boolean Remove_Bike(String bike_Model,int engine_id) 
	{
        boolean InventoryFlag=false;
		String model=bike_Model;
		int Engine_ID=engine_id;
		Inventory bike_remove_obj=new Inventory();
		InventoryFlag= bike_remove_obj.Bike_Remove(model,Engine_ID);
		
		return InventoryFlag;
		
	}
	
	public boolean Find_Bike(String engineNumber,String name) throws ClassNotFoundException 
	{
	 
		String engine_Number=engineNumber;
		boolean flag=false;
		String Name=name;
		
		boolean SearchFlag=false;
		Bike_Catalog bike_obj=new Bike_Catalog();
		SearchFlag= bike_obj.Find_Bike(engineNumber,name);
		
		return SearchFlag;
		
	}
	
}
