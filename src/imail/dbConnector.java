/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author Abhishek Yadav
 * @author Akshit Pandey
 * @author Sarthak Chafle
 * @author Aditya Hukre 
 */
public class dbConnector {
     public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://www.db4free.net/levelspace_30072", "level_30072000", "@N038595sql");
            //con = DriverManager.getConnection("jdbc:mysql://localhost/javaimail", "root", "@N038595sql");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
