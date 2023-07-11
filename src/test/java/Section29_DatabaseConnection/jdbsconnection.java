package Section29_DatabaseConnection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


public class jdbsconnection {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
		// "jdbc:mysql://localhost:3306/dbname?characterEncoding=utf8"
//		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt", "root", "Pmj@2021");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qadbt?characterEncoding=latin1", "root", "Pmj@2021");

		Statement  s = con.createStatement();
	ResultSet rs =s.executeQuery("select *from employeeinfo  where name ='ram';");
	rs.next();
	System.out.println(rs.getString("location"));
	}
}
