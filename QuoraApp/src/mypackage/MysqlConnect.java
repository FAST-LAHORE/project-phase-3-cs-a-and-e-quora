/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * jdbc:derby://localhost:1527/project [zain on ZAIN]
 * @author ZAIN ALI
 */
public class MysqlConnect {
static Connection conn=null;

    public static Connection ConnectDB() throws SQLException, ClassNotFoundException{
       
   try{
       // Class.forName("com.mysql.jdbc.Driver");
      //  JOptionPane.showMessageDialog(null, "Connected to db1");
      
//      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection( "jdbc:derby://localhost:1527/proj", "zain","zain");
        //Statement st= connection.createStatement("");
        //JOptionPane.showMessageDialog(null, "Connected to dbgf");
   
     return conn; 
        
        
   }
 //  catch(ClassNotFoundException e){
   //     JOptionPane.showMessageDialog(null, e);
   
  //     return null;
   //}
   catch(SQLException e){
       
        JOptionPane.showMessageDialog(null, "!!"+e);
   
   return null;
   }
   
   
   
   
    } 
    
}
