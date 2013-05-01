/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import java.util.LinkedList;
import cr.ac.ucr.gimnasioa80703.dominio.MedidaCorporal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;


public class MedidaCorporalData extends BaseData{
    
    public LinkedList<MedidaCorporal> getMedidasCorporales() throws SQLException{
        String query = "SELECT * "
                        + "FROM MedidaCorporal";
        Connection connection = this.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        LinkedList<MedidaCorporal> medidasCorporales = new LinkedList<MedidaCorporal>();
        
        while(resultSet.next()){
            MedidaCorporal medidaCorporal = new MedidaCorporal();
            
            medidaCorporal.setCodMedida(resultSet.getInt("cod_medida"));
            medidaCorporal.setNombreMedida(resultSet.getString("nombre_medida"));
            medidaCorporal.setUnidadMedida(resultSet.getString("unidad_medida"));
            
            medidasCorporales.add(medidaCorporal);
            
        }//while
        
        connection.close();
        
        return medidasCorporales;        
    }
    
    public MedidaCorporal insertar(MedidaCorporal medidaCorporal) throws SQLException{
        String update = "{CALL sp_insertar_medida(?,?,?)}";
        Connection connection = this.getConnection();
        CallableStatement statement =  connection.prepareCall(update);
        
        statement.registerOutParameter(1, Types.INTEGER);
        statement.setString(2, medidaCorporal.getNombreMedida());
        statement.setString(3, medidaCorporal.getUnidadMedida());
        
        //ejecutar el statement
        
        statement.executeUpdate();
        
        medidaCorporal.setCodMedida(statement.getInt(1));
        
        connection.close();
        
        return medidaCorporal;
        
    }
    
}
