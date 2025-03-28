package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;


    @Column(length = 30, name = "NOMEFANTASIA", nullable = false)
    private String nome;


    @Column(length = 50, name = "RAZAOSOCIAL", nullable = false)
    private String razaoSocial;


    @Column(length = 20, name = "CNPJ", nullable = false)
    private String cnpj;


    @Column(length = 50, name = "STATUS", nullable = false)
    private String status;



    public Fornecedor() {
    }

    public Fornecedor(Long id, String nome, String razaoSocial, String cnpj, String status) {
        this.id = id;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.status = status;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getRazaoSocial() {

        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {

        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {

        return cnpj;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
}
