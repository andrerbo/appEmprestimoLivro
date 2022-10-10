package br.edu.infnet.emprestimolivro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.model.domain.AudioBook;
import br.edu.infnet.emprestimolivro.model.domain.Emprestimo;
import br.edu.infnet.emprestimolivro.model.domain.Livro;
import br.edu.infnet.emprestimolivro.model.domain.LivroDigital;
import br.edu.infnet.emprestimolivro.model.domain.LivroFisico;
import br.edu.infnet.emprestimolivro.model.domain.Solicitante;
import br.edu.infnet.emprestimolivro.model.exceptions.CpfInvalidoException;
import br.edu.infnet.emprestimolivro.model.exceptions.CpfNuloException;
import br.edu.infnet.emprestimolivro.model.exceptions.ListaLivrosVaziaException;
import br.edu.infnet.emprestimolivro.model.exceptions.SolicitanteNuloException;
import br.edu.infnet.emprestimolivro.service.EmprestimoService;


@Component
@Order(4)
public class EmprestimoTeste implements ApplicationRunner{

    @Autowired
    private EmprestimoService emprestimoService;

    @Override
    public void run(ApplicationArguments args) {
                
        try {
            String dir = "C:\\arquivos\\";
            String file = "emprestimo.txt";

            System.out.println("[INFO] -> Iniciando leitura de arquivo");
            FileReader fileReader = new FileReader(dir + file);
            BufferedReader leitura = new BufferedReader(fileReader);
            
            Set<Livro> livros = null;
            List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
            String linha = leitura.readLine();

            while(linha != null){ 
            String[] valores = linha.split(";");            
            switch (valores[0]) {
                case "E":                    
                    try {
                        livros = new HashSet<Livro>();      
                        Solicitante solicitante = new Solicitante(valores[3], valores[4], valores[5]);
                        Emprestimo emprestimo = new Emprestimo(solicitante, livros);
                        emprestimo.setDataDevolucao(LocalDate.parse(valores[1]));
                        emprestimo.setAtraso(Boolean.valueOf(valores[2]));
                        emprestimos.add(emprestimo);

                    } catch (CpfInvalidoException | CpfNuloException e){
                        System.out.println("[ERRO] -> " + e.getMessage());
                    } catch (SolicitanteNuloException e){
                        System.out.println("[ERRO] -> " + e.getMessage());
                    } catch (ListaLivrosVaziaException e){
                        System.out.println("[ERRO] -> " + e.getMessage());
                    }
                    break;

                case "A":                        
                    AudioBook livroAudio = new AudioBook();
                    livroAudio.setCodigo(Integer.valueOf(valores[1]));
                    livroAudio.setAutor(valores[2]);
                    livroAudio.setTitulo(valores[3]);
                    livroAudio.setCategoria(valores[4]);
                    livroAudio.setCodec(valores[5]);
                    livroAudio.setDuracao(Integer.valueOf(valores[6]));
                    livros.add(livroAudio);
                    break;

                case "D":
                    LivroDigital livroDigital = new LivroDigital();
                    livroDigital.setCodigo(Integer.valueOf(valores[1]));
                    livroDigital.setAutor(valores[2]);
                    livroDigital.setTitulo(valores[3]);
                    livroDigital.setCategoria(valores[4]);
                    livroDigital.setFormato(valores[5]);
                    livroDigital.setOffline(Boolean.valueOf(valores[5]));
                    livros.add(livroDigital); 
                    break;

                case "F":
                    LivroFisico livroFisico = new LivroFisico();
                    livroFisico.setCodigo(Integer.valueOf(valores[1]));
                    livroFisico.setAutor(valores[2]);
                    livroFisico.setTitulo(valores[3]);
                    livroFisico.setCategoria(valores[4]);
                    livroFisico.setNumPaginas(Integer.valueOf(valores[5]));
                    livroFisico.setConservacao(valores[6]);
                    livros.add(livroFisico);
                    break;

                default:
                    break;
            }

            linha = leitura.readLine();
            }

            for (Emprestimo e: emprestimos){
                emprestimoService.incluirEmprestimo(e);
                System.out.println(">>>> id: " + e.getId());
                System.out.println(">>>> solicitante: " + e.getSolicitante().getNome());
                System.out.println(">>>> num de livros: " + e.getLivros().size());
            }

            leitura.close();
            fileReader.close();
        
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[ERRO] -> O arquivo não existe");
        
        } finally {
            System.out.println("[INFO] -> Processo finalizado");
        }
        
    }

}
