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
      <h2 class="mb-5">Cadastro de Livro Físico</h2>
      <form action="/livrofisico/incluir" method="post">
        <div class="form-group row mt-2">
          <label for="codigo" class="col-sm-2 col-form-label">Código:</label>
          <div class="col-sm-10">
            <input type="number" class="form-control" id="codigo" placeholder="Entre com o código" name="codigo">
          </div>
        </div>
        <div class="form-group row mt-2">
          <label for="autor" class="col-sm-2 col-form-label">Autor:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="autor" placeholder="Entre com o autor" name="autor">
          </div>
        </div>
        <div class="form-group row mt-2">
          <label for="titulo" class="col-sm-2 col-form-label">Título:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="titulo" placeholder="Entre com o título" name="titulo">
          </div>
        </div>
        <div class="form-group row mt-2">
          <label for="categoria" class="col-sm-2 col-form-label">Categoria:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="categoria" placeholder="Entre com a categoria" name="categoria">
          </div>
        </div>
        <div class="form-group row mt-2">
          <label for="numPaginas" class="col-sm-2 col-form-label">Número de páginas:</label>
          <div class="col-sm-10">
            <input type="number" class="form-control" id="numPags" placeholder="Entre com o número de páginas" name="numPaginas">
          </div>
        </div>
        <div class="form-group row mt-2">
          <label for="conservacao" class="col-sm-2 col-form-label">Conservação:</label>
          <div class="col-sm-10">
            <select id="conservacao" class="form-control" name="conservacao">
              <option value="Novo" selected>Novo</option>
              <option value="Excelente">Excelente</option>
              <option value="Bom">Bom</option>
              <option value="Regular">Regular</option>
              <option value="Rasurado">Rasurado</option>
            </select>
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