<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th colspan="2">Detalhes do Carro</th>
		<tr>
				
			<tr>
				<td>MARCA</td>
				<td>${carroForm.marcaForm}</td>
			</tr>
			<tr>
				<td>MODELO</td>
				<td>${carroForm.modeloForm}</td>
			</tr>
			<tr>
				<td>ANO</td>
				<td>${carroForm.anoForm}</td>
			</tr>
			<tr>
				<td>DESCRIÇÃO</td>
				<td>${carroForm.descModeloForm}</td>
			</tr>
			<tr>
				<td>PORTAS</td>
				<td>${carroForm.nPortasForm}</td>
			</tr>
			<tr>
				<td>TIPO</td>
				<td>${carroForm.tipoForm}</td>
			</tr>
			<tr>
				<td>PREÇO</td>
				<td>${carroForm.valorForm}</td>
			</tr>
			
	</table>
	<a href="http://localhost:8080/loja_carro/cadastroDeCarros">Cadastro Novamente</a><br>
	<a href="http://localhost:8080/loja_carro/index.jsp">Página Inicial</a><br>
</body>
</html>