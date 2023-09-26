package com.example.api.product.domain;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record ProductRegistrationData (
        @NotBlank
        String name,

        @NotBlank
        BigDecimal value
){


}
