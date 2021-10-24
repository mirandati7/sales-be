package br.com.mr7.sales.controller;

import br.com.mr7.sales.dto.ProductFormDTO;
import br.com.mr7.sales.model.Product;
import br.com.mr7.sales.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
