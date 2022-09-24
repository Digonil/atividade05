package br.com.udemy.atividade5fase2.repository;

import br.com.udemy.atividade5fase2.model.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepository extends JpaRepository<Funcionarios, Integer> {
}
