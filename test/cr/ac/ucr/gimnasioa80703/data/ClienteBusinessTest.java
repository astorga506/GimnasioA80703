/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.business.ClienteBusiness;
import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Carlos
 */
public class ClienteBusinessTest {
    
    @Test
    public void test() {
        
        ClienteBusiness cb;
        try {
            cb = new ClienteBusiness();
            Cliente cliente = cb.getClientes("a").getFirst();
            System.out.println(cliente.getNombreCliente());
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());            
        }
        
        
        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
}