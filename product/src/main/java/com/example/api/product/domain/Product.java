package com.example.api.product.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "products")
@Entity(name = "Product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private BigDecimal value;

    public Product(ProductRegistrationData data) {
        this.name = data.name();
        this.value = data.value();
    }
    public void updateProduct(DataUpdateProduct data) {
        if (data.name() != null) this.name = data.name();

        if (data.value() != null) this.value = data.value();
    }
}
