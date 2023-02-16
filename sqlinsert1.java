				//insert the record on the table) Type 2 declare directly
				// declare prepared statement through variable
				// multiple variable declare suitable this type
package corejaavasql;
import java.sql.*;


public class sqlinsert1{
	public static void main(String[] args)throws Exception {
		insertRecords();
}
	
	public static void insertRecords() throws Exception
{
		String url="jdbc:mysql://localhost:3306/nataraj";    //database name ex:nataraj
		String username="root";				//mysql username
		String password="Nataraj@123";		//mysql password
		
		int id=12;
		String name="NatarajGowzika"; 	//declare  any variable to access
		int salary=100000;
		
		String query="insert into raj values(?,?,?);";   //inert query
				
			Class.forName("com.mysql.cj.jdbc.Driver");  //no need declare class driver name for updated version
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, salary);
			int rows=stmt.executeUpdate();
			
			
			System.out.println("Number of rows affected"+rows);	
			System.out.println("Record Inserted");
			
			
		con.setAutoCommit(true);	// to confirm updatation	
		con.close();				// to close the opened connection
		}
	
}
