
import java.sql.*;

public class Model {

		private static String name;
		private static String email;
		private static String password;
		private static String town;
		
		// configuration instance variables 
		
		Connection connection = null;
		int rowsAffected = 0;
		
		PreparedStatement statement = null;
		
		
		public static String getName() {
			return name;
		}
		public void setName(String name) {
			Model.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			Model.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			Model.password = password;
		}
		public String getTown() {
			return town;
		}
		public void setTown(String town) {
			Model.town = town;
		}
		
		public int register() {
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
				rowsAffected=statement.executeUpdate();
				
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			return rowsAffected;
		}
		
		
}
