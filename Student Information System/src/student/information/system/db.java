/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Nguyen
 */
import java.sql.*;
import javax.swing.*;
public class db {

   
    public static Connection java_db(){
        
        try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=student", "sa", "123");
            return conn;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}