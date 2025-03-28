package org.example.services;

import org.example.entities.FormaDePagamento;
import org.example.repositories.FormaDePagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormaDePagamentoService {

    @Autowired
    private FormaDePagamentoRepository repository;

    //Listar todos
    public List<FormaDePagamento> findAll() {
        return repository.findAll();
    }

    //Listar por id
    public Optional<FormaDePagamento> findById(Long id) {
        return repository.findById(id);
    }

    //Inserir
    public FormaDePagamento insert(FormaDePagamento formadePagamento) {
        return repository.save(formadePagamento);
    }

    //Deletar
    public void delete(Long id) {
        repository.deleteById(id);
    }

    //Atualizar
    public boolean update(Long id, FormaDePagamento formaPagamento) {
        Optional<FormaDePagamento> optional = repository.findById(id);
        if (optional.isPresent()) {
            FormaDePagamento formadePagamento1 = optional.get();
            formadePagamento1.setDescricao(formaPagamento.getDescricao());
            formadePagamento1.setTipo(formaPagamento.getTipo());
            formadePagamento1.setStatus(formaPagamento.getStatus());
            repository.save(formadePagamento1);
            return true;
        }
        return false;
    }
}
