<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Carros</title>
</head>
<body>
 	
	<form action="cadastrarCarro"method="post">
	
		<input type="text" placeholder="marca" name="carroForm.marcaForm"><br>
		<input type="text" placeholder="modelo" name="carroForm.modeloForm"><br>
		<input type="text" placeholder="descri��o do modelo" name="carroForm.descModeloForm"><br>
		<input type="text" placeholder="portas" name="carroForm.nPortasForm"><br>
		<input type="text" placeholder="ano" name="carroForm.AnoForm"><br>
		<input type="text" placeholder="tipo" name="carroForm.tipoForm"><br>
		<input type="number" placeholder="valor" name="carroForm.valorForm"><br>
		
		<input type="submit" value="Adicionar Carro">
		
	</form>
	<a href="http://localhost:8080/loja_carro/index.jsp">P�gina Inicial</a><br>
	
</body>
</html>