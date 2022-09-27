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
      <h2>Cadastro de Empréstimo</h2>
      <form action="/emprestimo/incluir" method="post">
        <div class="mb-3 mt-3">
          <label>Data de devolução:</label>
          <input type="text" class="form-control" placeholder="Entre com a data de devolução" name="codigo">
        </div>
        <div class="mb-3 mt-3">
          <label>Solicitante:</label>
          <select class="form-control" id="sel1">
            <c:forEach var="s" items="${solicitantes}">
            <option>${s.getNome()}</option>
            </c:forEach>
          </select>
        </div>
        <div class="mb-3 mt-3">
          <label>Livros:</label>
          <c:forEach var="l" items="${livros}">
          <div class="checkbox">
            <label><input type="checkbox" value="">${l.getTitulo()}</label>
          </div>
          </c:forEach>
        </div>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
      </form>
    </div>
  </body>
  </html>