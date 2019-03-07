package insertdata;
import java.sql.*;
public class insertdata {
	public static void main(String[] args) {
String url = "jdbc:mysql://localhost:8889/crewinformations";
String user = "root";
String password = "root";{

try {
	//Get a connection to database
	Connection con = DriverManager.getConnection(url, user, password);
	//Create a statement
	Statement stmt = con.createStatement();
	//Execute SQL query
	String sql = "insert into crewdata"
			+  "(employeeiD,surName,givenName,MiddleName,sex,rank,nationality,dateOfBirth,placeOfBirth)"
			+ "VALUES ('S456778','Uddin','Nasir','Shah','M','Third Engineer','Bangladeshi','1987-01-01','Chittagong')";
stmt.executeUpdate(sql);
	System.out.println("Insert Complete");
	
}catch (Exception exc) { 
 exc.printStackTrace();       
}
}
	}
}