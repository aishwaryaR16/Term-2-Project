package conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn 
{

	public static Connection getConn() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcdemo","root","toor");
		return conn;
	}
}
