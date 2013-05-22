<%-- 
    Document   : eliminar_cliente
    Created on : 22/05/2013, 09:26:46 AM
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="titulo.eliminar.cliente"/></title>
    </head>
    <body>
        <h1><bean:message key="titulo.eliminar.cliente"/></h1>
        <html:form action="/eliminarCliente" method="get">
            <input type="hidden" name="metodo" value="eliminar">
            <bean:message key="label.codigo.cliente"/><html:text property="codCliente" value="${cliente.codCliente}"/><br>
            <bean:message key="label.nombre.cliente"/>${cliente.nombreCliente}<br>
            <bean:message key="label.apellidos.cliente"/>${cliente.apellidosCliente}<br>
            <input type="submit" value="<bean:message key="boton.eliminar.cliente"/>"/>
            <input type="button" value="<bean:message key="boton.cancelar"/>"/>
        </html:form>        
    </body>
</html>
