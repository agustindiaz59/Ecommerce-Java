package com.example.ecommerce.dtos;

import jakarta.validation.constraints.NotEmpty;


public record LoginForm(
        @NotEmpty
        String username,
        @NotEmpty
        String password
) {
}
