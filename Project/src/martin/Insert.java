package martin;
import java.sql.*;

public class Insert {
    public static void main(String[] args) {
    	 String url = "jdbc:mysql://localhost:3306/martin?useSSL=false";
         String user = "root";
         String password = "Lakshiya@790430";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

        
            String sql = "INSERT INTO students (id, name,department,age) VALUES (6,'vikram','Backend Developement',20)";
            int rowsInserted = stmt.executeUpdate(sql);
            System.out.println(rowsInserted + " students inserted successfully!");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}