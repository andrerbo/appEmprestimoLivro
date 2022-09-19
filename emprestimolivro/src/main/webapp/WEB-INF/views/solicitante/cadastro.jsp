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
      <h2>Cadastro de Solicitante</h2>
      <!--h5>Formulário de criação de novos usuários</h5-->
      <form action="/solicitante/incluir" method="post">
        <div class="mb-3 mt-3">
          <label>Nome:</label>
          <input type="text" class="form-control" placeholder="Entre com o nome do solicitante" name="nome">
        </div>
        <div class="mb-3 mt-3">
          <label>CPF:</label>
          <input type="text" class="form-control" placeholder="Entre com o CPF do solicitante" name="cpf">
        </div>
        <div class="mb-3 mt-3">
          <label>Email:</label>
          <input type="email" class="form-control" placeholder="Entre com o email do solicitante" name="email">
        </div>
        <!--div class="form-check mb-3">
          <label class="form-check-label">
            <input class="form-check-input" type="checkbox" name="remember"> Remember me
          </label>
        </div-->
        <button type="submit" class="btn btn-primary">Cadastrar</button>
      </form>
    </div>

  </body>

  </html>