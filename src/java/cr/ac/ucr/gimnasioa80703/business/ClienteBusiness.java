/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.business;

import cr.ac.ucr.gimnasioa80703.data.ClienteData;
import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Equipo
 */
public class ClienteBusiness {
    
    ClienteData clienteData;

    public ClienteBusiness() throws SQLException {
        clienteData = new ClienteData();
    }
    
    public LinkedList<Cliente> getClientes() throws SQLException{
        return clienteData.getClientes();        
    }
    
    public LinkedList<Cliente> getClientes(String apellidosCliente) throws SQLException{
        return clienteData.getClientes(apellidosCliente);        
    }
    
    
}
