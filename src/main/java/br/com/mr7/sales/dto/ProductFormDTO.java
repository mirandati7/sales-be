package br.com.mr7.sales.dto;

import br.com.mr7.sales.model.Product;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductFormDTO {

    private Long id;
    private String description;
    private String name;
    private String sku;
    private BigDecimal price;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate created;

    public Product toModel() {
       return new Product(name,description, price, sku);
    }

    public static ProductFormDTO fromModel(Product product) {
        return new ProductFormDTO(product.getId(),
                product.getDescription(),
                product.getName(),
                product.getSku(),
                product.getPrice(),
                product.getCreated() );
    }


    public ProductFormDTO() {
    }

    public ProductFormDTO(Long id, String description, String name, String sku, BigDecimal price, LocalDate created) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "ProductFormDTO{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                '}';
    }
}
