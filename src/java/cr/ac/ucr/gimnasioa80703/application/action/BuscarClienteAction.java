/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.application.action;

import cr.ac.ucr.gimnasioa80703.business.ClienteBusiness;
import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Carlos
 */
public class BuscarClienteAction extends DispatchAction {
    
    private LinkedList<Cliente> clientes;

    public ActionForward iniciar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        clientes = new LinkedList<>();
        request.setAttribute("clientes", clientes);
        
        
        return mapping.getInputForward();
    }

    public ActionForward buscar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        ClienteBusiness clienteBuss = new ClienteBusiness();
        clientes = 
                clienteBuss.getClientes(String.valueOf(request.getParameter("apellidosCliente")));
        request.setAttribute("clientes", clientes);
        
        return mapping.getInputForward();
    }
}