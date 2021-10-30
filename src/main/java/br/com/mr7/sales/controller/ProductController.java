package br.com.mr7.sales.controller;

import br.com.mr7.sales.dto.ProductFormDTO;
import br.com.mr7.sales.model.Product;
import br.com.mr7.sales.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService service;


    @PostMapping
    public ProductFormDTO save(@RequestBody ProductFormDTO dto) {
        Product product = dto.toModel();
        service.save(product);
        return ProductFormDTO.fromModel(product);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody ProductFormDTO dto) {
        /**
         * Pesquisar para ver ser existe
         */
        service.findById(id);
        Product product = dto.toModel();
        product.setId(id);
        service.save(product);
        return ResponseEntity.ok().build();
    }
}
