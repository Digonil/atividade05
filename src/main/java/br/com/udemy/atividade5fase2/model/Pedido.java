package br.com.udemy.atividade5fase2.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TB_PEDIDO")
public class Pedido {

    @Id
    @SequenceGenerator(name = "pedido", sequenceName = "SQ_TB_FUNCIONARIOS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "pedido")
    private int id;

    @Column(name = "qt_quantidade_produto", nullable = false)
    private int quantidadeProduto;
    @Column(name = "dt_data_pedido", nullable = false)
    private LocalDateTime dataPedido = LocalDateTime.now();

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "id_pedido"), inverseJoinColumns = @JoinColumn(name = "id_produto"), name = "tb_item_pedido")
    private List<Produto> produtos;

    public Pedido() {
    }

    public Pedido(int qualidadeProduto, LocalDateTime dataPedido, List<Produto> produtos) {
        this.quantidadeProduto = qualidadeProduto;
        this.dataPedido = dataPedido;
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQualidadeProduto() {
        return quantidadeProduto;
    }

    public void setQualidadeProduto(int qualidadeProduto) {
        this.quantidadeProduto = qualidadeProduto;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", qualidadeProduto=" + quantidadeProduto +
                ", dataPedido=" + dataPedido +
                ", produtos=" + produtos +
                '}';
    }
}
