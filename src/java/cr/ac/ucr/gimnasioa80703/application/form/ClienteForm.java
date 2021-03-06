/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.application.form;

import java.sql.Date;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Carlos
 */
public class ClienteForm extends org.apache.struts.action.ActionForm {
        
    private int codCliente;
    private String nombreCliente;
    private String apellidosCliente;
    private Date fechaNacimiento;
    private String telefono;
    private String direccion;
    private String nombreContactoEmergencia;
    private String telContactoEmergencia;   

    public ClienteForm() {
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreContactoEmergencia() {
        return nombreContactoEmergencia;
    }

    public void setNombreContactoEmergencia(String nombreContactoEmergencia) {
        this.nombreContactoEmergencia = nombreContactoEmergencia;
    }

    public String getTelContactoEmergencia() {
        return telContactoEmergencia;
    }

    public void setTelContactoEmergencia(String telContactoEmergencia) {
        this.telContactoEmergencia = telContactoEmergencia;
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if(this.nombreCliente == null || this.nombreCliente.equalsIgnoreCase("")){
            errors.add("errors", new ActionMessage("error.falta.nombre.cliente"));
        }
        if(this.apellidosCliente == null || this.apellidosCliente.equalsIgnoreCase("")){
            errors.add("errors", new ActionMessage("error.falta.apellidos.cliente"));
        }
        if(this.fechaNacimiento == null){
            errors.add("errors", new ActionMessage("error.falta.fecha.nacimiento.cliente"));
        }
        if(this.telefono == null || this.telefono.equalsIgnoreCase("")){
            errors.add("errors", new ActionMessage("error.falta.telefono.cliente"));
        }
        if(this.direccion == null || this.direccion.equalsIgnoreCase("")){
            errors.add("errors", new ActionMessage("error.falta.direccion.cliente"));
        }
        if(this.nombreContactoEmergencia == null || this.nombreContactoEmergencia.equalsIgnoreCase("")){
            errors.add("errors", new ActionMessage("error.falta.nombre.contacto.cliente"));
        }
        if(this.telContactoEmergencia == null || this.telContactoEmergencia.equalsIgnoreCase("")){
            errors.add("errors", new ActionMessage("error.falta.telefono.contacto.cliente"));
        }
        return errors;
    }
}
