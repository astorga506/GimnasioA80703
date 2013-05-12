/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import cr.ac.ucr.gimnasioa80703.dominio.ItemRutinaMedida;
import cr.ac.ucr.gimnasioa80703.dominio.MedidaCorporal;
import cr.ac.ucr.gimnasioa80703.dominio.Rutina;
import java.sql.Date;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Carlos
 */
public class RutinaDataTest {

    @Test
    public void test() {
        try {
            java.util.Date fecha = new java.util.Date();
            Date fechaSql = new Date(fecha.getTime());
            Rutina rutina = new Rutina();
            RutinaData rutinaData = new RutinaData();
            Cliente cliente = new Cliente();
            cliente.setCodCliente(1000000001);
            MedidaCorporal medidadCorporal = new MedidaCorporal();
            medidadCorporal.setCodMedida(1000000000);
            LinkedList<ItemRutinaMedida> medidas = new LinkedList<ItemRutinaMedida>();
            medidas.add(new ItemRutinaMedida((float) 3.0, medidadCorporal));

            rutina.setCliente(cliente);
            rutina.setItemesRutinaMedida(medidas);
            rutina.setFechaCreacion(fechaSql);
            rutina.setObjetivoCliente("Perder peso");
            rutina.setEnfermadadesCliente("Herpes");

            rutinaData.insertar(rutina);

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
