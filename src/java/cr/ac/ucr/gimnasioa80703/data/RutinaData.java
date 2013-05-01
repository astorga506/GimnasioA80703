/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Rutina;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.LinkedList;

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
            statementRutina.setDate(2, rutina.getFechaCreacion());
            statementRutina.setString(4, rutina.getObjetivoCliente());
            statementRutina.setString(5, rutina.getEnfermadadesCliente());
            statementRutina.setInt(6, rutina.getCliente().getCodCliente());

            statementRutina.executeUpdate();



        } catch (SQLException ex) {

            connection.rollback();
            throw new SQLException();
        }

        return rutina;
    }
}
