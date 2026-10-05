package com.example.voting.dtos.requests.create;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DistrictCreateDto {
    @NotBlank(message = "Введите название округа")
    private String name;
}
