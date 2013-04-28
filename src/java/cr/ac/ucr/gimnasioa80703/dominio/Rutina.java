/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.dominio;

import java.sql.Date;
import java.util.LinkedList;

/**
 *
 * @author Equipo
 */
public class Rutina {

    private int codRutina;
    private Date fechaCreacion;
    private Date fechaRenovacion;
    private String objetivoCliente;
    private String enfermadadesCliente;
    private Cliente cliente;
    private LinkedList<ItemRutinaMedida> itemesRutinaMedida;
    private LinkedList<ItemRutinaEjercicio> itemesRutinaEjercicio;

    public Rutina() {
    }

    public Rutina(int codRutina, Date fechaCreacion, Date fechaRenovacion, String objetivoCliente, 
            String enfermadadesCliente, Cliente cliente){
        
        this.codRutina = codRutina;
        this.fechaCreacion = fechaCreacion;
        this.fechaRenovacion = fechaRenovacion;
        this.objetivoCliente = objetivoCliente;
        this.enfermadadesCliente = enfermadadesCliente;
        this.cliente = cliente;
        itemesRutinaMedida = new LinkedList<ItemRutinaMedida>();
        itemesRutinaEjercicio = new LinkedList<ItemRutinaEjercicio>();
    }

    public LinkedList<ItemRutinaEjercicio> getItemesRutinaEjercicio() {
        return itemesRutinaEjercicio;
    }

    public void setItemesRutinaEjercicio(LinkedList<ItemRutinaEjercicio> itemesRutinaEjercicio) {
        this.itemesRutinaEjercicio = itemesRutinaEjercicio;
    }

    public LinkedList<ItemRutinaMedida> getItemesRutinaMedida() {
        return itemesRutinaMedida;
    }

    public void setItemesRutinaMedida(LinkedList<ItemRutinaMedida> itemesRutinaMedida) {
        this.itemesRutinaMedida = itemesRutinaMedida;
    }

    public int getCodRutina() {
        return codRutina;
    }

    public void setCodRutina(int codRutina) {
        this.codRutina = codRutina;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }

    public void setFechaRenovacion(Date fechaRenovacion) {
        this.fechaRenovacion = fechaRenovacion;
    }

    public String getObjetivoCliente() {
        return objetivoCliente;
    }

    public void setObjetivoCliente(String objetivoCliente) {
        this.objetivoCliente = objetivoCliente;
    }

    public String getEnfermadadesCliente() {
        return enfermadadesCliente;
    }

    public void setEnfermadadesCliente(String enfermadadesCliente) {
        this.enfermadadesCliente = enfermadadesCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
