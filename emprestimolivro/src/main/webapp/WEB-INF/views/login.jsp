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

    <div class="container mt-3" style="width: 30%;">
      <h2>Login</h2>
      <form action="/login" method="post">
        <div class="mb-3 mt-3">
          <label for="email">Email:</label>
          <input type="email" class="form-control" placeholder="Entre com seu e-mail" name="email">
        </div>
        <div class="mb-3">
          <label for="pwd">Senha:</label>
          <input type="password" class="form-control" placeholder="Entre com sua senha" name="senha">
        </div>
        <!--div class="form-check mb-3">
          <label class="form-check-label">
            <input class="form-check-input" type="checkbox" name="remember"> Remember me
          </label>
        </div-->
        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
    </div>

  </body>

  </html>