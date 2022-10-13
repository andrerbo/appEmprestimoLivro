package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.exceptions.UsuarioAdminNaoPodeSerDeletadoException;
import br.edu.infnet.emprestimolivro.service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    private String mensagem;
    private String mensagemTipo;

    @GetMapping(value = "/usuario/lista")
    public String getUsuarioPage(Model model) {
        model.addAttribute("listagemUsuario", usuarioService.obterUsuarios());
        model.addAttribute("mensagem", mensagem);
        model.addAttribute("mensagemTipo", mensagemTipo);
        return "/usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String getCadastroPage() {
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String postUsuario(Usuario usuario){
        usuarioService.incluirUsuario(usuario);
        return "redirect:/";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluirUsuario(@PathVariable Integer id){
        try{
            usuarioService.excluirUsuario(id);
            mensagem = "Exclusão do usuário " + id + " realizada com sucesso!";
            mensagemTipo = "alert-success";
            System.out.println("Exclusão do usuário " + id + " realizada com sucesso");
        } catch (UsuarioAdminNaoPodeSerDeletadoException e) {
            mensagem = e.getMessage();
            mensagemTipo = "alert-danger";
        }
        return "redirect:/usuario/lista";
    }
    
}
