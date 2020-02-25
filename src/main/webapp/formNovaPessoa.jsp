<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova Pessoa</title>
</head>
	<body>
		<form action="/sistema.gerenciador.pessoas/novaPessoa" method="post">
			 Nome: <input type="text" name="nome"/><br>
			Email: <input type="text" name="email"/><br>
			<input type="submit"/>
		</form>
	</body>
</html>