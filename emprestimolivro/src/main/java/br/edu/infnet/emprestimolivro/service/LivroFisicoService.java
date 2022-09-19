package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.LivroFisico;
import br.edu.infnet.model.tests.AppImpressao;

@Service
public class LivroFisicoService {

    // private static List<LivroFisico> livros = new ArrayList<LivroFisico>();
    private static Map<Integer, LivroFisico> mapaLivroFisico = new HashMap<Integer, LivroFisico>();
    private static Integer id = 1;

    public void incluirLivroFisico(LivroFisico livro){
        // livros.add(livro);
        livro.setId(id++);
        mapaLivroFisico.put(livro.getId(), livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
            + "' relizada com sucesso", livro);
    }

    public Collection<LivroFisico> obterLivrosFisicos(){
        return mapaLivroFisico.values();
    }

    public void excluirLivro(Integer id){
        mapaLivroFisico.remove(id);
    }
    
}
