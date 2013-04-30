/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import java.util.LinkedList;
import cr.ac.ucr.gimnasioa80703.dominio.CatergoriaEjercicio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author Carlos
 */
public class CategoriaEjercicioData extends BaseData{
    
    public LinkedList<CatergoriaEjercicio> getCategorias() throws SQLException{
        String query = "SELECT * "
                        + "FROM CategoriaEjercicio";
        Connection connection = this.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.getResultSet();
        LinkedList<CatergoriaEjercicio> categoriasEjercicios = new LinkedList<CatergoriaEjercicio>();
        
        while(resultSet.next()){
            CatergoriaEjercicio categoria = new CatergoriaEjercicio();
            
            categoria.setCodCategoria(resultSet.getInt("cod_categoria"));
            categoria.setNombreCategoria(resultSet.getString("nombre_categoria"));
            
            categoriasEjercicios.add(categoria);            
        }//while
        
        connection.close();
        
        return categoriasEjercicios;
                
    }//getCategorias
    
    public CatergoriaEjercicio insertar(CatergoriaEjercicio categoria) throws SQLException{
        String update = "{CALL sp_insertar_categoria(?,?)}";
        Connection connection = this.getConnection();
        CallableStatement statement =  connection.prepareCall(update);
        
        statement.registerOutParameter(1, Types.INTEGER);
        statement.setString(2, categoria.getNombreCategoria());
        
        //ejecutar el statement
        
        statement.executeUpdate();
        
        categoria.setCodCategoria(statement.getInt(1));
        
        connection.close();
        
        return categoria;        
    }//insertar
    
    
    
}
