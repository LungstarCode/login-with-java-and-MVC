
import java.sql.*;

public class Model {

		private static String name;
		private static String email;
		private static String password;
		private static String town;
		
		// configuration instance variables 
		
		Connection connection = null;
		
		PreparedStatement statement = null;
		
		
		public static String getName() {
			return name;
		}
		public static void setName(String name) {
			Model.name = name;
		}
		public static String getEmail() {
			return email;
		}
		public static void setEmail(String email) {
			Model.email = email;
		}
		public static String getPassword() {
			return password;
		}
		public static void setPassword(String password) {
			Model.password = password;
		}
		public static String getTown() {
			return town;
		}
		public static void setTown(String town) {
			Model.town = town;
		}
		
		public void register() {
			try 
			{
				connection = JdbcUtility.getConnection();
				String sql = "INSERT INTO users(name, email, password, town) VALUES (?,?,?,?)";
				statement=connection.prepareStatement(sql);
				
				statement.setString(1, name);
				statement.setString(2, email);
				statement.setString(3, password);
				statement.setString(4, town);
				
				// execute the query
				
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		
}
