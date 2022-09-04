<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"> -->
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
          <a class="nav-link active" href="/solicitante/lista">Solicitante</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/emprestimo/lista">Emprestimo</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/livrofisico/lista">Livro Fisico</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/livrodigital/lista">Livro Digital</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/livroaudio/lista">Livro Audio</a>
        </li>
      </ul>
    </div>
  </nav>
</div> 
    <div class="container mt-3">
      <h2>App Empréstimo Livro</h2>
      <p>Projeto de gestão de empréstimo de livros para uma biblioteca</p>
      
      <h3>Classe: Usuário</h3>
      <table class="table table-sm"> <!--style="table-layout: fixed; width: 100%"-->
        <thead class="table-info">
          <tr>
            <th>Nome</th>
            <th>E-mail</th>
            <th>Senha</th>
            <!--th></th-->
          </tr>
        </thead>
        <tbody>
          <c:forEach var="u" items="${listagemUsuario}">
            <tr>
              <td>${u.getNome()}</td>
              <td>${u.getEmail()}</td>
              <td>${u.getSenha()}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>

    </div>    
</body>
</html>