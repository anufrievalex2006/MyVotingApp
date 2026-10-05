package com.example.voting.dtos.responses;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DistrictResponse {
    private UUID id;
    private String name;
}
