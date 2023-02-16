				//Update the record on the table)
				
package corejaavasql;
import java.sql.*;


public class sqlupdate{
	public static void main(String[] args)throws Exception {
		updateRecords();
}
	
	public static void updateRecords() throws Exception
{
		String url="jdbc:mysql://localhost:3306/nataraj";    //database name ex:nataraj
		String username="root";				//mysql username
		String password="Nataraj@123";		//mysql password
		
		int sno=10;
		
		String query="update raj set name1='SheelaNataraj' where sno=10";
				
			Class.forName("com.mysql.jdbc.Driver");  //no need declare class driver name for updated version
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement stmt=con.prepareStatement(query);
			int rows=stmt.executeUpdate();
			
			
			System.out.println("Number of rows affected"+rows);	
			System.out.println("Record Updated");
			
			
		con.setAutoCommit(true);	// to confirm updatation	
		con.close();				// to close the opened connection
		}
	
}
