<!doctype html>
<html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

  <link rel="stylesheet" type="text/css" href="css/navbar.css">
  <link rel="stylesheet" href="css/forum.css">


  <script src="Js/jquery.min.js"></script>
  <script src="Js/scriptValida.js"></script>
  <title>Cadastro</title>

</head>
<body background="img/Lizards2.0.jpg">
  <nav class="navbar navbar-dark cor2">
    <a class="navbar-brand" href="HomePage.html">
      <img src="img\logo.png" width="30" height="30" class="d-inline-block align-top titulo" alt="">
      GeoMatic
    </a>
  </nav>
  <nav class="nav nav-pills flex-column flex-sm-row cor">
    <a class="flex-sm-fill text-sm-center nav-link" href="Olimpiadas.html">Olimpiadas</a>
    <a class="flex-sm-fill text-sm-center nav-link" href="Calendario.html">Calendario</a>
    <a class="flex-sm-fill text-sm-center nav-link" href="Curiosidades.html">Curiosidades</a>
    <a class="flex-sm-fill text-sm-center nav-link" href="Medalhas.html">Medalhas</a>
    <a class="flex-sm-fill text-sm-center nav-link" href="\GeoMatic\Forum.html">Forum</a>
    <a class="flex-sm-fill text-sm-center nav-link" href="#">Software</a>
  </nav>

  <div class="container mt-5">
    <div class="caixa">

      <p id="erro">Form preenchido erro</p>
      <form id="cadastro" method="get" action="cadastrado.php">
      <div class="input-group mb-3">
        <div class="input-group-prepend">
          <span class="input-group-text" id="nome">Nome</span>
        </div>
        <input id="nomeInput" type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="nome">
      </div>
      <div class="input-group mb-3">
        <div class="input-group-prepend">
          <span class="input-group-text" id="nick">Nickname</span>
        </div>
        <input id="nickInput" type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="nick">
      </div>
      <div class="input-group mb-3">
        <div class="input-group-prepend">
          <span class="input-group-text" id="senha">Senha</span>
        </div>
        <input id="senhaInput" type="password" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="senha">
      </div>
      <div class="input-group mb-3">
        <div class="input-group-prepend">
          <span class="input-group-text" id="confSenha">Confirmar senha</span>
        </div>
        <input id="confSenhaInput" type="password" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
      </div>
      <div class="input-group mb-3">
        <div class="input-group-prepend">
          <span class="input-group-text" id="email">Email</span>
        </div>
        <input id="emailInput" type="email" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="email">
      </div>
      <div class="input-group mb-3">
        <div class="input-group-prepend">
          <span class="input-group-text" id="confEmail">Confirmar email</span>
        </div>
        <input id="confEmailInput" type="email" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
      </div>
      <div class="input-group mb-3">
        <div class="input-group-prepend">
          <span class="input-group-text" id="phone">Telefone</span>
        </div>
        <input id="phoneInput" type="number" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="phone">
      </div>

      <div class="input-group mb-3">
        <div class="input-group-prepend">
          <label class="input-group-text" for="tipoUsuario" id="select">Tipo de Usuário</label>
        </div>
        <select class="custom-select" id="tipoUsuario" name="codTipo">
          <option value="0">Choose...</option>
          <option value="1">Escola</option>
          <option value="2">Professor</option>
          <option value="3">Aluno</option>
          <option value="4">Outro</option>
        </select>
      </div>

      <!--<button id="enviar" class="btn submit" type="submit">Enviar</button>-->
      <input type="submit" value="Enviar" id="enviar" class="btn submit">
    </form>

    </div>

  </div>

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
