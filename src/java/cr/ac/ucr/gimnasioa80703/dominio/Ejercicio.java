/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.dominio;

/**
 *
 * @author Carlos
 */
public class Ejercicio {
    
    private int codEjercicio;
    private String nombreEjercicio;
    private int codEquipo;
    private CatergoriaEjercicio categoria;

    public Ejercicio() {
    }

    public Ejercicio(int codEjercicio, String nombreEjercicio, int codEquipo,
            CatergoriaEjercicio categoria) {
        
        this.codEjercicio = codEjercicio;
        this.nombreEjercicio = nombreEjercicio;
        this.codEquipo = codEquipo;
        this.categoria = categoria;
    }

    public CatergoriaEjercicio getCategoria() {
        return categoria;
    }

    public void setCategoria(CatergoriaEjercicio categoria) {
        this.categoria = categoria;
    }

    public int getCodEjercicio() {
        return codEjercicio;
    }

    public void setCodEjercicio(int codEjercicio) {
        this.codEjercicio = codEjercicio;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public int getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(int codEquipo) {
        this.codEquipo = codEquipo;
    }        
    
}
