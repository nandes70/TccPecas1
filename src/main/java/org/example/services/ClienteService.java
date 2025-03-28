package org.example.services;

import org.example.entities.Cliente;
import org.example.entities.Fornecedor;
import org.example.repositories.ClienteRepository;
import org.example.services.exeptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    //Listar todos
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    //Listar por id
    public Cliente findById(Long id) {
        Optional<Cliente> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    //Inserir
    public Cliente insert(Cliente cliente) {
        return repository.save(cliente);
    }

    //Deletar
    public void delete(Long id) {
        repository.deleteById(id);
    }

    //Atualizar
    public boolean update(Long id, Cliente cliente) {
        Optional<Cliente> optional = repository.findById(id);
        if (optional.isPresent()) {
            Cliente cliente1 = optional.get();
            cliente1.setNome(cliente.getNome());
            cliente1.setCpf(cliente.getCpf());
            cliente1.setDataNascimento(cliente.getDataNascimento());
            cliente1.setStatus(cliente.getStatus());
            repository.save(cliente1);
            return true;
        }
        return false;
    }
}
