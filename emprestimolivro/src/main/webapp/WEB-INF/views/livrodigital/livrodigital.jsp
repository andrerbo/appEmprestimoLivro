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
          <a class="nav-link" href="/">Home</a>
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
          <a class="nav-link active" href="/classes/livrodigital">Livro Digital</a>
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
      
      <h3>Classe: LivroDigital</h3>
      <table class="table table-bordered" style="table-layout: fixed; width: 100%">
        <thead>
          <tr>
            <th>Autor</th>
            <th>Título</th>
            <th>Categoria</th>
            <th>Formato</th>
            <th>Offline</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>Robert C. Martin</td>
            <td>Clean Architecture</td>
            <td>Tecnologia</td>
            <td>.pdf</td>
            <td>Sim</td>
          </tr>
          <tr>
            <td>Lucia M. Almeida</td>
            <td>O Escaravelho do Diabo</td>
            <td>Romance Policial</td>
            <td>.epub</td>
            <td>Sim</td>
          </tr>
          <tr>
            <td>Jonh Doerr</td>
            <td>Avalie o Que Importa</td>
            <td>Auto-ajuda</td>
            <td>.pdf</td>
            <td>Não</td>
          </tr>
        </tbody>
      </table>

    </div>    
</body>
</html>