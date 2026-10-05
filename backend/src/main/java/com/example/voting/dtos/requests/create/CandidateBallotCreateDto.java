package com.example.voting.dtos.requests.create;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CandidateBallotCreateDto {
    @NotNull(message = "Выберите кандидата")
    private UUID candidateId;
}
