/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.business;

import cr.ac.ucr.gimnasioa80703.data.MedidaCorporalData;
import cr.ac.ucr.gimnasioa80703.dominio.MedidaCorporal;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class MedidaCorporalBusiness {
    
    private MedidaCorporalData medidaCorporalData;

    public MedidaCorporalBusiness() throws SQLException {
        medidaCorporalData = new MedidaCorporalData();
    }
    
    public LinkedList<MedidaCorporal> getMedidasCorporales() throws SQLException{
        return medidaCorporalData.getMedidasCorporales();
    }
    
    public MedidaCorporal getMedidaCorporal(int codMedida) throws SQLException{
        return medidaCorporalData.getMedidaCorporal(codMedida);       
    }
    
}
