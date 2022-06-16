package database;
import java.sql.Connection;
import java.sql.DriverManager;

public class db {
	
	public static Connection getDbObject() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/oop","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
