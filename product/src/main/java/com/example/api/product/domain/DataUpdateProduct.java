package com.example.api.product.domain;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DataUpdateProduct(@NotNull Long id, String name, BigDecimal value) {
}
