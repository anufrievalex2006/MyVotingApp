package com.example.voting.dtos.requests.create;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PartyCreateDto {
    @NotBlank(message = "Введите название партии")
    private String name;
    private String description;
}
