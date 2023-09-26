package com.example.api.product.controller;

import com.example.api.product.domain.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public void register(@RequestBody ProductRegistrationData data) {
        repository.save(new Product(data));
    }

    @GetMapping
    public Page<ProductDataList> productList(@PageableDefault(size = 10, sort = {"name"}) Pageable paginate) {
        return repository.findAll(paginate).map(ProductDataList::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DataUpdateProduct data) {
        var product = repository.getReferenceById(data.id());
        product.updateProduct(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
