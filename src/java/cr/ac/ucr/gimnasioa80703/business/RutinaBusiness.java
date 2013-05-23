/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.business;

import cr.ac.ucr.gimnasioa80703.data.RutinaData;
import cr.ac.ucr.gimnasioa80703.dominio.Rutina;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class RutinaBusiness {
    
    private RutinaData rutinaData;

    public RutinaBusiness() throws SQLException {
        rutinaData = new RutinaData();        
    }
    
    public Rutina insertar(Rutina rutina) throws SQLException {
        return rutinaData.insertar(rutina);
    }
    
    
}
