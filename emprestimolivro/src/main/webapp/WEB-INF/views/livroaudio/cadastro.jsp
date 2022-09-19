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
      <h2>Cadastro de Livro áudio</h2>
      <!--h5>Formulário de criação de novos usuários</h5-->
      <form action="/livroaudio/incluir" method="post">
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
        <label>Codec:</label>
        <input type="text" class="form-control" placeholder="Entre com o codec do livro" name="codec">
      </div>
      <div class="mb-3 mt-3">
        <label>Duração:</label>
        <input type="integer" class="form-control" placeholder="Entre com a duração do livro" name="duracao">
      </div>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
      </form>
    </div>
  </body>
  </html>