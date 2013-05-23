<%-- 
    Document   : insertar_rutina
    Created on : 30/04/2013, 08:14:54 PM
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<%@taglib prefix="logic" uri="/WEB-INF/struts-logic.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="titulo.insertar.rutina"/></title>
    </head>
    <body>
        <script language="javascript">
            window.onload = incluirMedida();

            function incluirMedida() {
                document.getElementById("metodo").value = "incluirMedida";
            }
            function salvar() {
                document.getElementById("metodo").value = "salvar";
            }
        </script>
        <strong><bean:message key="label.creacion.rutina"/></strong><br><br>
        <html:form action="/insertarRutina" method="get">
            <input type="hidden" name="metodo" id="metodo">
            <bean:message key="label.nombre.cliente"/>
            <html:select property="codCliente">
                <logic:iterate name="clientes" id="clienteActual">
                    <html:option value="${clienteActual.codCliente}">
                        ${clienteActual.nombreCliente} ${clienteActual.apellidosCliente}
                    </html:option>
                </logic:iterate>
            </html:select><br>
            <bean:message key="label.objetivo.cliente"/>
            <html:textarea property="objetivoCliente"/><br>
            <bean:message key="label.enfermedades.cliente"/>
            <html:textarea property="enfermadadesCliente"/><br>
            <bean:message key="label.medida.corporal"/><br>
            <html:select property="codMedida">
                <logic:iterate name="medidas" id="medidaActual">
                    <html:option value="${medidaActual.codMedida}">
                        ${medidaActual.nombreMedida}
                    </html:option>
                </logic:iterate>
            </html:select><br>
            <bean:message key="label.valor.medida"/>
            <html:text property="valorMedida"/>
            <input type="submit" 
                   value="<bean:message key="button.incluir.medida"/>" onclick="incluirMedida();">
            <br>
            <table BORDER=1 WIDTH=300> 
                <tr> 
                    <td>Medida</td> 
                    <td>Unidad</td> 
                    <td>Valor</td> 
                </tr> 
                <logic:iterate name="itemesRutinaMedida" id="itemActual">
                    <tr>
                        <td>${itemActual.medidaCorporal.nombreMedida}</td>
                        <td>${itemActual.medidaCorporal.unidadMedida}</td>
                        <td>${itemActual.valorMedida}</td>
                    </tr> 
                </logic:iterate>
            </table>
            <input type="submit" 
                   value="<bean:message key="button.insertar.rutina"/>" onclick="salvar();">
        </html:form>

    </body>
</html>
