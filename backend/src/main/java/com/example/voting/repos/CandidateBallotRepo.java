package com.example.voting.repos;

import com.example.voting.models.api.CandidateBallot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CandidateBallotRepo extends JpaRepository<CandidateBallot, UUID> {
    boolean existsByCandidateId(UUID candidateId);
}
