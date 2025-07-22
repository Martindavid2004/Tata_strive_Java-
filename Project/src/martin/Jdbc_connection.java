package martin;

import java.sql.*;


public class Jdbc_connection {
	public static void main(String[] args) {
		
	        String url = "jdbc:mysql://localhost:3306/martin";
	        String user = "root";
	        String password = "Lakshiya@790430"; 

	        try (
	        	    Connection con = DriverManager.getConnection(url, user, password);
	        	    Statement stmt = con.createStatement();
	        	    ResultSet rs = stmt.executeQuery("SELECT * FROM students")
	        	) {
	        	    System.out.println("✅ Connected to employee database");
	        	    System.out.println("\n--- Employee Table ---");
	        	    System.out.println("roll_no\t\tname\tdepartment\tage");

	        	    while (rs.next()) {
	        	        int id = rs.getInt("roll_no");
	        	        String name = rs.getString("name");
	        	        String dept = rs.getString("department");
	        	        int age = rs.getInt("age");
	        	        System.out.printf("%-5d\t%-10s\t%-10s\t%d\n", id, name, dept, age);
	        	    }

	        	    System.out.println("\n✅ Connection closed");
	        	} catch (SQLException e) {
	        	    e.printStackTrace();
	        	}	
		}	

}

