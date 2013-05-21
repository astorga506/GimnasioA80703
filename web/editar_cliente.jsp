<%-- 
    Document   : editar_cliente
    Created on : 16/05/2013, 04:10:26 PM
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="titulo.editar.cliente"/></title>
    </head>
    <body>
        <h1><bean:message key="titulo.editar.cliente"/></h1>
        <html:form action="/editarCliente" method="get">
            <input type="hidden" name="metodo" value="salvar">
            <bean:message key="cliente.codigo"/><html:text property="codCliente" value="${cliente.codCliente}"/><br>
            <bean:message key="cliente.nombre"/><html:text property="nombreCliente" value="${cliente.nombreCliente}"/><br>
            <bean:message key="cliente.apellidos"/><html:text property="aplellidosCliente" value="${cliente.apellidosCliente}"/><br>
            <bean:message key="cliente.fecha.nacimiento"/><html:text property="fechaNacimiento" value="${cliente.fechaNacimiento}"/><br>
            <bean:message key="cliente.telefono"/><html:text property="telefono" value="${cliente.telefono}"/><br>
            <bean:message key="cliente.direccion"/><html:text property="direccion" value="${cliente.direccion}"/><br>
            <bean:message key="cliente.nombre.contacto"/><html:text property="nombreContactoEmergencia" value="${cliente.nombreContactoEmergencia}"/><br>
            <bean:message key="cliente.telefono.contacto"/><html:text property="telContactoEmergencia" value="${cliente.telContactoEmergencia}"/><br>
            <input type="submit" value="<bean:message key="buton.editar.cliente"/>"/>
            </html:form>
    </body>
</html>