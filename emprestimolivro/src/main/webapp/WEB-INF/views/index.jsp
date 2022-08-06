<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>App Emprestimo Livro</title>
</head>
<body> 
    <div class="container mt-3">
      <h2>App Emprestimo Livro</h2>
      <p>Projeto de Gestao de Emprestimo de Livros para uma Biblioteca</p>
      
      <h3>Classe: Emprestimo</h3>
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descricao</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>dataInicio</td>
            <td>LocalDate</td>
            <td>Data de inicio do emprestimo do livro</td>
          </tr>
          <tr>
            <td>dataDevolucao</td>
            <td>LocalDate</td>
            <td>Data de devolucao prevista do livro</td>
          </tr>
          <tr>
            <td>atraso</td>
            <td>boolean</td>
            <td>Indicativo se o livro esta atrasado ou nao</td>
          </tr>
        </tbody>
      </table>

      <br>

      <h3>Classe: Solicitante</h3>
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descricao</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do solicitante do emprestimo</td>
          </tr>
          <tr>
            <td>cpf</td>
            <td>String</td>
            <td>CPF do solicitante do emprestimo</td>
          </tr>
          <tr>
            <td>email</td>
            <td>String</td>
            <td>Email do solicitante do emprestimo</td>
          </tr>
        </tbody>
      </table>

      <br>

      <h3>Classe: Livro</h3>
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descricao</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>autor</td>
            <td>String</td>
            <td>Nome do autor do livro</td>
          </tr>
          <tr>
            <td>titulo</td>
            <td>String</td>
            <td>Nome do livro</td>
          </tr>
          <tr>
            <td>categoria</td>
            <td>String</td>
            <td>Categoria do livro</td>
          </tr>
        </tbody>
      </table>
      
      <br>

      <h3>Classe: LivroFisico</h3>
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descricao</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>numPags</td>
            <td>int</td>
            <td>Numero de paginas do livro</td>
          </tr>
          <tr>
            <td>conservacao</td>
            <td>String</td>
            <td>Estado de conservacao do livro</td>
          </tr>
        </tbody>
      </table>

      <br>

      <h3>Classe: LivroDigital</h3>
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descricao</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>formato</td>
            <td>String</td>
            <td>Formato do livro digital (.pdf, .epub, etc)</td>
          </tr>
          <tr>
            <td>offline</td>
            <td>boolean</td>
            <td>Indicativo se o download do livro pode ser feito para leitura offline</td>
          </tr>
        </tbody>
      </table>

      <br>

      <h3>Classe: AudioBook</h3>
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descricao</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>duracao</td>
            <td>Time</td>
            <td>Tempo de duracao do livro em hh:mm:ss</td>
          </tr>
          <tr>
            <td>codec</td>
            <td>String</td>
            <td>Codec do arquivo (.mp3, .ogg, .wav, etc) </td>
          </tr>
        </tbody>
      </table>

    </div>    
</body>
</html>