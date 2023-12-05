package com.senac.ecomerce.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.senac.ecomerce.model.*;
import com.senac.ecomerce.repository.CompraRepository;
import com.senac.ecomerce.repository.ItemRepository;
import com.senac.ecomerce.repository.ProdutoRepository;

@RestController
@RequestMapping("Compra")
@CrossOrigin(origins = "*")
public class CompraController {
    @Autowired
    private CompraRepository repository;
    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Compra> FindAll() {
        return repository.findAll();
    }

    private Produto Search(List<Carrinho> carrinho, int i) {
        ProdutoController controller = new ProdutoController();
        controller.setRepository(produtoRepository);
        Long seila = carrinho.get(i).getId();
        return controller.GetById(seila);
    }

    @PostMapping
    public void save(@RequestBody List<Carrinho> carrinho) {
        Double sum = 0.0;
        for (int i = 0; i < carrinho.size(); i++) {
            Produto result = Search(carrinho, i);
            sum += (result.getValor() * carrinho.get(i).getQtd());
        }
        Compra compra = new Compra(LocalDateTime.now(), sum);
        repository.saveAndFlush(compra);
        ItemController controller = new ItemController();
        controller.setRepository(itemRepository);
        for (int i = 0; i < carrinho.size(); i++) {
            Produto result = Search(carrinho, i);
            ItemQuantidadeKey key = new ItemQuantidadeKey(result.getId(), compra.getID());
            Item item = new Item(key, result, compra, carrinho.get(i).getQtd());
            controller.save(item);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
