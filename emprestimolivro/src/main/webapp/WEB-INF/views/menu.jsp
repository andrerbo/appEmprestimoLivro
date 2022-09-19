<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <nav class="navbar navbar-expand-sm bg-light navbar-light">
      <div class="container-fluid">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active" href="/">Home</a>
          </li>

          <c:if test="${not empty usuario}">
            <li class="nav-item">
              <a class="nav-link" href="/usuario/lista">Usuário</a>
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
          </c:if>
        </ul>

        <ul class="navbar-nav">
          <c:if test="${empty usuario}">
            <li class="nav-item">
              <a class="nav-link" href="/usuario">Signup</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/login">Login</a>
            </li>
          </c:if>
          <c:if test="${not empty usuario}">
            <li class="nav-item">
              <a class="nav-link" href="/logout">Logout ${usuario.getEmail()}</a>
            </li>
          </c:if>

        </ul>
      </div>
    </nav>