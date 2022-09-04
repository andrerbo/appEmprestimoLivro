<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE HTML>
  <html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>App Empréstimo Livro</title>
  </head>

  <body>
    <nav class="navbar navbar-expand-sm bg-light navbar-light">
      <div class="container-fluid">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active" href="/">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/solicitante/lista">Solicitante</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/emprestimo/lista">Emprestimo</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/livrofisico/lista">Livro Fisico</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/livrodigital/lista">Livro Digital</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/livroaudio/lista">Livro Audio</a>
          </li>
        </ul>
      </div>
    </nav>

    <div class="container mt-3">
      <h2>Página de cadastramento de novos usuários</h2>
      <form action="" method="">
        <div class="mb-3 mt-3">
          <label>Nome:</label>
          <input type="email" class="form-control" placeholder="Entre com seu nome" name="nome">
        </div>
        <div class="mb-3 mt-3">
          <label>Email:</label>
          <input type="email" class="form-control" placeholder="Entre com seu e-mail" name="email">
        </div>
        <div class="mb-3">
          <label>Senha:</label>
          <input type="senha" class="form-control" placeholder="Entre com a sua senha" name="senha">
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