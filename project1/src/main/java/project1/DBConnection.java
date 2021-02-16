
package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String USERNAME = "test"; 
    private static final String PASSWORD = "test123";
    private static final String CONN = "jdbc:mysql://localhost:3306/project";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(CONN,USERNAME,PASSWORD);
    }
}
