package br.com.mr7.sales.service;

import br.com.mr7.sales.model.Product;
import br.com.mr7.sales.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product save(Product entity) {
        return repository.save(entity);
    }


}
