<%-- 
    Document   : index
    Created on : Dec 13, 2020, 6:59:30 PM
    Author     : garfi
--%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="useraction.action">
            <s:textfield label="User"  name="user.name"></s:textfield>
            <s:textfield label ="City" name="user.city"></s:textfield>
            <s:submit  value="Ingresar"></s:submit>
        </s:form>
    </body>
</html>
