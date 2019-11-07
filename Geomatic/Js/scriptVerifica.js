$(document).ready(function(){

  
  $("#erro").hide();


  $("#enviar").click(function(){
  	if($("#nomeInput").val()==""){
  		$("#erro").show();
     	$("#nome").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
     	return false;
  	}
  	if($("#siglaInput").val()==""){
  		$("#erro").show();
     	$("#sigla").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
     	return false;
  	}
    if($("#Textarea").val()==""){
      $("#erro").show();
      $("#text").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
      return false;
    }
  });
});