package com.example.voting.models.api;

import lombok.*;
import jakarta.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "parliament_ballots")
public class ParliamentBallot extends Ballot {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "party_id", nullable = false)
    private Party party;
}
