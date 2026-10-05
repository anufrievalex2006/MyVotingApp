package com.example.voting.dtos.responses;

import com.example.voting.models.api.Ballot;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BallotResponse {
    private UUID id;
    private LocalDateTime createdAt;

    public static BallotResponse from(Ballot b) {
        return BallotResponse.builder()
                .id(b.getId())
                .createdAt(b.getCreatedAt())
                .build();
    }
}
