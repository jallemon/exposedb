package exposedatabase;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class createDB {
	private String dbname;
	public createDB(String name)
	{
		dbname = name;
	}
	public String create()
	{
		java.sql.Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=8EwUV6hsQmx@9n8");
				java.sql.Statement s;
					s = Conn.createStatement();
					s.executeUpdate(String.format("CREATE DATABASE %s", dbname));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		return "Created!";
	}
	public String delete()
	{
		java.sql.Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=8EwUV6hsQmx@9n8");
				java.sql.Statement s;
					s = Conn.createStatement();
					s.executeUpdate(String.format("DROP DATABASE %s", dbname));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		return "Deleted!";
	}
}
