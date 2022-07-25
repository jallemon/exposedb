package exposedatabase;

import java.sql.DriverManager;
import java.sql.SQLException;

public class createColumn {
	private String name;
	private String type;
	private String tablename;
	private String databasename;
	private int tableid;
	private int databaseid;
	
	public createColumn(String name, String type, int tableId, int DBId)
	{
		this.name = name;
		this.type = type;
		this.tableid = tableId;
		this.databaseid = DBId;
		this.tablename = DBUtils.getTableNameFromId(tableId);
		this.databasename = DBUtils.getDBNameFromId(DBId);
	}
	
	public String create()
	{
		java.sql.Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=8EwUV6hsQmx@9n8");
				java.sql.Statement s;
					s = Conn.createStatement();
					s.execute(String.format("USE %s;", databasename));
					s = Conn.createStatement();
					System.out.println(String.format("ALTER TABLE %s ADD %s %s;", databasename + "." + tablename, name, type));
					s.executeUpdate(String.format("ALTER TABLE %s ADD %s %s;", tablename, name, type));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		return "Created!";
	}
}
