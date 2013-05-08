<%-- 
    Document   : buscar_cliente
    Created on : 07/05/2013, 06:26:42 PM
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="titulo.buscar.cliente"/></title>
    </head>
    <body>
        <form action="./buscarCliente.do" method="get">
            <input type="hidden" name="metodo" value="buscar">
            <bean:message key="label.buscar.apellidos.cliente"/>
            <input type="text" name="apellidosCliente"/>
            <input type="submit" value="<bean:message key="button.buscar"/>"/>            
        </form>
        <br><br> 
    </body>
</html>
