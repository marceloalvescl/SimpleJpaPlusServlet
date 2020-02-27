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
	<div style="display: inline-block; padding: 1.5em; border-right: 1px solid black; ">
		<ul>
			<% List<Pessoa> pessoas = (List<Pessoa>) request.getAttribute("pessoas");
			for(Pessoa pessoa : pessoas){
			%>
			<li><%= pessoa.getId() + "- Nome: " + pessoa.getNome() + " - Email: " + pessoa.getEmail()%></li>
			<br>
			<%
			}
			%>
			
		</ul>
	</div>
	<div style="display: inline-block; margin-left: 1.5em; padding: 1.5em">
		<form action="/sistema.gerenciador.pessoas/alterarPessoa" method="post">	
			<h2>Alterar Pessoa</h2>
			Id da pessoa: <input type="number" name="id"><br>
			Novo nome: <input type="text" name="novoNome"><br>
			Novo email: <input type="text" name="novoEmail"><br>
			<input type="submit" >
		</form>
	</div>
		
		
		
		
			
	</body>
</html>