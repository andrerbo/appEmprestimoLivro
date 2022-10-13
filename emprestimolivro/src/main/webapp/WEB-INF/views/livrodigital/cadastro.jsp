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
      <h2 class="mb-5">Cadastro de Livro Digital</h2>
      <form action="/livrodigital/incluir" method="post">
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
          <label for="formato" class="col-sm-2 col-form-label">Formato:</label>
          <div class="col-sm-10">
            <select id="formato" class="form-control" name="formato">
              <option value=".epub" selected>.epub</option>
              <option value=".pdf">.pdf</option>
              <option value=".mobi">.mobi</option>
            </select>
          </div>
        </div>
        <fieldset class="form-group mt-2">
          <div class="row">
            <legend class="col-form-label col-sm-2 pt-0">Offline:</legend>
            <div class="col-sm-10">
              <div class="form-check">
                <input class="form-check-input" type="radio" name="offline" id="gridRadios1" value="true" checked>
                <label class="form-check-label" for="gridRadios1">
                  Sim
                </label>
              </div>
              <div class="form-check">
                <input class="form-check-input" type="radio" name="offline" id="gridRadios2" value="false">
                <label class="form-check-label" for="gridRadios2">
                  Não
                </label>
              </div>
            </div>
          </div>
        </fieldset>
        <div class="d-grid gap-2 mt-3">
          <button type="submit" class="btn btn-primary">Cadastrar</button>
        </div>
      </div>
      </form>
    </div>

  </body>
  </html>