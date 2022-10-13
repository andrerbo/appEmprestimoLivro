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
      <h2 class="mb-5">Cadastro de Usuário</h2>
      <form action="/usuario/incluir" method="post">
        <div class="form-group row mt-2">
          <label for="nome" class="col-sm-2 col-form-label">Nome:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="nome" placeholder="Entre com o nome" name="nome">
          </div>
        </div>
        <div class="form-group row mt-2">
          <label for="email" class="col-sm-2 col-form-label">Email:</label>
          <div class="col-sm-10">
            <input type="email" class="form-control" id="email" placeholder="Entre com o email" name="email">
          </div>
        </div>
        <div class="form-group row mt-2">
          <label for="senha" class="col-sm-2 col-form-label">Senha:</label>
          <div class="col-sm-10">
            <input type="password" class="form-control" id="senha" placeholder="Entre com a senha" name="senha">
          </div>
        </div>
        <fieldset class="form-group mt-2">
          <div class="row">
            <legend class="col-form-label col-sm-2 pt-0">Administrador:</legend>
            <div class="col-sm-10">
              <div class="form-check">
                <input class="form-check-input" type="radio" name="admin" id="gridRadios1" value="true" checked>
                <label class="form-check-label" for="gridRadios1">
                  Sim
                </label>
              </div>
              <div class="form-check">
                <input class="form-check-input" type="radio" name="admin" id="gridRadios2" value="false">
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