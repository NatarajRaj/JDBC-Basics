				//delete the record on the table) 

package corejaavasql;
import java.sql.*;


public class sqldelete{
	public static void main(String[] args)throws Exception {
		deleteRecords();
}
	
	public static void deleteRecords() throws Exception
{
		String url="jdbc:mysql://localhost:3306/nataraj";    //database name ex:nataraj
		String username="root";				//mysql username
		String password="Nataraj@123";		//mysql password
		
		int id=9;
		
		String query="delete from raj where sno ="+id; 
				
			Class.forName("com.mysql.cj.jdbc.Driver");  //no need declare class driver name for updated version
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement stmt=con.prepareStatement(query);
			int rows=stmt.executeUpdate();
			
			
			System.out.println("Number of rows affected"+rows);	
			System.out.println("Record Deleted");
			
			
		con.setAutoCommit(true);	// to confirm updatation	
		con.close();				// to close the opened connection
		}
	
}
