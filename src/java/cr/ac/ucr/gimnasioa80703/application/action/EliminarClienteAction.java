/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.application.action;

import cr.ac.ucr.gimnasioa80703.application.form.ClienteForm;
import cr.ac.ucr.gimnasioa80703.business.ClienteBusiness;
import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionErrors;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Carlos
 */
public class EliminarClienteAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String EXITO = "success";
    private final static String NOEXITO = "error";
    /**
     * This is the Struts action method called on http://.../actionPath?method=myAction1, where
     * "method" is the value specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward iniciar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ClienteBusiness clienteBus = new ClienteBusiness();
        Cliente cliente = clienteBus.getCliente(Integer.parseInt(request.getParameter("codCliente")));
        request.setAttribute("cliente", cliente);

        return mapping.getInputForward();
    }

    /**
     * This is the Struts action method called on http://.../actionPath?method=myAction2, where
     * "method" is the value specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward eliminar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ClienteBusiness clienteBus = new ClienteBusiness();
        try {
            clienteBus.eliminarCliente(Integer.valueOf(request.getParameter("codCliente")));
            request.setAttribute("titulo", "titulo.eliminar.cliente");
            request.setAttribute("titulo", "mensaje.exito.cliente.eliminado");
            return mapping.findForward(EXITO);
            
        } catch (SQLException e) {
            request.setAttribute("titulo","titulo.eliminar.cliente");
            request.setAttribute("mensaje","error.bd.eliminar.cliente");
            return mapping.findForward(NOEXITO);
        }
        
    }
}