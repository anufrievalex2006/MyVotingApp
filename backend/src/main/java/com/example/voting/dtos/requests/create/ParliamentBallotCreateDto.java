package com.example.voting.dtos.requests.create;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParliamentBallotCreateDto {
    @NotNull(message = "Выберите партию")
    private UUID partyId;
}
