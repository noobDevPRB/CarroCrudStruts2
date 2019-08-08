function abrirConfirmarDeletar(idCarro) {
	var confirmacao = confirm("Deseja realmente deletar o registro ID: "
			+ idCarro);
	if (confirmacao) {
		window.location.href = "removerCarro?carroForm.idForm=" + idCarro;
	}
}

function abrirModalDeletar(idCarro) {
	window.location.href = "#abrir";
	document.getElementById("idCarroModal").value = idCarro;
}

function deletarCarro() {
	var idCarro = document.getElementById("idCarroModal").value;
	window.location.href = "removerCarro?carroForm.idForm=" + idCarro;
}
