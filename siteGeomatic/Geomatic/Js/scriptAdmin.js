$(document).ready(function(){

  
  $("#erro").hide();


  $("#enviar").click(function(){
  	if($("#nomeInput").val()!="admin"){
  		$("#erro").show();
     	$("#nome").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
     	return false;
  	}
  	if($("#senhaInput").val()!="idianthiago"){
  		$("#erro").show();
     	$("#senha").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
     	return false;
  	}
  });
});