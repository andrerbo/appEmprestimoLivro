package br.edu.infnet.emprestimolivro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.service.UsuarioService;

@Component
@Order(1)
public class UsuarioTeste implements ApplicationRunner{
    
    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) /*throws Exception*/ {

        try {
            String dir = "C:\\arquivos\\";
            String file = "usuario.txt";

            System.out.println("[INFO] -> Iniciando leitura de arquivo");
            FileReader fileReader = new FileReader(dir + file);
            BufferedReader leitura = new BufferedReader(fileReader);
            
            String linha = leitura.readLine();
            while(linha != null){
                
                String[] valores = linha.split(";");            
                Usuario usuario = new Usuario();
                usuario.setNome(valores[0]);
                usuario.setEmail(valores[1]);
                usuario.setSenha(valores[2]);
                usuario.setAdmin(Boolean.valueOf(valores[3]));
                usuarioService.incluirUsuario(usuario);

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
