$(document).ready(function(){
	$("#erro").hide();
	$("#envio").click(function(){
		if($("#exampleFormControlTextarea1").val() == ""){
			$("#erro").show();
			alert("escreva algo no comentario");
			return false;
	}
	});
});