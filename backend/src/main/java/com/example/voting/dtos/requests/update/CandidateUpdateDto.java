package com.example.voting.dtos.requests.update;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CandidateUpdateDto {
    @NotBlank(message = "Введите имя кандидата")
    private String name;
    private String description;
    @NotNull(message = "Выберите округ, к которому прикреплен кандидат")
    private UUID districtId;
    @NotNull(message = "Выберите партию кандидата")
    private UUID partyId;
}
