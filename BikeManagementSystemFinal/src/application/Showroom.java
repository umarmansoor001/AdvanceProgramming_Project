fpackage application;

import java.sql.SQLException;

public class Showroom 
{
	
	private String receptionist;
	private String infoDesk;
	private String receptionistChair;
	
	public String getReceptionist() 
	{
		return receptionist;
	}

	public void setReceptionist(String receptionist) 
	{
		this.receptionist = receptionist;
	}

	public String getInfoDesk() 
	{
		return infoDesk;
	}

	public void setInfoDesk(String infoDesk) 
	{
		this.infoDesk = infoDesk;
	}

	public String getReceptionistChair() 
	{
		return receptionistChair;
	}

	public void setReceptionistChair(String receptionistChair) 
	{
		this.receptionistChair = receptionistChair;
	}

	public void Remove_Bike(int Bike_Engine, String model) throws ClassNotFoundException 
	{
		String bikemodel=model;
		boolean flag=false;
		int Engine_ID=Bike_Engine;
		Salesperson obj=new Salesperson();
		flag= obj.remove_Bike(bikemodel,Engine_ID);
		
		if(flag==true)
		{
	      System.out.println("Bike Remove succesfully");		
		}	
      			
	}
	
	public void AddBike(int engine_number, String model, String name, String color) throws ClassNotFoundException 
	{
		boolean flag2=false;
		
		
		int Engine_Number = engine_number;
		String Model = model;
		String Name = name;
		String Color = color;
		
		Admin objAddBike=new Admin();
		flag2=objAddBike.Add_Bike(engine_number, model, name, color);
		
		
		
		
		if(flag2==true)
		{
	      System.out.println("Bike Added succesfully");		
		}	
		
		
	}
	
	
	
	
	public void searchBike(String engineNumber,String name) throws ClassNotFoundException 
	{
		String engine_Number=engineNumber;
		boolean flag=false;
		String Name=name;
		Salesperson obj=new Salesperson();
		flag= obj.Search_Bike(engineNumber,name);
		
		if(flag==true)
		{
	      System.out.println("Bike Found succesfully");		
		}
                
	}
	
	public void ChangeDetail(int Employee_ID)  
	{
		
		boolean flag=false;
		int Emp_ID=Employee_ID;
		Admin objAdm=new Admin();
		//flag= objAdm.ChangeDetails(Emp_ID);
		
		if(flag==true)
		{
	      System.out.println("Change Emplyee Details succesfully");		
		}
                
	}
	
	
	public void DeleteDetail(int Employee_ID) throws ClassNotFoundException, SQLException  
	{
		
		boolean flag=false;
		int Emp_ID=Employee_ID;
		Admin objAdm=new Admin();
		flag=objAdm.DeleteDetails(Employee_ID);
		//flag= objAdm.removeEmp(Emp_ID); 
		
		if(flag==true)
		{
	      System.out.println("Change Emplyee Details succesfully");		
		}
                
	}
	
	public boolean Add_Employee(int employee_id, String employee_name, String employee_address, String employee_phoneNumber, String employee_cnic) throws ClassNotFoundException  
	{
		
		boolean flag=false;
		int Employee_id = employee_id;
		String Employee_name = employee_name;
		String Employee_address = employee_address;
		String Employee_phoneNumber = employee_phoneNumber;
		String Employee_cnic = employee_cnic;
		
		Admin objAdm=new Admin();
		flag= objAdm.AddEmployee(employee_id, employee_name,employee_address, employee_phoneNumber, employee_cnic); 
		
		if(flag==true)
		{
	      System.out.println("Added Employee succesfully");		
		}
            
		return flag; 
	}
	
	
	public boolean Add_Customer(String Name,String CNIC, String Details)  
	{
		
		boolean flag=false;
		String customer_CNIC=CNIC;
		String customer_name=Name;
		String customer_Detail =Details; 
		Salesperson objAdm=new Salesperson();
		flag= objAdm.CustomerDetails(customer_Detail,customer_CNIC,customer_name); 
		
		if(flag==true)
		{
	      System.out.println("Change Emplyee Details succesfully");		
		}
            
		return flag; 
	}
	
	
	
	
	
	
	
    
	
	
}
