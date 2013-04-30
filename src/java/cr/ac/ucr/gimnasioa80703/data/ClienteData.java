    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class ClienteData extends BaseData{
    
    private Cliente cliente;

    public ClienteData() {
    }
    
    public LinkedList<Cliente> getClientes() throws SQLException{    
        String query = "SELECT * "
                        + "FROM Cliente";        
        Connection connection = this.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();        
        LinkedList<Cliente> clientes = new LinkedList<Cliente>();
        
        while(resultSet.next()){            
            Cliente cliente = new Cliente();
            
            cliente.setCodCliente(resultSet.getInt("id_cliente"));
            cliente.setNombreCliente(resultSet.getString("nombre_cliente"));
            cliente.setApellidosCliente(resultSet.getString("apellidos_cliente"));
            cliente.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
            cliente.setTelefono(resultSet.getString("telefono"));
            cliente.setDireccion(resultSet.getString("direccion"));
            cliente.setNombreContactoEmergencia(resultSet.getString("nombre_contacto_emergencia"));
            cliente.setTelContactoEmergencia(resultSet.getString("tel_contacto_emergencia"));
            
            clientes.add(cliente);
        }
        
        connection.close();
                
        return clientes;
    }
    
    public Cliente insertar(Cliente cliente) throws SQLException{
        String update = "{CALL sp_insertar_cliente(?,?,?,?,?,?,?,?)}";
        Connection connection = this.getConnection();
        CallableStatement statement = connection.prepareCall(update);      
        
        statement.registerOutParameter(1, Types.INTEGER);
        statement.setString(2, cliente.getNombreCliente());        
        statement.setString(3, cliente.getApellidosCliente());        
        statement.setDate(4, cliente.getFechaNacimiento());
        statement.setString(5, cliente.getTelefono());        
        statement.setString(6, cliente.getDireccion());
        statement.setString(7, cliente.getNombreContactoEmergencia());
        statement.setString(8, cliente.getTelContactoEmergencia());
                
        statement.executeUpdate();
        
        cliente.setCodCliente(statement.getInt(1));
        
        connection.close();        
        
        return cliente;
    }
    
        
}
