/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.application.action;

import cr.ac.ucr.gimnasioa80703.application.form.RutinaForm;
import cr.ac.ucr.gimnasioa80703.business.ClienteBusiness;
import cr.ac.ucr.gimnasioa80703.business.MedidaCorporalBusiness;
import cr.ac.ucr.gimnasioa80703.business.RutinaBusiness;
import cr.ac.ucr.gimnasioa80703.dominio.Cliente;
import cr.ac.ucr.gimnasioa80703.dominio.ItemRutinaMedida;
import cr.ac.ucr.gimnasioa80703.dominio.MedidaCorporal;
import cr.ac.ucr.gimnasioa80703.dominio.Rutina;
import java.sql.Date;
import java.sql.SQLException;
import java.util.LinkedList;
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
public class InsetarRutinaAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String EXITO = "success";
    private final static String NOEXITO = "error";
    private LinkedList<MedidaCorporal> medidasCorporales;
    private LinkedList<ItemRutinaMedida> itemesRutinaMedida;

    /**
     * This is the Struts action method called on http://.../actionPath?method=myAction1, where
     * "method" is the value specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward iniciar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ClienteBusiness clienteBus = new ClienteBusiness();

        LinkedList<Cliente> clientes = clienteBus.getClientes();
        request.setAttribute("clientes", clientes);
        MedidaCorporalBusiness medidaBus = new MedidaCorporalBusiness();
        medidasCorporales = medidaBus.getMedidasCorporales();
        request.setAttribute("medidas", this.medidasCorporales);
        itemesRutinaMedida = new LinkedList<>();
        request.setAttribute("itemesRutinaMedida", itemesRutinaMedida);


        return mapping.getInputForward();
    }

    /**
     * This is the Struts action method called on http://.../actionPath?method=myAction2, where
     * "method" is the value specified in <action> element : ( <action parameter="method" .../> )
     */
    public ActionForward salvar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RutinaForm rutinaForm = (RutinaForm) form;
        ActionErrors errors = rutinaForm.validate(mapping, request);
        ClienteBusiness clienteBus = new ClienteBusiness();

        if (errors.isEmpty()) {
            Rutina rutina = new Rutina();            
            Cliente cliente = clienteBus.getCliente(rutinaForm.getCodCliente());
            rutina.setFechaCreacion(new Date(new java.util.Date().getTime()));
            rutina.setObjetivoCliente(rutinaForm.getObjetivoCliente());
            rutina.setEnfermadadesCliente(rutinaForm.getEnfermadadesCliente());
            rutina.setCliente(cliente);
            rutina.setItemesRutinaMedida(this.itemesRutinaMedida);
            RutinaBusiness rutinaBus = new RutinaBusiness();
            try {
                rutinaBus.insertar(rutina);
                request.setAttribute("titulo", "titulo.insertar.rutina");
                request.setAttribute("mensaje", "mensaje.exito.rutina.insertada");
                return mapping.findForward(EXITO);

            } catch (SQLException ex) {
                request.setAttribute("titulo", "titulo.eliminar.cliente");
                request.setAttribute("mensaje", "error.bd");
                return mapping.findForward(NOEXITO);
            }//try-catch

        }//if-no hay errores
        
        LinkedList<Cliente> clientes = new LinkedList<>();
        clientes.add(clienteBus.getCliente(rutinaForm.getCodCliente()));
        request.setAttribute("clientes", clientes);
               
        this.saveErrors(request, errors);

        return mapping.getInputForward();

    }

    public ActionForward incluirMedida(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ClienteBusiness clienteBus = new ClienteBusiness();
        LinkedList<Cliente> clientes = new LinkedList<>();
        clientes.add(clienteBus.getCliente(Integer.valueOf(request.getParameter("codCliente"))));
        request.setAttribute("clientes", clientes);
        request.setAttribute("medidas", this.medidasCorporales);
        MedidaCorporalBusiness medidaCorpBus = new MedidaCorporalBusiness();
        MedidaCorporal medidaCorporal = medidaCorpBus.getMedidaCorporal(Integer.valueOf(request.getParameter("codMedida")));
        ItemRutinaMedida itemMedida = new ItemRutinaMedida();
        itemMedida.setMedidaCorporal(medidaCorporal);
        itemMedida.setValorMedida(Float.valueOf(request.getParameter("valorMedida")));
        itemesRutinaMedida.add(itemMedida);
        request.setAttribute("itemesRutinaMedida", this.itemesRutinaMedida);

        return mapping.getInputForward();
    }
}