<!doctype html>
<html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

  <link rel="stylesheet" type="text/css" href="css/navbar.css">
  <link rel="stylesheet" href="css/forum.css">


  <script src="Js/jquery.min.js"></script>
  <script src="Js/scriptVerifica.js"></script>
  <title>ADD-Olimp</title>

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

      <p id="erro">Campos preenchidos errados</p>
      <form id="cadastro" method="get" action="enviado.php">
          <div class="form-group">
            <label for="nomeInput" id="nome" class="alert alert-dark border border-dark">Nome da Olimpiada</label>
            <input type="text" class="form-control" id="nomeInput" name="nome">
          </div>
          <div class="form-group">
            <label for="nomeInput" id="sigla" class="alert alert-dark border border-dark">Sigla da Olimpiada</label>
            <input type="text" class="form-control" id="siglaInput" name="nick">
          </div>
         <div class="form-group">
            <label for="exampleFormControlTextarea1" class="alert alert-dark border border-dark" id="Text">Conteudo da Olimpiada:</label>
            <textarea class="form-control" id="Textarea" rows="3" name="texto"></textarea>
          </div>
          <div class="form-group">
              <label for="exampleFormControlFile1" class="alert alert-dark border border-dark">Escolher uma imagem modelo(opcional)</label>
              <input type="file" class="form-control-file" id="file">
            </div>

      <input type="submit" value="Enviar" id="enviar" class="btn submit">
    </form>

      </div>

    </div>


    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>