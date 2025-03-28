package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Cliente implements Serializable {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 55, name = "NOME", nullable = false)
    private String nome;

    @Column(length = 25, name = "CPF", nullable = false)
    private String Cpf;

    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 20, name = "STATUS", nullable = false)
    private String status;


    //Construtor vazio
    public Cliente() {
    }


    //Construtor com argumentos
    public Cliente(Long id, String nome, String cpf, LocalDate dataNascimento, String status) {
        this.id = id;
        this.nome = nome;
        Cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.status = status;
    }


    //Getters e setters

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

    public String getCpf() {

        return Cpf;
    }

    public void setCpf(String cpf) {

        Cpf = cpf;
    }

    public LocalDate getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
}
