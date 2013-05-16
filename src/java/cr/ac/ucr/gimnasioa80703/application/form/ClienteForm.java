/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.application.form;

import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.Date;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

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
//    private LinkedList<Cliente> clientes;

    public ClienteForm() {
    }

//    public LinkedList<Cliente> getClientes() {
//        return clientes;
//    }
//
//    public void setClientes(LinkedList<Cliente> clientes) {
//        this.clientes = clientes;
//    }

    
    
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
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        return errors;
    }
}
