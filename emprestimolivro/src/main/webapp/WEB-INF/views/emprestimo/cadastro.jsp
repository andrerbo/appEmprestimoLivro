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
      <h2 class="mb-5">Cadastro de Empréstimo</h2>
      <form action="/emprestimo/incluir" method="post">
        <div class="form-group row mt-2">
          <label for="dataDevolucao" class="col-sm-2 col-form-label">Data de devolução:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="dataDevolucao" placeholder="Entre com a data de devolução no formato aaaa-mm-dd. Ex: 2023-01-31" name="dataDevolucao">
          </div>
        </div>
        <c:if test="${not empty solicitantes}">
          <div class="form-group row mt-2">
            <label for="solicitante" class="col-sm-2 col-form-label">Solicitante:</label>
            <div class="col-sm-10">
              <select id="solicitante" class="form-control" name="solicitante">
                <c:forEach var="s" items="${solicitantes}">
                  <option value="${s.id}">${s.getNome()}</option>
                </c:forEach>
              </select>
            </div>
          </c:if>
          <c:if test="${empty solicitantes}">
            <c:set var="ativaBotao" value="disabled" />
            <div class="form-group row mt-2">
              <label for="solicitante" class="col-sm-2 col-form-label">Solicitante:</label>
              <div class="col-sm-10">
                Não existem solicitantes cadastrados!
              </div>
            </div>
          </c:if>
          <div class="form-group row mt-2">
            <div class="col-sm-2">Livros:</div>
            <c:if test="${not empty livros}">
              <div class="col-sm-10">
                <c:forEach var="l" items="${livros}">
                  <div class="form-check">
                    <input class="form-check-input" type="checkbox" id="livros" name="livros" value="${l.id}">
                    <label class="form-check-label" for="livros">
                      ${l.titulo}
                    </label>
                  </div>
                </c:forEach>
              </div>
            </c:if>
            <c:if test="${empty livros}">
              <c:set var="ativaBotao" value="disabled" />
              <div class="col-sm-10">
                Não existem livros cadastrados!
              </div>
            </c:if>
          </div>
          <div class="d-grid gap-2 mt-3">
            <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
          </div>
        </div>
      </form>
    </div>
  </body>
  </html>