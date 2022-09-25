package br.com.udemy.atividade5fase2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.udemy.atividade5fase2.model.Estabelecimento;

import br.com.udemy.atividade5fase2.repository.EstabelecimentoRepository;
import java.util.List;

@RestController
@RequestMapping("estabelecimentos")
public class EstabelecimentoResource {

    @Autowired
    public EstabelecimentoRepository estabelecimentoRepository;

    @GetMapping
    public List<Estabelecimento> Listar() {
        return estabelecimentoRepository.findAll();
    }

    @GetMapping({"id"})
    public Estabelecimento buscar (@PathVariable Integer id){
        return estabelecimentoRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Estabelecimento cadastrar(@RequestBody Estabelecimento estabelecimento){
        return estabelecimentoRepository.save(estabelecimento);
    }

    @PutMapping({"id"})
    public Estabelecimento atualizar(@RequestBody Estabelecimento estabelecimento,@PathVariable Integer id){
        estabelecimento.setId(id);
        return estabelecimentoRepository.save(estabelecimento);
    }

    @DeleteMapping({"id"})
    public void remover(@PathVariable Integer id){
        estabelecimentoRepository.deleteById(id);
    }

}
