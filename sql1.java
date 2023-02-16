

// to view the file record on mysql database from eclipse
//to connect mysql connector jar file on eclipse,because import package of import.java.sql to connect with jar file

package corejaavasql;
import java.sql.*;


public class sql1 {

	public static void main(String [] args)
{
		
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //no need declare class driver name for updated version
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nataraj","root","Nataraj@123");
			// mysql database name, username, password
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from raj");
		
			while(rs.next()) {  //while loop run to get entire details conditions true
				
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
				//System.out.println("Id number:"+rs.getString(1)+"\t"+"name:"+rs.getString(2));
				
			}
			
		}
		catch(Exception e) {
		System.out.println(e.toString());  //to exception display on string message
			
		}
		}
}

