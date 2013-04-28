/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.dominio;

import java.sql.Date;

/**
 *
 * @author Equipo
 */
public class Cliente {
    
    private int codCliente;
    private String nombreCliente;
    private String apellidosCliente;
    private Date fechaNacimiento;
    private String telefono;
    private String direccion;
    private String nombreContactoEmergencia;
    private String telContactoEmergencia;    

    public Cliente() {
    }

    public Cliente(int codCliente, String nombreCliente,String apellidosCliente,
            Date fechaNacimiento, String telefono, String direccion,
            String nombreContactoEmergencia, String telContactoEmergencia) {
        
        this.codCliente = codCliente;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombreContactoEmergencia = nombreContactoEmergencia;
        this.telContactoEmergencia = telContactoEmergencia;
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
    
    
    
}
