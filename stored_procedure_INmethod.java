package corejaavasql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

//import java.sql.*;      //simply used this import package all th above package inbuilt at import java.sql.*

public class stored_procedure_INmethod {


	public static void main(String[] args)throws Exception {
		storedProcedureIn();
}
	
	public static void storedProcedureIn() throws Exception
		{
			String url="jdbc:mysql://localhost:3306/nataraj";
			String name="root";
			String password="Nataraj@123";
			
			int id=5;
			
			Connection con=DriverManager.getConnection(url, name, password);
			CallableStatement stmt=con.prepareCall("{call Getdetails(?)}");   //stored procedure to access & view on particular id on table
			stmt.setInt(1, id);   // one record view basis on id,  assigned sno=id to access the value
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {  //while loop run to get entire details conditions true
				
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
				//System.out.println("Id number:"+rs.getString(1)+"\t"+"name:"+rs.getString(2));
			}
		} 
	}

