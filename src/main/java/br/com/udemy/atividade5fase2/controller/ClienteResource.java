package br.com.udemy.atividade5fase2.controller;

import br.com.udemy.atividade5fase2.model.Clientes;
import br.com.udemy.atividade5fase2.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteResource {

    @Autowired
    public ClientesRepository clientesRepository;

    @GetMapping
    public List<Clientes> Listar(){
        return clientesRepository.findAll();
    }
    @GetMapping({"id"})
    public Clientes buscar (@PathVariable Integer id){
        return clientesRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Clientes cadastrar(@RequestBody Clientes cliente){
        return clientesRepository.save(cliente);
    }

    @PutMapping({"id"})
    public Clientes atualizar(@RequestBody Clientes cliente,@PathVariable Integer id){
        cliente.setId(id);
        return clientesRepository.save(cliente);
    }

    @DeleteMapping({"id"})
    public void remover(@PathVariable Integer id){
        clientesRepository.deleteById(id);
    }

}
