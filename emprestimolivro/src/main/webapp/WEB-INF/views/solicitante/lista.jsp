<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE HTML>
    <html>

    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
      <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"> -->
      <title>App Empréstimo Livro</title>
    </head>

    <body>
      <c:import url="/WEB-INF/views/menu.jsp" />
      <div class="container mt-3">
        <h2>App Empréstimo Livro</h2>
        <p>Projeto de gestão de empréstimo de livros para uma biblioteca</p>
        <h3>Classe: Solicitante</h3>
        <table class="table table-sm">
          <!--style="table-layout: fixed; width: 100%"-->
          <thead class="table-warning">
            <tr>
              <th>ID</th>
              <th>Nome</th>
              <th>CPF</th>
              <th>Email</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="s" items="${listagemSolicitante}">
              <tr>
                <td>${s.getId()}</td>
                <td>${s.getNome()}</td>
                <td>${s.getCpf()}</td>
                <td>${s.getEmail()}</td>
                <td><a href="/solicitante/${s.id}/excluir" type="button"
                    class="btn btn-outline-danger btn-sm">excluir</a></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>

      </div>
    </body>

    </html>