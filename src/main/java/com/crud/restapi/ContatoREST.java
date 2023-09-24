package com.crud.restapi;
import java.util.List;

import com.crud.restapi.database.RepositorioContato;
import com.crud.restapi.entidade.Contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contato")
public class ContatoREST {
    
    @Autowired
    private RepositorioContato repository;

    @GetMapping
    public List<Contato> listar() {
        return repository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Contato contato) {
        repository.save(contato);
    }

    @PutMapping
    public void alterar(@RequestBody Contato contato) {
        if (contato.getId() > 0)
            repository.save(contato);
    }

    @DeleteMapping
    public void excluir(@RequestBody Contato contato){
        repository.delete(contato);
    }
}
