package com.example.voting.models.api;

import lombok.*;
import jakarta.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidate_ballots")
public class CandidateBallot extends Ballot {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;
}
