package application;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class showroomtest {

	@Test
	public void addbiketest()
	{
		Showroom S=new Showroom();
		S.addBike(123,"honda","CD70","Red");
		assertTrue(S.search_Bike(123,"CD70"););
	}
	@Test
	public void Remove_Biketest()
	{
		Showroom S=new Showroom();
		S.Remove_Bike(123,"honda");
		assertFalse(S.search_Bike(123,"CD70"););
	}
	@Test
	public void searchbiketest()
	{
		Showroom S=new Showroom();
		assertTrue(S.search_Bike(123,"CD70"););
		
	}
	@Test
	public void addemployeetest()
	{
		Showroom S=new Showroom();
		assertTrue(S.AddEmployee(123,"Usman","G-9","03339923","342042421"));
	}
	@Test
	public void addcustomertest()
	{
		Showroom S=new Showroom();
		assertTrue(S.Add_Customer("Usman","342042421","G-9 Islamabad"));
	}
}
