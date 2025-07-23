package martin;

import java.sql.*;

public class Stored_procedure {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/martin";
        String username = "root";
        String password = "Lakshiya@790430";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password)) {
            CallableStatement stmt = conn.prepareCall("{CALL InsertStudent(?, ?, ?, ?)}");

            stmt.setInt(1, 101); 
            stmt.setString(2, "John Doe");
            stmt.setString(3, "AIDS");
            stmt.setInt(4, 21); 

            stmt.execute();
            System.out.println("Student inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}