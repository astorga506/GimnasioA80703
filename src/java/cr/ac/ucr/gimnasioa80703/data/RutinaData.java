/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.MedidaCorporal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Equipo
 */
public class RutinaData extends BaseData{

    public RutinaData() {
    }
    
    public LinkedList<MedidaCorporal> getMedidaCorporal() throws SQLException{
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
        }
        
        connection.close();
        
        return medidasCorporales;
    }
    
    
    
    
    
    
}
