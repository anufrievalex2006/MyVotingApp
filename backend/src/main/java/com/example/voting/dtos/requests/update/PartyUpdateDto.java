package com.example.voting.dtos.requests.update;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PartyUpdateDto {
    @NotBlank(message = "Введите название партии")
    private String name;
    private String description;
}
