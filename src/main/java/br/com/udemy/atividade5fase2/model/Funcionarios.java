package br.com.udemy.atividade5fase2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_FUNCIONARIOS")
public class Funcionarios {

    @Id
    @SequenceGenerator(name = "funcionarios", sequenceName = "SQ_TB_FUNCIONARIOS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "funcionarios")
    @Column(name = "id_funcionario")
    private int id;

    @Column(name = "ds_nome", nullable = false, length = 60)
    private String nome;
    @Column(name = "ds_endereco", length = 255)
    private String endereco;

    @Column(name = "nm_cpf", length = 30)
    private String cpf;

    @Column(name = "dt_data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "dt_data_admissao")
    private LocalDate dataAdmissao;

    public Funcionarios() {
    }

    public Funcionarios(String nome, String endereco, String cpf, LocalDate dataNascimento, LocalDate dataAdmissao) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", dataAdmissao=" + dataAdmissao +
                '}';
    }
}
