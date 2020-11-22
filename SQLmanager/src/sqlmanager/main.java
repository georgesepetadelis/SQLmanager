package sqlmanager;

import java.sql.*;  


public class main {

	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet result;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// connection to database \\
			con = DriverManager.getConnection("jdbc:mysql://hostname:port/DBname","DBusername","DBpassword");
			st = con.createStatement();
			// SQL or mysql query \\
			result = st.executeQuery("query");
			
			while(result.next()) {
				
				/* if the cllumn type is int use 'getInt() method'
				else if is it string, plain text,email or varchar use the 'getString()' method  
				You can add as many collum's you want */
				
				System.out.println(result.getInt(/*column name*/));
				System.out.println(result.getString(/*column name*/));
				System.out.println(result.getString(/*column name*/));
				System.out.println(result.getString(/*column name*/) + "\n");
			}
		}catch(Exception e) {
			// if any error exist \\
			System.out.println("error: " + e.getMessage());
		}
	}
}
