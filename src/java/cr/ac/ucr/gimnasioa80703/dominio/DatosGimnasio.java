/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.dominio;

/**
 *
 * @author Carlos
 */
public class DatosGimnasio {
    
    private String nombreGimnasio;
    private String telefonoGimnasio;
    private String direccion;
    private int diasHabilesRutina;

    public DatosGimnasio() {
    }

    public DatosGimnasio(String nombreGimnasio, String telefonoGimnasio, String direccion, int diasHabilesRutina) {
        this.nombreGimnasio = nombreGimnasio;
        this.telefonoGimnasio = telefonoGimnasio;
        this.direccion = direccion;
        this.diasHabilesRutina = diasHabilesRutina;
    }

    public String getNombreGimnasio() {
        return nombreGimnasio;
    }

    public void setNombreGimnasio(String nombreGimnasio) {
        this.nombreGimnasio = nombreGimnasio;
    }

    public String getTelefonoGimnasio() {
        return telefonoGimnasio;
    }

    public void setTelefonoGimnasio(String telefonoGimnasio) {
        this.telefonoGimnasio = telefonoGimnasio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDiasHabilesRutina() {
        return diasHabilesRutina;
    }

    public void setDiasHabilesRutina(int diasHabilesRutina) {
        this.diasHabilesRutina = diasHabilesRutina;
    }
        
}
