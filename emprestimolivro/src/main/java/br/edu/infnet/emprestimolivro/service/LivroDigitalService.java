package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.LivroDigital;
import br.edu.infnet.model.tests.AppImpressao;

@Service
public class LivroDigitalService {
 
    // private static List<LivroDigital> livros = new ArrayList<LivroDigital>();
    private static Map<Integer, LivroDigital> mapaLivroDigital = new HashMap<Integer, LivroDigital>();
    private static Integer id = 1;

    public void incluirLivroDigital(LivroDigital livro) {
        // livros.add(livro);
        livro.setId(id++);
        mapaLivroDigital.put(livro.getId(), livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
                + "' relizada com sucesso", livro);
    }

    public Collection<LivroDigital> obterLivrosDigital() {
        return mapaLivroDigital.values();
    }

    public void excluirLivro(Integer id) {
        mapaLivroDigital.remove(id);
    }

}
