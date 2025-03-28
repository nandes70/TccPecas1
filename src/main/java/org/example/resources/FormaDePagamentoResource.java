package org.example.resources;


import org.example.entities.FormaDePagamento;
import org.example.services.FormaDePagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/formadepagamentos")
public class FormaDePagamentoResource {

    @Autowired
    private FormaDePagamentoService formadePagamentoService;

    // Busca todos
    @GetMapping
    public ResponseEntity<List<FormaDePagamento>> findAll() {
        List<FormaDePagamento> formadePagamento = formadePagamentoService.findAll();
        return ResponseEntity.ok(formadePagamento);

    }

    // Busca por id
    @GetMapping("/{id}")
    public ResponseEntity<FormaDePagamento> findById(@PathVariable Long id) {
        Optional<FormaDePagamento> formadePagamento = formadePagamentoService.findById(id);
        return formadePagamento.map(ResponseEntity::ok).orElseGet(()
                -> ResponseEntity.notFound().build());
    }

    //Insere
    @PostMapping
    public ResponseEntity<FormaDePagamento> insert(@RequestBody FormaDePagamento formadePagamento) {
        FormaDePagamento created = formadePagamentoService.insert(formadePagamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        formadePagamentoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    //Atualiza
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody FormaDePagamento formadePagamento) {
        if (formadePagamentoService.update(id, formadePagamento)) {
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
