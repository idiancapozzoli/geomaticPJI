$(document).ready(function(){
	$("#erro").hide();
	$("#envio").click(function(){
		if($("#exampleFormControlTextarea1").val()==""){
			$("#erro").show();
			alert("Erro ao preencher topico");
			return false;
		}
		if($("#tipoTopico").val() == 0){
			$("#erro").show();
			alert("Erro ao selecionar tipo de topico");
			return false;
		}

	});
});