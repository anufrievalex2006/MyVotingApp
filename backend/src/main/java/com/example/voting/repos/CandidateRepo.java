package com.example.voting.repos;

import com.example.voting.models.api.Candidate;
import com.example.voting.models.api.VoteCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CandidateRepo extends JpaRepository<Candidate, UUID> {
    boolean existsByPartyId(UUID partyId);
    boolean existsByDistrictId(UUID districtId);
    boolean existsByDistrictIdAndPartyId(UUID districtId, UUID partyId);
    Optional<Candidate> findByIdAndDistrictId(UUID id, UUID districtId);

    @Query("""
        select c.id as id, count(b) as votes
        from Candidate c left join CandidateBallot b on b.candidate = c
        where c.district.id = :districtId
        group by c.id
        """)
    List<VoteCount> countVotesByDistrict(UUID districtId);
    @Query("""
        select c.id as id, count(b) as votes
        from Candidate c left join CandidateBallot b on b.candidate = c
        group by c.id
        """)
    List<VoteCount> countVotes();
}
