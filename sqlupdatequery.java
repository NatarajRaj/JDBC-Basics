					//Update the record on the table & another way
			// auto-commit(true)[declare or not] (or) normal commit concept ---for example query 1 no error run & update database entered new query but query 2 error stopped to run (console error shown)
			//autocommit(fasle) [declare] --- for example query 1 no error but query 2 error no update on database & no rows affected

package corejaavasql;

import java.sql.*;

public class sqlupdatequery {
	
	public static void main(String[] args)throws Exception {

	updateRecordscommit();
	}

public static void updateRecordscommit() throws Exception
{
String url="jdbc:mysql://localhost:3306/nataraj";    //database name ex:nataraj
String username="root";				//mysql username
String password="Nataraj@123";		//mysql password



String query1="update raj set salary=35000 where sno=1";
String query2="update raj set salary=40000 where sno=2";
		
	Class.forName("com.mysql.cj.jdbc.Driver");  //no need declare class driver name for updated version
	Connection con=DriverManager.getConnection(url,username,password);
	Statement stmt=con.createStatement();     // note this step
	int rows1=stmt.executeUpdate(query1);
	int rows2=stmt.executeUpdate(query2);
	
	System.out.println("Number of rows affected"+rows1);
	System.out.println("Number of rows affected"+rows2);	

	System.out.println("Record Updated");
	
}
}
