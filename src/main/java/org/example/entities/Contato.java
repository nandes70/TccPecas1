package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contato implements Serializable {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 20, name = "TELEFONE", nullable = false)
    private String telefone;

    @Column(length = 20, name = "CELULAR", nullable = false)
    private String celular;

    @Column(length = 50, name = "EMAIL", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "CLIENTE", nullable = false)
    private Cliente cliente;

    public Contato() {
    }

    public Contato(Long id, String telefone, String celular, String email, Cliente cliente) {
        this.id = id;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.cliente = cliente;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getCelular() {

        return celular;
    }

    public void setCelular(String celular) {

        this.celular = celular;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Cliente getCliente() {

        return cliente;
    }

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;
    }
}
