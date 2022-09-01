package br.com.cripsenha.controller;

import br.com.cripsenha.model.UsuarioModel;
import br.com.cripsenha.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/listartodos")
    public ResponseEntity<List<UsuarioModel>> listarTodos(){
       return ResponseEntity.ok(usuarioRepository.findAll());
    }

    @PostMapping("/salvar")
    public ResponseEntity<UsuarioModel> save(@RequestBody UsuarioModel usuario){
        return ResponseEntity.ok(usuarioRepository.save(usuario));
    }

}
