package corejaavasql;

import java.sql.*;

public class stored_procedure_INOUT {


	public static void main(String[] args)throws Exception {
		storedProcedureInOut();
}
	
	public static void storedProcedureInOut() throws Exception
		{
			String url="jdbc:mysql://localhost:3306/nataraj";
			String name="root";
			String password="Nataraj@123";
			
			int id=7;
			
			Connection con=DriverManager.getConnection(url, name, password);
			CallableStatement stmt=con.prepareCall("{call getnamebyId(?,?)}");   //stored procedure INOUT(?,?) method to access & view on particular id on table
			stmt.setInt(1, id);   // one record view basis on id,  assigned sno=id to access the value
			//stmt.registerOutParameter(2,Types.VARCHAR);
			stmt.registerOutParameter(1,Types.VARCHAR);
			stmt.executeUpdate();
			
				
				System.out.println(stmt.getString(2));       //get particular name to give id (IN) & get (OUT) by assigned sno=id (for IN) , getname(for OUT) with database stored procedure concept
				
		
			
		}
	}

// output ----->  NatarajGwzi
