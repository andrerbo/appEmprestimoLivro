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
          <a class="nav-link active" href="/classes/solicitante">Solicitante</a>
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
      
      <h3>Classe: Solicitante</h3>
      <table class="table table-bordered" style="table-layout: fixed; width: 100%">
        <thead>
          <tr>
            <th>Nome</th>
            <th>CPF</th>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>André R.</td>
            <td>999.999.990-00</td>
            <td>andre@mail.com</td>
          </tr>
          <tr>
            <td>Roberto S.</td>
            <td>999.888.777-00</td>
            <td>roberto@mail.com</td>
          </tr>
          <tr>
            <td>Luisa A.</td>
            <td>000.000.123-00</td>
            <td>luisa@mail.com</td>
          </tr>
        </tbody>
      </table>

    </div>    
</body>
</html>