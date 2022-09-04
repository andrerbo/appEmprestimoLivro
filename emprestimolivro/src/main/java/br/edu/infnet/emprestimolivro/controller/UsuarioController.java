package br.edu.infnet.emprestimolivro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.tests.AppImpressao;

@Controller
public class UsuarioController {

    // private static List<LivroDigital> livros = new ArrayList<LivroDigital>();
    private static Map<String, Usuario> mapaUsuarios = new HashMap<String, Usuario>();

    public static Usuario validarUsuario(String email, String senha) {
        Usuario usuario = mapaUsuarios.get(email);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        }
        return null;
    }

    public static void incluirUsuario(Usuario usuario) {
        mapaUsuarios.put(usuario.getEmail(), usuario);
        AppImpressao.relatorio("Inclusão do usuario '" + usuario.getNome()
                + "' relizada com sucesso", usuario);
    }

    public static Collection<Usuario> obterUsuarios() {
        return mapaUsuarios.values();
    }

    public static void excluirUsuariofromMap(String email){
        mapaUsuarios.remove(email);
    }

    @GetMapping(value = "/usuario/lista")
    public String getUsuarioPage(Model model) {
        model.addAttribute("listagemUsuario", obterUsuarios());
        return "/usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String getCadastroPage() {
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String postUsuario(Usuario usuario){
        incluirUsuario(usuario);
        return "redirect:/";
    }

    @GetMapping(value = "/usuario/{email}/excluir")
    public String excluirUsuario(@PathVariable String email){
        excluirUsuariofromMap(email);
        System.out.println("Exclusão do Usuário " + email + " realizada com sucesso");
        return "redirect:/usuario/lista";
    }
}
