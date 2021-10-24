package br.com.mr7.sales.repository;

import br.com.mr7.sales.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}