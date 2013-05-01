/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.data;

import cr.ac.ucr.gimnasioa80703.dominio.MedidaCorporal;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Carlos
 */
public class MedidaCorporalDataTest {
    
    private MedidaCorporalData medidaCorporalData;
    
    @Before
    public void setUp() {
        
        ;
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test(){
        
        medidaCorporalData = new MedidaCorporalData();
        
        MedidaCorporal medidaCorporal = new MedidaCorporal();
        
        
        medidaCorporal.setNombreMedida("Cadera");
        medidaCorporal.setUnidadMedida("cm");
//        
        try {
            
            medidaCorporalData.insertar(medidaCorporal);
            
//           MedidaCorporal medidaCorporal = medidaCorporalData.getMedidasCorporales().getFirst();
            
            System.out.println(medidaCorporal.getNombreMedida());
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}