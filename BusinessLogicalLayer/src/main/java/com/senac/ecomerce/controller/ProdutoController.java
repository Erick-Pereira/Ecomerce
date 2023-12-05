package com.senac.ecomerce.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.senac.ecomerce.model.Produto;
import com.senac.ecomerce.model.ProdutoViewModel;
import com.senac.ecomerce.repository.ProdutoRepository;

@RestController
@RequestMapping("Product")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> FindAll() {
        return repository.findAll();
    }

    @GetMapping("/ViewModel")
    public List<ProdutoViewModel> findProductViewModel() {
        return repository.findProductViewModel();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> FindById(@PathVariable("id") Long id) {
        Optional<Produto> result = repository.findById(id);
        if (result.isPresent()) {
            return ResponseEntity.of(result);
        }
        return ResponseEntity.badRequest().build();
    }

    public Produto GetById(@PathVariable("id") Long id) {
        Optional<Produto> result = repository.findById(id);
        return result.get();
    }

    @PostMapping
    public void save(Produto produto) {
        repository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    public ProdutoRepository getRepository() {
        return repository;
    }

    public void setRepository(ProdutoRepository repository) {
        this.repository = repository;
    }
}
