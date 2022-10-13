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
        <c:if test="${not empty mensagem}">
          <div class="alert ${mensagemTipo}">
            <strong>Info: </strong>${mensagem}
          </div>
        </c:if>
        <h3>Classe: Livro</h3>
        <table class="table table-sm">
          <!--style="table-layout: fixed; width: 100%"-->
          <thead class="table-success">
            <tr>
              <th>ID</th>
              <th>Autor</th>
              <th>Título</th>
              <th>Código</th>
              <th>Categoria</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="l" items="${listagemLivro}">
              <tr>
                <td>${l.getId()}</td>
                <td>${l.getAutor()}</td>
                <td>${l.getTitulo()}</td>
                <td>${l.getCodigo()}</td>
                <td>${l.getCategoria()}</td>
                <td><a href="/livro/${l.id}/excluir" type="button"
                    class="btn btn-outline-danger btn-sm">excluir</a></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
        
      </div>

    </body>

    </html>