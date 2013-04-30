/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Rutina;
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
    
    public LinkedList<Rutina> getRutinas() throws SQLException{
        String query = "SELECT * "
                    + "FROM MedidaCorporal";
        Connection connection = this.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        LinkedList<Rutina> rutinas = new LinkedList<Rutina>();
        
        while(resultSet.next()){
            Rutina rutina = new Rutina();
            
//            rutina.setCodMedida(resultSet.getInt("cod_medida"));
//            rutina.setNombreMedida(resultSet.getString("nombre_medida"));
//            rutina.setUnidadMedida(resultSet.getString("unidad_medida"));
            
            rutinas.add(rutina);
        }
        
        connection.close();
        
        return rutinas;
    }
    
    
    
    
    
    
}
