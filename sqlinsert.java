				//insert the record on the table) Type 1 declare directly

package corejaavasql;
import java.sql.*;


public class sqlinsert{
	public static void main(String[] args)throws Exception {
		insertRecord();
}
	
	public static void insertRecord() throws Exception
{
		String url="jdbc:mysql://localhost:3306/nataraj";    //database name ex:nataraj
		String username="root";				//mysql username
		String password="Nataraj@123";		//mysql password
		
		String query="insert into raj values(7,'NatarajGwzi')"; //insert query
				
			Class.forName("com.mysql.jdbc.Driver");  //no need declare class driver name for updated version
			Connection con=DriverManager.getConnection(url,username,password);
			// mysql database name, username, password
			Statement stmt=con.createStatement();
			int rows=stmt.executeUpdate(query);   //to declare int because how many rows affected  basis given data
			
			System.out.println("Number of rows affected"+rows);	
				
		con.close();
		}
	
}
