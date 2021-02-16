package project1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) throws SQLException {
            ResultSet rs;
            String read = "SELECT * FROM employees";

            try(
                    Connection conn = DBConnection.getConnection();
                    PreparedStatement pr = conn.prepareStatement(read);
                    ){
                rs = pr.executeQuery();
                while(rs.next()){
                    System.out.println("working");
                    System.out.println(rs.getString("Emp_Id")+" "+rs.getString("Name")+" "+rs.getString("Salary")+" "+rs.getString("Phone_No")+" "+rs.getString("Address"));
                }
            }catch(SQLException e){
                System.out.println("Not working");
                System.err.print(e);
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Do You Want To Add A Employee ? ");
            String ans = input.nextLine();
            if(ans.equalsIgnoreCase("yes")){
                System.out.println("Enter Id : ");
                String id = input.nextLine();
                System.out.println("Enter Name : ");
                String name = input.nextLine();
                System.out.println("Enter Salary : ");
                String salary = input.nextLine();
                System.out.println("Enter Phone Number : ");
                String phone_no = input.nextLine();
                System.out.println("Enter Address : ");
                String address = input.nextLine();
                
                addEmployees create = new addEmployees();
                create.add(name,id , address, phone_no, salary);
            }else{
                System.exit(1);
            }
            
    }
}

