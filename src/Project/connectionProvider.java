/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Abhishek_Singh
 */
public class connectionProvider {
 
        
    
    public static Connection getcon()
    {
       try
       {
        Class.forName("com.mysql.cj.jdbc.Drive");
        Connection con=DriverManager.getConnection( "jdbc:mysql://root@alocalhost:3306/hotel", "root","12345");
        return con;
       
       }
       catch(Exception e)
       {
            e.printStackTrace();
           return null;
       }
    }
}
