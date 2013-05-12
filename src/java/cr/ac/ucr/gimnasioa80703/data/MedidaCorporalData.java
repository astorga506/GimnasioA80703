/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import java.util.LinkedList;
import cr.ac.ucr.gimnasioa80703.dominio.MedidaCorporal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MedidaCorporalData extends BaseData{

    public MedidaCorporalData() throws SQLException {
    }
        
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
    
}
