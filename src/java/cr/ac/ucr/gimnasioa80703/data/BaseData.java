
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

    private final String UrlBase = "jdbc:sqlserver://10.155.7.170;"
                                    +"databaseName=Gimnasio_A80703;"
                                    +"user=lenguajes;password=lenguajes;"; 
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
    
}//BaseData
