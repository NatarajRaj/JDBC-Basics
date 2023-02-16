package corejaavasql;

import java.sql.*;

public class calling_stored_procedure {

	public static void main(String[] args)throws Exception {
		storedProcedure();
}
	
	public static void storedProcedure() throws Exception
		{
			String url="jdbc:mysql://localhost:3306/nataraj";
			String name="root";
			String password="Nataraj@123";
			String query="select * from raj";
			
			Connection con=DriverManager.getConnection(url, name, password);
			CallableStatement stmt=con.prepareCall("{call Getdetails()}");   //stored procedure to access & view on table
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {  //while loop run to get entire details conditions true
				
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
				//System.out.println("Id number:"+rs.getString(1)+"\t"+"name:"+rs.getString(2));
				
			}
		}
	}

