/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.dominio;

/**
 *
 * @author Carlos
 */
public class ItemRutinaEjercicio {
    
    private int seriesEjercicio;
    private int repeticionesEjercicio;
    private Ejercicio ejercicio;

    public ItemRutinaEjercicio() {
    }
        
    public ItemRutinaEjercicio(int seriesEjercicio, int repeticionesEjercicio, Ejercicio ejercicio) {
        this.seriesEjercicio = seriesEjercicio;
        this.repeticionesEjercicio = repeticionesEjercicio;
        this.ejercicio = ejercicio;
    }

    public int getSeriesEjercicio() {
        return seriesEjercicio;
    }

    public void setSeriesEjercicio(int seriesEjercicio) {
        this.seriesEjercicio = seriesEjercicio;
    }

    public int getRepeticionesEjercicio() {
        return repeticionesEjercicio;
    }

    public void setRepeticionesEjercicio(int repeticionesEjercicio) {
        this.repeticionesEjercicio = repeticionesEjercicio;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }
    
}
