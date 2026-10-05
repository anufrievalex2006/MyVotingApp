package com.example.voting.dtos.responses;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CandidateResponse {
    private UUID id;
    private String name;
    private String description;
    private UUID districtId;
    private UUID partyId;
}
