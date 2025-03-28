package org.example.resources;


import org.example.entities.Fornecedor;
import org.example.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FornecedorResource {

    @Autowired
    private FornecedorService service;

    @GetMapping
    public List<Fornecedor> getAll() {

        return service.getAll();
    }

    @GetMapping("/{id}")
    public Fornecedor findById(@PathVariable Long id) {

        return service.findById(id);
    }

    @PostMapping
    public Fornecedor insert(@RequestBody Fornecedor obj) {

        return service.insert(obj);
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable Long id, @RequestBody Fornecedor obj) {

        return service.update(id, obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        service.delete(id);
    }
}
