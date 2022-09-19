<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <!DOCTYPE HTML>
  <html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>App Empréstimo Livro</title>
  </head>

  <body>
    <c:import url="/WEB-INF/views/menu.jsp" />

    <div class="container mt-3" > <!-- style="width: 30%;" -->
      <h2>Cadastro de Livro Digital</h2>
      <!--h5>Formulário de criação de novos usuários</h5-->
      <form action="/livrodigital/incluir" method="post">
        <div class="mb-3 mt-3">
          <label>Código:</label>
          <input type="integer" class="form-control" placeholder="Entre com o código do livro" name="codigo">
        </div>
        <div class="mb-3 mt-3">
          <label>Autor:</label>
          <input type="text" class="form-control" placeholder="Entre com o autor do livro" name="autor">
        </div>
        <div class="mb-3 mt-3">
          <label>Título:</label>
          <input type="text" class="form-control" placeholder="Entre com o título do livro" name="titulo">
        </div>
      <div class="mb-3 mt-3">
        <label>Categoria:</label>
        <input type="text" class="form-control" placeholder="Entre com a categoria do livro" name="categoria">
      </div>
      <div class="mb-3 mt-3">
        <label>Formato:</label>
        <input type="text" class="form-control" placeholder="Entre com o formato do livro" name="formato">
      </div>
       
      <!-- Radio -->
      <div>
        <label>Offline:</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" name="offline">
        <label class="form-check-label">
          Sim
        </label>
      </div>
      <div class="form-check mb-3">
        <input class="form-check-input" type="radio" name="offline" checked>
        <label class="form-check-label">
          Não
        </label>
      </div>
      <!-- Radio -->

        <button type="submit" class="btn btn-primary">Cadastrar</button>
      </form>
    </div>
  </body>
  </html>