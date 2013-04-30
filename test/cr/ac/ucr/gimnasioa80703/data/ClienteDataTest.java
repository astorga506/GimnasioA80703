/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.SQLException;
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
        
        
        clienteData = new ClienteData();
        
//        Cliente cliente = new Cliente();
//
//        cliente.setNombreCliente("Fabian");
//        cliente.setApellidosCliente("Quiros Masis");
//        cliente.setFechaNacimiento("1989-07-28");
//        cliente.setTelefono("87654321");
//        cliente.setDireccion("San Rafael");
//        cliente.setNombreContactoEmergencia("Marlon Miranda Rojas");
//        cliente.setTelContactoEmergencia("87654321");

        try {

            Cliente cliente = clienteData.getClientes().getFirst();

//            clienteData.insertar(cliente);
            System.out.println(cliente.getNombreCliente());


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}