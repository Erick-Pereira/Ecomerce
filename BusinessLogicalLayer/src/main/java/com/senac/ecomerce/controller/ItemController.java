package com.senac.ecomerce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.senac.ecomerce.model.Item;
import com.senac.ecomerce.repository.ItemRepository;

@RestController
@RequestMapping("Item")
@CrossOrigin(origins = "*")
public class ItemController {
    @Autowired
    private ItemRepository repository;

    @GetMapping
    public List<Item> FindAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(Item item) {

        repository.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    public ItemRepository getRepository() {
        return repository;
    }

    public void setRepository(ItemRepository repository) {
        this.repository = repository;
    }
}
