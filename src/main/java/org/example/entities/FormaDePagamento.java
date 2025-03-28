package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FormaDePagamento implements Serializable {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 15, name = "TIPO", nullable = false)
    private String tipo;

    @Column(length = 100, name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(length = 20, name = "STATUS", nullable = false)
    private String status;

    public FormaDePagamento() {
    }

    public FormaDePagamento(Long id, String tipo, String descricao, String status) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.status = status;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
}
