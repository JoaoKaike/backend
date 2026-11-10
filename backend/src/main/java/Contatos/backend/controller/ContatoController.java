package Contatos.backend.controller;

import Contatos.backend.entity.ContatoUsuario;
import Contatos.backend.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contatos")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    @PostMapping
    public ContatoUsuario criarContato(@RequestBody ContatoUsuario contatoUsuario) {
        return contatoRepository.save(contatoUsuario);
    }

    @GetMapping
    public List<ContatoUsuario> listarContatos() {
        return contatoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ContatoUsuario buscarContato(@PathVariable Long id) {
        return contatoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void excluirContato(@PathVariable Long id) {
        contatoRepository.deleteById(id);
    }
}
