package br.com.udemy.atividade5fase2.repository;

import br.com.udemy.atividade5fase2.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
    

    List<Clientes> findByNome(String cliente);

    List<Clientes> findByCpf(String cliente);

}
