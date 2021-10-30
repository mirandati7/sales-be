package br.com.mr7.sales.service;

import br.com.mr7.sales.model.Product;
import br.com.mr7.sales.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product save(Product entity) {
        return repository.save(entity);
    }

    public Product findById(Long id) {
        Optional<Product> product = repository.findById(id);
        if(product.isEmpty()) {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return product.get();
    }


}
