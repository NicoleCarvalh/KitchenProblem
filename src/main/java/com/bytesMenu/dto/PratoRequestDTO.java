package com.bytesMenu.dto;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record PratoRequestDTO(
        @NotBlank(message = "O nome é obrigatório")
        String name,
        String description,
        BigDecimal price,
        Boolean available
) {
}
