<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<link href="css/style.css" rel="stylesheet">
	<meta charset="utf-8">
	<title>Consulta das Ofertas de Carros</title>
</head>
<body>
	<div>
		<table border="1">
			<tr>
				<th colspan="7"  >lista dos Carros</th>
			<tr>
		
			<c:forEach items="${listaDeCarrosForm}" var="carroForm">
				<tr>
					<td><a	href="detalharCarro?carroForm.idForm=${carroForm.idForm}">Detalhes</a></td>
					
					<td><c:out value="${carroForm.idForm}" /></td>
					<td><c:out value="${carroForm.marcaForm}" /></td>
					<td><c:out value="${carroForm.modeloForm}" /></td>
					<td><c:out value="${carroForm.valorForm}" /></td>	
			
					<td><a	href='javascript:abrirModalDeletar("${carroForm.idForm}")'>Remover Modal</a></td>
					<td><a	href="atualizarCarroPagina?carroForm.idForm=${carroForm.idForm}">Alterar</a></td>						
				</tr>
			</c:forEach>
		</table>
		<a href="http://localhost:8080/loja_carro/index.jsp">Página Inicial</a><br>
	</div>
	
	<div id="abrir" class="modal">
		<div>
			<p class="p-center">Deseja remover o item?</p>
		</div>
		<div>
			<input type="hidden" id="idCarroModal" />  
			<a href="javascript:deletarCarro()" class="boataoFechar">SIM</a>
    		<a href="#fechar"class="boataoFechar">NÂO</a>	  
		</div>
	</div>
	
<script src="js/js.loja-carro.js"></script>
</body>
</html>