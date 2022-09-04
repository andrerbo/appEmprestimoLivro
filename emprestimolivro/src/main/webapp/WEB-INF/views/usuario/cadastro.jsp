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
      <h2>Cadastro de usuários</h2>
      <!--h5>Formulário de criação de novos usuários</h5-->
      <form action="/usuario/incluir" method="post">
        <div class="mb-3 mt-3">
          <label>Nome:</label>
          <input type="text" class="form-control" placeholder="Entre com seu nome" name="nome">
        </div>
        <div class="mb-3 mt-3">
          <label>Email:</label>
          <input type="email" class="form-control" placeholder="Entre com seu e-mail" name="email">
        </div>
        <div class="mb-3">
          <label>Senha:</label>
          <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
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