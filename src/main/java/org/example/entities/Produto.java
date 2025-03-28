package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 100, name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "PRECOCUSTO")
    private double precoCusto;

    @Column(name = "PRECOVENDA")
    private double precoVenda;

    @Column(name = "ESTOQUE")
    private String estoque;

    @ManyToOne
    @JoinColumn(name = "FORNECEDOR", nullable = false)
    private Fornecedor fornecedor;

    public Produto(Long id, String descricao, double precoCusto, double precoVenda, String estoque, Fornecedor fornecedor) {
        this.id = id;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
        this.fornecedor = fornecedor;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }


    public Fornecedor getFornecedor() {

        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {

        this.fornecedor = fornecedor;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public double getPrecoCusto() {

        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {

        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {

        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {

        this.precoVenda = precoVenda;
    }

    public String getEstoque() {

        return estoque;
    }

    public void setEstoque(String estoque) {

        this.estoque = estoque;
    }
}
