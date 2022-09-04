package br.edu.infnet.emprestimolivro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.tests.AppImpressao;

@Controller
public class UsuarioController {

    // private static List<LivroDigital> livros = new ArrayList<LivroDigital>();
    private static Map<String, Usuario> mapaUsuarios = new HashMap<String, Usuario>();

    public static void incluirUsuario(Usuario usuario) {
        mapaUsuarios.put(usuario.getEmail(), usuario);
        AppImpressao.relatorio("Inclusão do usuario '" + usuario.getNome()
                + "' relizada com sucesso", usuario);
    }

    public static Collection<Usuario> obterUsuarios() {
        return mapaUsuarios.values();
    }

    @GetMapping(value = "/usuario/lista")
    public String getLivroDigitalPage(Model model){
    model.addAttribute("listagemUsuario", obterUsuarios());
    return "/usuario/lista";
    }
}
