package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Handler 
{
	
	public ResultSet getEmp(int Id) throws ClassNotFoundException 
	{
		
		ResultSet rs = null;
			try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bikeshowroom", "root", "shadow123");
			
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			
			
			/*String sql2 = "UPDATE FROM employee WHERE employee_id=?";
			PreparedStatement statement2 = con.prepareStatement(sql2);
			statement2.setInt(1, Id);
			statement2.execute();*/
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
			return rs;
			
	}
	
	public ResultSet ChangeDetail(int id, String name, String address, String phoneNumber, String cnic) throws ClassNotFoundException    //ChangeDetail(get_id);
	{
		ResultSet rs = null;
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/bikeshowroom", "root", "shadow123");
		
		String sql2 = "UPDATE FROM employee WHERE employee_id=?";
		PreparedStatement statement2 = con.prepareStatement(sql2);
		statement2.setInt(1, id);
		statement2.setString(1, name);
		statement2.setString(1, address);
		statement2.setString(1, phoneNumber);
		statement2.setString(1, cnic);
		statement2.execute();
		
		Statement statement3 = con.createStatement();
		ResultSet rs2 = statement3.executeQuery(sql2);
		
		return rs2;
		
		
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
		return rs;
		
	}
	
	public ResultSet SaveEmp(int id, String name, String address, String phoneNumber, String cnic) throws ClassNotFoundException {
		
		ResultSet rs = null;
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/bikeshowroom", "root", "shadow123");
		
		String sql2 = "INSERT INTO employee VALUES (?, ?, ?, ?, ?)";
		PreparedStatement statement2 = con.prepareStatement(sql2);
		statement2.setInt(1, id);
		statement2.setString(1, name);
		statement2.setString(1, address);
		statement2.setString(1, phoneNumber);
		statement2.setString(1, cnic);
		statement2.execute();
		
		Statement statement3 = con.createStatement();
		ResultSet rs2 = statement3.executeQuery(sql2);
		return rs2;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
		
	}
	
	public boolean removeEmp(int Id) throws ClassNotFoundException 
	{
		ResultSet rs = null;
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/bikeshowroom", "root", "shadow123");
		
		String sql = "DELETE FROM employee WHERE employee_id=?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, Id);
		statement.execute();
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		return true;
	}
	
	public boolean EnterEmp(int employee_id, String employee_name, String employee_address, String employee_phoneNumber, String employee_cnic) throws ClassNotFoundException 
	{
		
			try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bikeshowroom", "root", "shadow123");
			
			String sql = "INSERT INTO employee VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, employee_id);
			statement.setString(2, employee_name);
			statement.setString(3, employee_address);
			statement.setString(4, employee_phoneNumber);
			statement.setString(5, employee_cnic);
			statement.execute();
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		boolean	flag=true;
		 return flag;
		
	}
	
	public void EnterCustomerDetails(String details) {
		
	}
	
	public boolean Find_Bike(String engineNumber,String name) throws ClassNotFoundException 
	{

			try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bikeshowroom", "root", "shadow123");
			PreparedStatement stat = con.prepareStatement("select * from bike where engine_number=? or name=?");
			ResultSet rs = stat.executeQuery();
			
			
			//Statement stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery("select * from bike where engine_number=? or name=?");
			
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			
			
			
			/*while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}*/
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	 
		boolean DBFlag=false;
		
		//DB_Handler bike_DB_obj=new DB_Handler();
		//DBFlag= bike_DB_obj.Find_Bike(BikeName,id);
		
		return DBFlag;
		
		
	}
	
	public boolean remove_Bike(String bike_model,int Bike_EngineID)
	{
		boolean RemoveFlag=false;
		//queries
		
		return RemoveFlag; 
		
	}
	
	//create_Bike(BikeName,Engine_ID,bike_Model,BikePrice);
	
	public boolean create_Bike(int engine_number, String model, String name, String color) throws ClassNotFoundException
	{
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bikeshowroom", "root", "shadow123");
			
			String sql = "INSERT INTO bike VALUES (?, ?, ?, ?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, engine_number);
			statement.setString(2, model);
			statement.setString(3, name);
			statement.setString(4, color);
			statement.execute();
			
			//Statement stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery("select * from bike");
			
			
			/*while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}*/
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		boolean AddBikeFlag=true;
		//queries
		
		return AddBikeFlag; 
		
	}
	
	
	

}
