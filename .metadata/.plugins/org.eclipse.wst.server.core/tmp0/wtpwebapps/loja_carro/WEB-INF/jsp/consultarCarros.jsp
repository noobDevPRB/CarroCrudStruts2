<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<meta charset="utf-8">
	<title>Consulta das Ofertas de Carros</title>
</head>
<body>
	<div>
		<form action="listarCarros" method=post>
			<input type="submit" value="listar todos"><br>
		</form>
	
		<table border="1">
			<tr>
				<th>lista dos Carros</th>
			<tr>
		
			<c:forEach items="${listaDeCarrosForm}" var="carroForm">
				<tr>
					<td><a	href="detalharCarro?carroForm.idForm=${carroForm.idForm}">Detalhes</a></td>
					
					<td><c:out value="${carroForm.idForm}" /></td>
					<td><c:out value="${carroForm.marcaForm}" /></td>
					<td><c:out value="${carroForm.modeloForm}" /></td>
					<td><c:out value="${carroForm.valorForm}" /></td>	
					
					<td><a	href="removerCarro?carroForm.idForm=${carroForm.idForm}">Remover</a></td>
					<td><a	href="atualizarCarroPagina?carroForm.idForm=${carroForm.idForm}">Alterar</a></td>						
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>