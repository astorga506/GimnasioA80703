/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.application.form;

import cr.ac.ucr.gimnasioa80703.dominio.ItemRutinaMedida;
import cr.ac.ucr.gimnasioa80703.dominio.MedidaCorporal;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Carlos
 */
public class RutinaForm extends org.apache.struts.action.ActionForm {
    
    private int codCliente;
    private int codMedida; 
    private float valorMedida;
    private String nombreCliente;
    private String apellidosCliente;    
    private String objetivoCliente;
    private String enfermadadesCliente;
    private LinkedList<ItemRutinaMedida> itemesRutinaMedida;

    public RutinaForm() {
    }

    public float getValorMedida() {
        return valorMedida;
    }

    public void setValorMedida(float valorMedida) {
        this.valorMedida = valorMedida;
    }
    
    public int getCodMedida() {
        return codMedida;
    }

    public void setCodMedida(int codMedida) {
        this.codMedida = codMedida;
    }

    public int getCodCliente() {
        return codCliente;
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

    public LinkedList<ItemRutinaMedida> getItemesRutinaMedida() {
        return itemesRutinaMedida;
    }

    public void setItemesRutinaMedida(LinkedList<ItemRutinaMedida> itemesRutinaMedida) {
        this.itemesRutinaMedida = itemesRutinaMedida;
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
   
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if(this.objetivoCliente == null || this.objetivoCliente.equalsIgnoreCase("")){
            errors.add("Errores", new ActionMessage("error.objetivo.no.ingresado"));
        }
        
        if(this.enfermadadesCliente == null || this.enfermadadesCliente.equalsIgnoreCase("")){
            errors.add("Errores", new ActionMessage("error.enfermades.no.ingresadas"));
        }
        
        if(this.valorMedida <= 0.0){
            errors.add("Errores", new ActionMessage("error.valor.medida.invalido"));
        }
        
        return errors;
    }
}
