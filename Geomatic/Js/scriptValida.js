$(document).ready(function(){

  
  $("#erro").hide();


  $("#submit").click(function(){
    if($("#nomeInput").val()=="" ||  $("#nomeInput").val().length<3){
      $("#nome").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
      alert("Preencha o campo nome com mais de 3 caracteres");
      $("#erro").show();
      return false;
    }
    if($("#nickInput").val()=="" ||  $("#nickInput").val().length<3){
      $("#nick").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
      alert("Preencha o campo nick com mais de 3 caracteres");
      $("#erro").show();
      return false;
    }
    if(!($("#senhaInput").val().match(/[0-9]/)) || $("#senhaInput").val().length<5 || $("#senhaInput").val().length>20){
      $("#senha").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
      alert("Preencha o campo senha com mais de 5 caracteres, contendo numeros e menos de 20 caracteres");
      $("#erro").show();
      return false;
    }
    if(!($("#senhaInput").val() == $("#confSenhaInput").val())){
      $("#confSenha").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
      alert("Preencha o campo senha e confirmar senha igualmente");
      $("#erro").show();
      return false;
    }
    if(!($("#emailInput").val().match(/[@]/))){
      $("#email").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
      alert("Faltando @ no campo email");
      $("#erro").show();
      return false;
    }
    if(!($("#emailInput").val() == $("#confEmailInput").val())){
      $("#confEmail").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
      alert("Preencha o campo email e confirmar email igualmente");
      $("#erro").show();
      return false;
    }
    if($("#phoneInput").val().length > 11 || $("#phoneInput").val().length < 11){
      $("#phone").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
      alert("Telefone invalido, insira ddd");
      $("#erro").show();
      return false;
    }
    if($("#tipoUsuario").val() == 0){
      $("#select").css({"color":"red","background-color":"#F78181","border":"1px solid red"});
      alert("Selecione um tipo de usuario");
      $("#erro").show();
      return false;
    }


  });
});
