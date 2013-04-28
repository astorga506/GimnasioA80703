/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.dominio;

/**
 *
 * @author Carlos
 */
public class CatergoriaEjercicio {
    
    private int codCategoria;
    private String  nombreCategoria;

    public CatergoriaEjercicio() {
    }

    public CatergoriaEjercicio(int codCategoria, String nombreCategoria) {
        this.codCategoria = codCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
        
}
