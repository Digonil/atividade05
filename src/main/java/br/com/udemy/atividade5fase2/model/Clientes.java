package br.com.udemy.atividade5fase2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_CLIENTES")

public class Clientes {

    @Id
    @SequenceGenerator(name = "clientes", sequenceName = "SQ_TB_CLIENTES", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "clientes")
    @Column(name = "id_cliente")
    private int id;

    @Column(name = "ds_nome", nullable = false, length = 60)
    private String nome;

    @Column(name = "nm_cpf")
    private String cpf;

    @Column(name = "dt_data_nascimento")
    private LocalDate dataNascimento;

    public Clientes() {
    }

    public Clientes(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
