package martin;


import java.sql.*;

public class Db_Update {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/martin?useSSL=false";  
        String user = "root";
        String password = "Lakshiya@790430";
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection conn = DriverManager.getConnection(url,user,password);
        	Statement stmt = conn.createStatement();
        	String updatesql1 = "UPDATE students SET age = 21 WHERE roll_no= 2";
        	stmt.executeUpdate(updatesql1);
        	String updatesql2 = "UPDATE students SET department = 'data analyst' WHERE roll_no=3";
        	stmt.executeUpdate(updatesql2);
        	System.out.println("rows updated successfully!");
        	stmt.close();
        	conn.close();
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
    }
}
