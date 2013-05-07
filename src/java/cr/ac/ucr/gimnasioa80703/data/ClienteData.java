    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
}
