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
			<th>Detalhes do Carro</th>
		<tr>
		<tr>
			<td>ID<br>
			MARCA<br>
			MODELO<br>
			DESCRIÇÃO<br>
			ANO<br>
			PORTAS<br>
			TIPO<br>
			PREÇO</td>

			<td>
				<s:property value="carroForm.idForm" /><br> 
				<s:property	value="carroForm.marcaForm" /><br>
				<s:property value="carroForm.modeloForm" /><br> 
				<s:property value="carroForm.descModeloForm" /><br> 
				<s:property value="carroForm.anoForm" /><br>
				<s:property value="carroForm.nPortasForm" /><br> 
				<s:property value="carroForm.tipoForm" /><br> 
				<s:property	value="carroForm.valorForm" />
			</td>

		</tr>

	</table><br>
	
	<form action="atualizarCarro?carroForm.idForm=${carroForm.idForm}" method="post">

		<input type="text" placeholder="marca" name="carroForm.marcaForm"><br>
		<input type="text" placeholder="modelo" name="carroForm.modeloForm"><br>
		<input type="text" placeholder="descrição do modelo"name="carroForm.descModeloForm"><br> 
		<input type="text" placeholder="portas" name="carroForm.nPortasForm"><br> 
		<input type="text" placeholder="ano" name="carroForm.AnoForm"><br>
		<input type="text" placeholder="tipo" name="carroForm.tipoForm"><br>
		<input type="number" placeholder="valor" name="carroForm.valorForm"><br>

		<input type="submit" value="ATUALIZAR">
	</form>
</body>
</html>