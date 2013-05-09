/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class BaseData {
    
    public Connection getConnection() throws SQLException{       
        
//        String password = "lenguajes";
//        String user = "lenguajes";
        String driverName = "sun.jdbc.odbc.JdbcOdbcDriver";
        String url = "jdbc:odbc:GimnasioA80703";
        
        try{
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
//        Connection connection = DriverManager.getConnection(url, user, password);
        Connection connection = DriverManager.getConnection(url);
        
        return connection;
        
    }//getConnection
        
}//BaseData
