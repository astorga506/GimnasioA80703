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

    public RutinaData() {
    }

    public Rutina insertar(Rutina rutina) throws SQLException {

        Connection connection = this.getConnection();

        try {

            connection.setAutoCommit(false);

            String updateRutina = "{CALL sp_insertar_rutina(?,?,?,?,?,?)}";
            CallableStatement statementRutina = connection.prepareCall(updateRutina);

            statementRutina.registerOutParameter(1, Types.INTEGER);
            statementRutina.registerOutParameter(2, Types.DATE);
            statementRutina.registerOutParameter(3, Types.DATE);
            statementRutina.setString(4, rutina.getObjetivoCliente());
            statementRutina.setString(5, rutina.getEnfermadadesCliente());
            statementRutina.setInt(6, rutina.getCliente().getCodCliente());

            statementRutina.executeUpdate();

            rutina.setCodRutina(statementRutina.getInt(1));            
            rutina.setFechaCreacion(statementRutina.getDate(2));
            rutina.setFechaRenovacion(statementRutina.getDate(3));
            
            for (ItemRutinaMedida itemMedidaActual : rutina.getItemesRutinaMedida()) {
                
                String updateItemMedida = "{CALL sp_insertar_item_medida(?,?,?)}";
                CallableStatement statementItemMedida = connection.prepareCall(updateItemMedida);
                
                statementItemMedida.setInt(1, rutina.getCodRutina());
                statementItemMedida.setInt(2, itemMedidaActual.getMedidaCorporal().getCodMedida());
                statementItemMedida.setFloat(1, itemMedidaActual.getValorMedida());
                
                statementItemMedida.executeUpdate();
                
            }//for-each
            

        } catch (SQLException ex) {

            connection.rollback();
            throw new SQLException();
        }
        
        connection.close();

        return rutina;
    }
}
