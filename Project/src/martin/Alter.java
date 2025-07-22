package martin;


import java.sql.*;

public class Alter {
    public static void main(String[] args) {
    	 String url = "jdbc:mysql://localhost:3306/martin?useSSL=false";
         String user = "root";
         String password = "Lakshiya@790430";
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection conn = DriverManager.getConnection(url,user,password);
        	Statement stmt = conn.createStatement();
          
            String dropIdSql = "ALTER TABLE students DROP COLUMN roll_no";
            stmt.executeUpdate(dropIdSql);

            String addIdSql = "ALTER TABLE students ADD COLUMN id INT NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST";
            stmt.executeUpdate(addIdSql);

            System.out.println("Old 'roll_no' column removed and new AUTO_INCREMENT 'id' column added!");


        	System.out.println("rows updated successfully!");
        	stmt.close();
        	conn.close();
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
    }
}