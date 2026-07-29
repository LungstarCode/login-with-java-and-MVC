
import java.sql.*;
public class JdbcUtility {

	static 
	{
		// load and register the Driver
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	public static Connection getConnection() 
	{
		Connection conn = null;
		
		try 
		{
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/loginmvm", "root", "");
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
}
