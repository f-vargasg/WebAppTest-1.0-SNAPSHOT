<%-- 
    Document   : listdata
    Created on : Dec 13, 2020, 9:43:20 PM
    Author     : garfi
--%>

<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
            table, th, td {
                border: 1px solid black;
            }

            table {
                width: 38%;
            }
        </style>
    </head>
    <body>
       <h2>Struts 2 pagination using display tag</h2>
	<display:table name="usuarioList" pagesize="12" requestURI="listuseraction.action">

		<display:caption>Lista de Usuarios</display:caption>

		<display:column property="nombre" title="Nombre" />
		<display:column property="apellido" title="Apellido" />
		<display:column property="correo" title="Correo" />

		<display:setProperty name="paging.banner.placement" value="bottom" />
	</display:table>

    </body>
</html>
