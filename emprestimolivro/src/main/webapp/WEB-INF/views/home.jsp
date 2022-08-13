<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>App Empréstimo Livro</title>
</head>
<body>  
  <nav class="navbar navbar-expand-sm bg-light navbar-light">
    <div class="container-fluid">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" href="/">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/classes/solicitante">Solicitante</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/classes/emprestimo">Emprestimo</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/classes/livrofisico">Livro Fisico</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/classes/livrodigital">Livro Digital</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/classes/livroaudio">Livro Audio</a>
        </li>
      </ul>
    </div>
  </nav>
</div> 
    <div class="container mt-3">
      <h2>App Empréstimo Livro</h2>
      <p>Projeto de gestão de empréstimo de livros para uma biblioteca</p>
      
      <h3>Classe: Emprestimo</h3>
      <table class="table table-bordered" style="table-layout: fixed; width: 100%">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>dataInicio</td>
            <td>LocalDate</td>
            <td>Data de início do empréstimo do livro</td>
          </tr>
          <tr>
            <td>dataDevolucao</td>
            <td>LocalDate</td>
            <td>Data de devolução prevista do livro</td>
          </tr>
          <tr>
            <td>atraso</td>
            <td>boolean</td>
            <td>Indicativo se o livro está atrasado ou não</td>
          </tr>
        </tbody>
      </table>

      <br>

      <h3>Classe: Solicitante</h3>
      <table class="table table-bordered" style="table-layout: fixed; width: 100%">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do solicitante do empréstimo</td>
          </tr>
          <tr>
            <td>cpf</td>
            <td>String</td>
            <td>CPF do solicitante do empréstimo</td>
          </tr>
          <tr>
            <td>email</td>
            <td>String</td>
            <td>Email do solicitante do empréstimo</td>
          </tr>
        </tbody>
      </table>

      <br>

      <h3>Classe: Livro</h3>
      <table class="table table-bordered" style="table-layout: fixed; width: 100%">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>autor</td>
            <td>String</td>
            <td>Nome do autor do livro</td>
          </tr>
          <tr>
            <td>titulo</td>
            <td>String</td>
            <td>Nome do livro</td>
          </tr>
          <tr>
            <td>categoria</td>
            <td>String</td>
            <td>Categoria do livro</td>
          </tr>
        </tbody>
      </table>
      
      <br>

      <h3>Classe: LivroFisico</h3>
      <table class="table table-bordered" style="table-layout: fixed; width: 100%">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>numPags</td>
            <td>int</td>
            <td>Numero de páginas do livro</td>
          </tr>
          <tr>
            <td>conservacao</td>
            <td>String</td>
            <td>Estado de conservação do livro</td>
          </tr>
        </tbody>
      </table>

      <br>

      <h3>Classe: LivroDigital</h3>
      <table class="table table-bordered" style="table-layout: fixed; width: 100%">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>formato</td>
            <td>String</td>
            <td>Formato do livro digital (.pdf, .epub, etc)</td>
          </tr>
          <tr>
            <td>offline</td>
            <td>boolean</td>
            <td>Indicativo se o download do livro pode ser feito para leitura offline</td>
          </tr>
        </tbody>
      </table>

      <br>

      <h3>Classe: AudioBook</h3>
      <table class="table table-bordered" style="table-layout: fixed; width: 100%">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>duracao</td>
            <td>Time</td>
            <td>Tempo de duração do livro em hh:mm:ss</td>
          </tr>
          <tr>
            <td>codec</td>
            <td>String</td>
            <td>Codec do arquivo (.mp3, .ogg, .wav, etc) </td>
          </tr>
        </tbody>
      </table>

    </div>    
</body>
</html>