

// to view the file record on mysql database from eclipse
//to connect mysql connector jar file on eclipse,because import package of import.java.sql to connect with jar file
				//Type 2 (directly declare variable)
package corejaavasql;
import java.sql.*;


public class sqlexample2{

	public static void main(String [] args) throws Exception
{
		String url="jdbc:mysql://localhost:3306/nataraj";    //database name ex:nataraj
		String username="root";				//mysql username
		String password="Nataraj@123";		//mysql password
		String query="select * from raj";
		
			Class.forName("com.mysql.cj.jdbc.Driver");  //no need declare class driver name for updated version
			Connection con=DriverManager.getConnection(url,username,password);
			// mysql database name, username, password
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {  //while loop run to get entire details conditions true
				
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
				//System.out.println("Id number:"+rs.getString(1)+"\t"+"name:"+rs.getString(2));
			}
		con.close();
		}
	
}
