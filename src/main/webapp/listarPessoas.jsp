<%@page import="java.util.List"%>
<%@page import="br.com.marcelo.sgp.entidades.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Pessoas</title>
	</head>
	<body>
		<ul>
			<% List<Pessoa> pessoas = (List<Pessoa>) request.getAttribute("pessoas");
			for(Pessoa pessoa : pessoas){
			%>
			<li>Nome: <%=pessoa.getNome() + " - Email: " + pessoa.getEmail()%></li>
			<br>
			<%
			}
			%> 	
			
		</ul>
			
	</body>
</html>