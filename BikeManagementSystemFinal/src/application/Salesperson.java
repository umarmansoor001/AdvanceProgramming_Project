package application;

public class Salesperson 
{
	private String receiptDetails;
	private int SalespersonId;
	private String SalespersonsName;
	
	public String getReceiptDetails() 
	{
		return receiptDetails;
	}

	public void setReceiptDetails(String receiptDetails) 
	{
		this.receiptDetails = receiptDetails;
	}

	public int getSalespersonId() 
	{
		return SalespersonId;
	}

	public void setSalespersonId(int salespersonId)
	{
		SalespersonId = salespersonId;
	}

	public String getSalespersonsName() 
	{
		return SalespersonsName;
	}

	public void setSalespersonsName(String salespersonsName) 
	{
		SalespersonsName = salespersonsName;
	}

	
	public boolean remove_Bike(String bikemodel,int Engine_ID)
	{
		int engine_id=Engine_ID;
		String bike_Model=bikemodel;
		boolean removeFlag=false;
		Bike bike_obj=new Bike();
		removeFlag= bike_obj.Remove_Bike(bike_Model,engine_id);
		
		return removeFlag;
		
	}
	
	public void Find_Bike(String bikeName) 
	{
		Bike bike = new Bike();
		int engineNumber = bike.getBikeEngine();
		String model = bike.getBikeModel();
		String name = bike.getBikeName();
		String color = bike.getBikeColor();
	}

	public boolean CustomerDetails(String customer_Detail,String customer_CNIC,String customer_name) 
	{
		return true; 
	}
	
	public boolean Search_Bike(String engineNumber,String name) throws ClassNotFoundException
	{
		String engine_Number=engineNumber;
		boolean flag=false;
		String Name=name;
		
		boolean SearchFlag=false;
		Bike bike_obj=new Bike();
		SearchFlag= bike_obj.Find_Bike(engineNumber,name);
		
		return SearchFlag;
	}
	
	
}
