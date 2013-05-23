/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.ItemRutinaMedida;
import cr.ac.ucr.gimnasioa80703.dominio.Rutina;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author Equipo
 */
public class RutinaData extends BaseData {

    public RutinaData() throws SQLException{
    }

    public Rutina insertar(Rutina rutina) throws SQLException {

        Connection connection = this.getConnection();

        try {

            connection.setAutoCommit(false);

            String updateRutina = "{CALL sp_insertar_rutina(?,?,?,?,?,?)}";
            CallableStatement stmtRutina = connection.prepareCall(updateRutina);

            stmtRutina.registerOutParameter(1, Types.INTEGER);
            stmtRutina.setDate(2, rutina.getFechaCreacion());
            stmtRutina.registerOutParameter(3, Types.DATE);
            stmtRutina.setString(4, rutina.getObjetivoCliente());
            stmtRutina.setString(5, rutina.getEnfermadadesCliente());
            stmtRutina.setInt(6, rutina.getCliente().getCodCliente());

            stmtRutina.executeUpdate();

            rutina.setCodRutina(stmtRutina.getInt(1));
            rutina.setFechaRenovacion(stmtRutina.getDate(3));
                        
            for (ItemRutinaMedida itemMedidaActual : rutina.getItemesRutinaMedida()) {
                
                String updateItemMedida = "{CALL sp_insertar_item_medida(?,?,?)}";
                CallableStatement stmtItemMedida = connection.prepareCall(updateItemMedida);
                
                stmtItemMedida.setInt(1, rutina.getCodRutina());
                stmtItemMedida.setInt(2, itemMedidaActual.getMedidaCorporal().getCodMedida());
                stmtItemMedida.setFloat(3, itemMedidaActual.getValorMedida());
                
                System.out.println(itemMedidaActual.toString());
                
                stmtItemMedida.executeUpdate();
                
            }//for-each
            

        } catch (SQLException ex) {

            connection.rollback();
            throw new SQLException();
        }
        
        connection.commit();        
        connection.close();

        return rutina;
    }
}
