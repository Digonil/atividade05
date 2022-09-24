package br.com.udemy.atividade5fase2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_ESTABELECIMENTO")
public class Estabelecimento {

    @Id
    @SequenceGenerator(name = "estabelecimento", sequenceName = "SQ_TB_ESTABELECIMENTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "estabelecimento")
    private int id;
    @Column(name = "ds_nome", nullable = false, length = 60)
    private String nome;
    @Column(name = "ds_endereco", nullable = false, length = 255)
    private String endereco;
    @Column(name = "dt_data_criacao")
    private LocalDate dataCriacao = LocalDate.now();

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionarios funcionario;

    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String endereco, LocalDate dataCriacao, Clientes cliente, Funcionarios funcionario) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                '}';
    }
}
