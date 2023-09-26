package com.example.api.product.domain;

import java.math.BigDecimal;

public record ProductDataList (int id, String name, BigDecimal value){
    public ProductDataList(Product product) {
        this(product.getId(), product.getName(), product.getValue());
    }
}
