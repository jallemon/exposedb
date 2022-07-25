package exposedatabase;

import java.sql.DriverManager;
import java.sql.SQLException;

public class createTable {
	private String dbname;
	private String tablename;
	
	public createTable(String dbname, String tablename)
	{
		this.dbname = dbname;
		this.tablename = tablename;
	}

	public String create()
	{
		java.sql.Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=8EwUV6hsQmx@9n8");
				java.sql.Statement s;
					s = Conn.createStatement();
					s.execute(String.format("USE %s;", dbname));
					s = Conn.createStatement();
					s.executeUpdate(String.format("CREATE TABLE %s (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)", tablename));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		return "Created!";
	}
}
