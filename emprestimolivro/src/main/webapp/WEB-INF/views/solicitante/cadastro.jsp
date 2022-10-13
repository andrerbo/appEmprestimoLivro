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
      <h2 class="mb-5">Cadastro de Solicitante</h2>
      <form action="/solicitante/incluir" method="post">
        <div class="form-group row mt-2">
          <label for="nome" class="col-sm-2 col-form-label">Nome:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="nome" placeholder="Entre com o nome" name="nome">
          </div>
        </div>
        <div class="form-group row mt-2">
          <label for="cpf" class="col-sm-2 col-form-label">CPF:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="cpf" placeholder="Entre com o cpf" name="cpf">
          </div>
        </div>
        <div class="form-group row mt-2">
          <label for="email" class="col-sm-2 col-form-label">Email:</label>
          <div class="col-sm-10">
            <input type="email" class="form-control" id="email" placeholder="Entre com o email" name="email">
          </div>
        </div>
        <div class="d-grid gap-2 mt-3">
          <button type="submit" class="btn btn-primary">Cadastrar</button>
        </div>
      </div>
      </form>
    </div>
  </body>

  </html>