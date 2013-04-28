/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.dominio;

/**
 *
 * @author Equipo
 */
public class Rol {
    
    private int codRol;
    private String nombreRol;

    public Rol() {
    }

    public Rol(int codRol, String nombreRol) {
        this.codRol = codRol;
        this.nombreRol = nombreRol;
    }
        
    public int getCodRol() {
        return codRol;
    }

    public void setCodRol(int codRol) {
        this.codRol = codRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
    
}
