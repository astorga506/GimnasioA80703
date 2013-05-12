/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class BaseData {

    private final String UrlBase = "jdbc:sqlserver://127.0.0.1;"
                                 + "databaseName=Gimnasio_A80703;"
//                                 + "integratedSecurity=true;";
                                 + "user=carlos;password=m4rlb0r0;";
    private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private Connection conexion;

    public BaseData() throws SQLException {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseData.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexion = DriverManager.getConnection(UrlBase);
    }

    public Connection getConnection() {

        return this.conexion;

    }
//    public Connection getConnection() throws SQLException{       
//        
////        String password = "lenguajes";
////        String user = "lenguajes";
//        String driverName = "sun.jdbc.odbc.JdbcOdbcDriver";
//        String url = "jdbc:odbc:GimnasioA80703";
//        
//        try{
//            Class.forName(driverName);
//        } catch (ClassNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
//        
////        Connection connection = DriverManager.getConnection(url, user, password);
//        Connection connection = DriverManager.getConnection(url);
//        
//        return connection;
//        
//    }//getConnection
}//BaseData
