/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek_Singh
 */
public class tables {
    public static void main(String [] args){
        Connection con = null;
        Statement st = null;
        try {
            con=connectionProvider.getcon();
            st=con.createStatement();
            st.executeUpdate("create table users(Name varchar(200),Email varchar(200),Password varchar(50),SecurityQuestion varchar(500), Answer varchar(200), Address varchar(200),status varchar(20))");
            st.executeUpdate("Create table room(roomNo varchar(10), roomType varchar (200),bed varchar(200), price int, Status varchar(20))");
            st.executeUpdate("creat table customer (id int , name varchar(200), mobileNumber varchar(20),nationality varchar(200), gender varcahr(50), email varchar(200), idProof varchar(200), address varchar(500), checkIn varchar(50), roomNo varchar(10), bed varchar(200), roomType varchar(200), PricePerDay int(10), numberOfDaysStay int (10), totalAmount varchar(200), checkout)");
            JOptionPane.showConfirmDialog(null,"Table created succesfullyy");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
        try {
           con.close();
            st.close();
        } catch (Exception e) 
              {} 
        }
    }
}
