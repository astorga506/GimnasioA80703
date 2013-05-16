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
        <bean:message key="cliente.codigo"/><br>
        <bean:message key="cliente.nombre"/><br>
        <bean:message key="cliente.apellidos"/><br>
        <bean:message key="cliente.fecha.nacimiento"/><br>
        <bean:message key="cliente.telefono"/><br>
        <bean:message key="cliente.direccion"/><br>
        <bean:message key="cliente.nombre.contacto"/><br>
        <bean:message key="cliente.telefono.contacto"/><br>
        <bean:message key="buton.editar.cliente"/><br>
    </body>
</html>
