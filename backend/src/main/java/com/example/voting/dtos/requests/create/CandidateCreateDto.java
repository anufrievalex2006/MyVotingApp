package com.example.voting.dtos.requests.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CandidateCreateDto {
    @NotBlank(message = "Введите имя кандидата")
    private String name;
    private String description;
    @NotNull(message = "Выберите округ, к которому прикреплен кандидат")
    private UUID districtId;
    @NotNull(message = "Выберите партию кандидата")
    private UUID partyId;
}
