package com.example.voting.repos;

import com.example.voting.models.api.ParliamentBallot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParliamentBallotRepo extends JpaRepository<ParliamentBallot, UUID> {
    boolean existsByPartyId(UUID partyId);
}
