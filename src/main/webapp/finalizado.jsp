<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.Pessoa"%>
<%@page import="cadastro.Cadastro" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parabéns!!!</title>
<link rel="stylesheet" type="text/css" href="style2.css">
</head>
<body>


	<h1 class="titulo">Cadastro Realizado com Sucesso!!</h1>

	<%Pessoa pessoa =(Pessoa) request.getAttribute("pessoa");%>
	
	<p class="texto">${genero} ${pessoa.nome} ${pessoa.sobrenome}, ${retorno} Obrigado por realizar o cadastro em nosso site.</p>

	<p class="texto"><a href="Index.html">Voltar ao Início</a></p>


</body>
</html>