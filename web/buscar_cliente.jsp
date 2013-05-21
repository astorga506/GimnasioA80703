<%-- 
    Document   : buscar_cliente
    Created on : 07/05/2013, 06:26:42 PM
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@taglib prefix="logic" uri="/WEB-INF/struts-logic.tld"%>
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
        <table BORDER=1 WIDTH=300> 
                <tr> 
                    <td>ID</td> 
                    <td>Apellidos</td> 
                    <td>Nombre</td>
                    <td>Accion</td>
                </tr> 
                <logic:iterate name="clientes" id="clienteActual">
                    <tr>
                        <td>${clienteActual.codCliente}</td>
                        <td>${clienteActual.apellidosCliente}</td>
                        <td>${clienteActual.nombreCliente}</td>
                        <td><a href="./editarCliente.do?metodo=iniciar&codCliente=${clienteActual.codCliente}" >Editar</a>  Eliminar</td>
                    </tr> 
                </logic:iterate>
            </table>        
        <br><br> 
    </body>
</html>
