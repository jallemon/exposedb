package exposedatabase;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBUtils {
	public static String getDBNameFromId(int id)
	{
		String retVal = "";
		java.sql.Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=8EwUV6hsQmx@9n8");
		java.sql.Statement s;
		s = Conn.createStatement();
		ResultSet rs = s.executeQuery(String.format("SELECT Name FROM meta.databases WHERE ID=%s", Integer.toString(id)));
		rs.first();
		retVal = rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}
	public static String getTableNameFromId(int id)
	{
		String retVal = "";
		java.sql.Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=8EwUV6hsQmx@9n8");
		java.sql.Statement s;
		s = Conn.createStatement();
		ResultSet rs = s.executeQuery(String.format("SELECT Name FROM meta.tables WHERE ID=%s", Integer.toString(id)));
		rs.first();
		retVal = rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}
}
