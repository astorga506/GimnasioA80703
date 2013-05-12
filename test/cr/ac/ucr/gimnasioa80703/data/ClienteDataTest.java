/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Equipo
 */
public class ClienteDataTest {

    ClienteData clienteData;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {        
        try {
            clienteData = new ClienteData();
            LinkedList<Cliente> clientes = clienteData.getClientes("a");
            for (Cliente cliente : clientes) {
                System.out.println(cliente.getNombreCliente());                
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        
    }
}