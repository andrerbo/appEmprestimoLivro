package br.edu.infnet.emprestimolivro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.model.domain.LivroFisico;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.exceptions.EstadoLivroFisicoLamentavelException;
import br.edu.infnet.emprestimolivro.service.LivroFisicoService;


@Component
@Order(3)
public class LivroFisicoTeste implements ApplicationRunner{

    @Autowired
    private LivroFisicoService livroFisicoService;

    @Override
    public void run(ApplicationArguments args) {

        Usuario usuario = new Usuario();
        usuario.setId(1);

        try {
            String dir = "C:\\arquivos\\";
            String file = "livro.txt";

            System.out.println("[INFO] -> Iniciando leitura de arquivo");
            FileReader fileReader = new FileReader(dir + file);
            BufferedReader leitura = new BufferedReader(fileReader);
            
            String linha = leitura.readLine();
            while(linha != null){ 
                String[] valores = linha.split(";");
                
                if("F".equalsIgnoreCase(valores[0])){
                    try { 
                        LivroFisico f1 = new LivroFisico();
                        f1.setUsuario(usuario);
                        f1.setCodigo(Integer.valueOf(valores[1]));
                        f1.setAutor(valores[2]);
                        f1.setTitulo(valores[3]);
                        f1.setCategoria(valores[4]);
                        f1.setNumPaginas(Integer.valueOf(valores[5]));
                        f1.setConservacao(valores[6]);
                        System.out.println("Duração do empréstimo: " + f1.calcularDuracaoEmprestimo().toDays() + " dias"); 
                        livroFisicoService.incluirLivroFisico(f1);
                    } catch (EstadoLivroFisicoLamentavelException e){
                        System.out.println("[ERRO] -> " + e.getMessage());
                    }
                }
                linha = leitura.readLine();
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
