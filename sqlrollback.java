
					//add multiple batch scenario (for example salary,bonus,increment etc..,)

package corejaavasql;

import java.sql.*;

public class sqlrollback {

	public static void main(String[] args)throws Exception {

		rollbackdemo();
		}

	public static void rollbackdemo() throws Exception
	{
	String url="jdbc:mysql://localhost:3306/nataraj";    //database name ex:nataraj
	String username="root";				//mysql username
	String password="Nataraj@123";		//mysql password



	String query1="update raj set salary=160000 where sno=6";
	String query2="update raj set salary=250000 where sno=7";
	String query3="update raj set salary=200000 where sno=8";
	String query4="update raj set salary=350000 where sno=9";
	String query5="update raj set salary=650000 where sno=10";
			
		//Class.forName("com.mysql.cj.jdbc.Driver");  //no need declare class driver name for updated version
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();     // note this step
		con.setAutoCommit(false);     // if any one error in query no update on database (rollback) but to give autocommit(true) update without error line(its too complicated to identify what u change ,so give autocommit(false) condition
		
		stmt.addBatch(query1);
		stmt.addBatch(query2);
		stmt.addBatch(query3);
		stmt.addBatch(query4);
		stmt.addBatch(query5);
		int[] result=stmt.executeBatch();
		
		for(int i:result)           //for each loop
			{
				if(i>0)      // to avoid autocommit if conditon(auto update database without error query value ,if this all the query no error will be update)
				{
					continue;
				}
				else
				{
					con.rollback();
			    }
				System.out.println("No.of rows affected" +i);
			}
				con.commit();
						
	}
}