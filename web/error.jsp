<%-- 
    Document   : error
    Created on : 30/04/2013, 08:14:41 PM
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="${titulo}"/></title>
    </head>
    <body>
        <h1><bean:message key="${mensaje}"/></h1>
    </body>
</html>
