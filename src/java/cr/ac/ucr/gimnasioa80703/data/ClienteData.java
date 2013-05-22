    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.CallableStatement;
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

    public ClienteData()throws SQLException{
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
    
    
    public LinkedList<Cliente> getClientes(String apellidosCliente) throws SQLException {
        String query = "{CALL sp_buscar_cliente(?)}";
        Connection connection = this.getConnection();
        CallableStatement statement = connection.prepareCall(query);
        statement.setString(1, apellidosCliente);
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
    
    public Cliente getCliente(int codCliente) throws SQLException{    
        String query = "SELECT * "
                        + "FROM Cliente "
                        + "WHERE id_cliente=?";        
        Connection connection = this.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, codCliente);
        ResultSet resultSet = statement.executeQuery();        
        Cliente cliente = new Cliente();
        
        while(resultSet.next()){                
            cliente.setCodCliente(resultSet.getInt("id_cliente"));
            cliente.setNombreCliente(resultSet.getString("nombre_cliente"));
            cliente.setApellidosCliente(resultSet.getString("apellidos_cliente"));
            cliente.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
            cliente.setTelefono(resultSet.getString("telefono"));
            cliente.setDireccion(resultSet.getString("direccion"));
            cliente.setNombreContactoEmergencia(resultSet.getString("nombre_contacto_emergencia"));
            cliente.setTelContactoEmergencia(resultSet.getString("tel_contacto_emergencia"));
        
        }
        
        connection.close();
                
        return cliente;
    }
    
    public Cliente setCliente (Cliente cliente) throws SQLException{        
        Connection conexion = this.getConnection();
        String update = "{CALL sp_editar_cliente(?,?,?,?,?,?,?,?)}";
        CallableStatement stmtEditCliente = conexion.prepareCall(update);
        
        stmtEditCliente.setInt(1, cliente.getCodCliente());
        stmtEditCliente.setString(2, cliente.getNombreCliente());
        stmtEditCliente.setString(3, cliente.getApellidosCliente());
        stmtEditCliente.setDate(4, cliente.getFechaNacimiento());
        stmtEditCliente.setString(5, cliente.getTelefono());
        stmtEditCliente.setString(6, cliente.getDireccion());
        stmtEditCliente.setString(7, cliente.getNombreContactoEmergencia());
        stmtEditCliente.setString(8, cliente.getTelContactoEmergencia());
        
        stmtEditCliente.executeUpdate();
        
        System.out.println("/--------------------------------------\\");
        
        conexion.close();
        
        return cliente;
    }
    
}
