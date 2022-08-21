package br.edu.infnet.emprestimolivro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.controller.EmprestimoController;
import br.edu.infnet.model.domain.AudioBook;
import br.edu.infnet.model.domain.Emprestimo;
import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.domain.Livro;
import br.edu.infnet.model.domain.LivroDigital;
import br.edu.infnet.model.domain.LivroFisico;

import java.time.Duration;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Component
@Order(4)
public class EmprestimoTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {

        LivroFisico f1 = new LivroFisico();
        f1.setCodigo(11);
        f1.setAutor("Allen B. Downey");
        f1.setTitulo("Think Java");
        f1.setCategoria("Tecnologia");
        f1.setConservacao("Excelente");
        f1.setNumPaginas(354);

        LivroDigital d1 = new LivroDigital();
        d1.setCodigo(11);
        d1.setAutor("Robert C. Martin");
        d1.setTitulo("Clean Architecture");
        d1.setCategoria("Tecnologia");
        d1.setFormato(".pdf");
        d1.setOffline(true);

        AudioBook a1 = new AudioBook();
        a1.setCodigo(12);
        a1.setAutor("Arthur Conan Doyle");
        a1.setTitulo("Sherlock Holmes: O cão dos Baskerville");
        a1.setCategoria("Romance Policial");
        a1.setCodec(".mp3");
        a1.setDuracao(Duration.ofHours(6));

        Set<Livro> listaLivroE1 = new HashSet<Livro>();
        listaLivroE1.add(f1);
        listaLivroE1.add(d1);
        listaLivroE1.add(a1);

        Solicitante s1 = new Solicitante("Andre R.", "999.999.990-00", "andre@mail.com");
        Emprestimo e1 = new Emprestimo(s1);
        // Emprestimo e1 = new Emprestimo();
        // e1.setSolicitante(s1);
        // e1.setDataInicio(LocalDate.now());
        e1.setDataDevolucao(LocalDate.now().plusDays(14));
        e1.setAtraso(false);
        e1.setLivros(listaLivroE1);
        EmprestimoController.incluirEmprestimo(e1);       



        LivroFisico f2 = new LivroFisico();
        f2.setCodigo(15);
        f2.setAutor("Carlos E. Morimoto");
        f2.setTitulo("Hardware: O Guia Definitivo");
        f2.setCategoria("Tecnologia");
        f2.setConservacao("Novo");
        f2.setNumPaginas(207);

        LivroDigital d2 = new LivroDigital();
        d2.setCodigo(18);
        d2.setAutor("Lucia M. Almeida");
        d2.setTitulo("O Escaravelho do Diabo");
        d2.setCategoria("Romance Policial");
        d2.setFormato(".epub");
        d2.setOffline(true);

        AudioBook a2 = new AudioBook();
        a2.setCodigo(19);
        a2.setAutor("Robert C. Martin");
        a2.setTitulo("Clean Code");
        a2.setCategoria("Tecnologia");
        a2.setCodec(".ogg");
        a2.setDuracao(Duration.ofHours(3));

        Set<Livro> listaLivroE2 = new HashSet<Livro>();
        listaLivroE2.add(f2);
        listaLivroE2.add(d2);
        // listaLivroE2.add(a2);

        Solicitante s2 = new Solicitante("Roberto S.", "999.888.777-00", "roberto@mail.com");
        Emprestimo e2 = new Emprestimo(s2);
        // Emprestimo e2 = new Emprestimo();
        // e2.setSolicitante(s2);
        // e2.setDataInicio(LocalDate.now().minusDays(20));
        e2.setDataDevolucao(LocalDate.now().minusDays(6));
        e2.setAtraso(true);
        e2.setLivros(listaLivroE2);
        EmprestimoController.incluirEmprestimo(e2);



        LivroFisico f3 = new LivroFisico();
        f3.setCodigo(15);
        f3.setAutor("Ray Bradbury");
        f3.setTitulo("Fahrenheit 451");
        f3.setCategoria("Ficção");
        f3.setConservacao("Bom estado");
        f3.setNumPaginas(654);

        LivroDigital d3 = new LivroDigital();
        d3.setCodigo(20);
        d3.setAutor("Jonh Doerr");
        d3.setTitulo("Avalie o Que Importa");
        d3.setCategoria("Auto-ajuda");
        d3.setFormato(".pdf");
        d3.setOffline(false);
        
        AudioBook a3 = new AudioBook();
        a3.setCodigo(27);
        a3.setAutor("Paulo Yazig Sabbag");
        a3.setTitulo("Resiliência");
        a3.setCategoria("Auto-ajuda");
        a3.setCodec(".wav");
        a3.setDuracao(Duration.ofHours(8));

        Set<Livro> listaLivroE3 = new HashSet<Livro>();
        listaLivroE3.add(f3);
        // listaLivroE3.add(d3);
        // listaLivroE3.add(a3);

        Solicitante s3 = new Solicitante("Luisa A.", "000.000.123-00", "luisa@mail.com");
        Emprestimo e3 = new Emprestimo(s3);
        // Emprestimo e3 = new Emprestimo();
        // e3.setSolicitante(s3);
        // e3.setDataInicio(LocalDate.now().minusDays(7));
        e3.setDataDevolucao(LocalDate.now().plusDays(7));
        e3.setAtraso(false);
        e3.setLivros(listaLivroE3);
        EmprestimoController.incluirEmprestimo(e3);
    }

}
