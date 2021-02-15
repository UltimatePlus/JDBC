
package project1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class addEmployees {
    public addEmployees(){
    }
    public void add(String name,String id,String address,String phone_no,String salary) throws SQLException{
        String sql = "INSERT INTO `employees`(`Name`,`Emp_Id`,`Address`,`Phone_No`,`Salary`) VALUES (?,?,?,?,?)";
        try(
                Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
        ){
            stmt.setString(1, name);
            stmt.setString(2, id);
            stmt.setString(3, address);
            stmt.setString(4, phone_no);
            stmt.setString(5, salary);
            stmt.execute();
        }catch(SQLException e){
        }
    }
}
