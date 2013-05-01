/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Ejercicio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class EjercicioData extends BaseData{
    
    public LinkedList<Ejercicio> getEjercicios() throws SQLException{
        String query = "SELECT cod_ejercicio, nombre_ejercicio, cod_equipo, cod_categoria, nombre_categoria "
                        + "FROM Ejercicio, Categoria"
                        + "WHERE Ejercicio.cod_categoria = Categoria.cod_categoria";
        Connection connection = this.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        LinkedList<Ejercicio> ejercicios = new LinkedList<Ejercicio>();
        
        while(resultSet.next()){
            Ejercicio ejercicio = new Ejercicio();
            
            ejercicio.setCodEjercicio(resultSet.getInt("cod_ejercicio"));
            ejercicio.setNombreEjercicio(resultSet.getString("nombre_ejercicio"));
            ejercicio.setCodEquipo(resultSet.getInt("cod_equipo"));
            ejercicio.getCategoria().setCodCategoria(resultSet.getInt("cod_categoria"));
            ejercicio.getCategoria().setNombreCategoria(resultSet.getString("nombre_categoria"));
            
            ejercicios.add(ejercicio);
            
        }//while
        
        connection.close();
        
        return ejercicios;        
    }
    
    public Ejercicio insertar(Ejercicio ejercicio) throws SQLException{
        String update = "{CALL sp_insertar_ejercicio(?,?,?,?)}";
        Connection connection = this.getConnection();
        CallableStatement statement =  connection.prepareCall(update);
        
        statement.registerOutParameter(1, Types.INTEGER);
        statement.setString(2, ejercicio.getNombreEjercicio());
        statement.setInt(3, ejercicio.getCategoria().getCodCategoria());        
        statement.setInt(3, ejercicio.getCodEquipo());
        
        //ejecutar el statement
        
        statement.executeUpdate();
        
        ejercicio.setCodEjercicio(statement.getInt(1));
        
        connection.close();
        
        return ejercicio;
        
    }
    
}
