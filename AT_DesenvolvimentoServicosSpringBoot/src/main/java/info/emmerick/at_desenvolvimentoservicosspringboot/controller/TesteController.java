
package info.emmerick.at_desenvolvimentoservicosspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.emmerick.at_desenvolvimentoservicosspringboot.model.Usuario;
import info.emmerick.at_desenvolvimentoservicosspringboot.service.UsuarioService;

@RestController
@RequestMapping("/api/test")
public class TesteController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/insert")
    public Usuario insertTestUser() {
        Usuario usuario = new Usuario("Nome Teste", "Senha Teste", "Papel Teste");
        return usuarioService.createUsuario(usuario);
    }
}
