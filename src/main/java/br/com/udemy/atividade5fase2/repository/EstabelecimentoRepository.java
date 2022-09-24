package br.com.udemy.atividade5fase2.repository;

import br.com.udemy.atividade5fase2.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Integer> {
}
