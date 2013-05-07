/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
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
        Calendar calendar = Calendar.getInstance();

        // set Date portion to January 1, 1970
        calendar.set(Calendar.YEAR, 1989);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DATE, 1);

        // normalize the object
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date javaSqlDate = new Date(calendar.getTime().getTime());
        System.out.println(javaSqlDate);


        clienteData = new ClienteData();
  

        try {

            Cliente cliente = clienteData.getClientes().getFirst();


            System.out.println(cliente.getNombreCliente());
            System.out.println(cliente.getFechaNacimiento());


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}