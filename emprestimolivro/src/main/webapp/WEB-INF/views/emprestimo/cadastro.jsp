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
    <c:set var="ativaBotao" value=""/>
    <c:import url="/WEB-INF/views/menu.jsp" />

    <div class="container mt-3" > <!-- style="width: 30%;" -->
      <h2>Cadastro de Empréstimo</h2>
      <form action="/emprestimo/incluir" method="post">
        <div class="mb-3 mt-3">
          <label>Data de devolução:</label>
          <input type="text" class="form-control" placeholder="Entre com a data de devolução" name="dataDevolucao">
        </div>
        <div class="mb-3 mt-3">
          <c:if test="${not empty solicitantes}">
            <label>Solicitante:</label>
            <select name="solicitante" class="form-control" id="sel1">
              <c:forEach var="s" items="${solicitantes}">
              <option value="${s.id}">${s.getNome()}</option>
              </c:forEach>
            </select>
          </c:if>
          <c:if test="${empty solicitantes}">
            <label>Não existem solicitantes cadastrados!</label>
            <c:set var="ativaBotao" value="disabled" />
          </c:if>
        </div>
        <div class="mb-3 mt-3">
          <c:if test="${not empty livros}">
            <label>Livros:</label>
            <c:forEach var="l" items="${livros}">
            <div class="checkbox">
              <label><input type="checkbox" name="livros" value="${l.id}">${l.getTitulo()}</label>
            </div>
            </c:forEach>
          </c:if>
          <c:if test="${empty livros}">
            <label>Não existem livros cadastrados!</label>
            <c:set var="ativaBotao" value="disabled" />
          </c:if>
        </div>
        <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
      </form>
    </div>
  </body>
  </html>