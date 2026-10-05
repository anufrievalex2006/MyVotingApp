package com.example.voting.dtos.requests.update;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DistrictUpdateDto {
    @NotBlank(message = "Введите название округа")
    private String name;
}
