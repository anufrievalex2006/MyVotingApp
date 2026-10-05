package com.example.voting.repos;

import com.example.voting.models.api.Party;
import com.example.voting.models.api.VoteCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface PartyRepo extends JpaRepository<Party, UUID> {
    @Query("""
        select p.id as id, count(b) as votes
        from Party p left join ParliamentBallot b on b.party = p
        group by p.id
        """)
    List<VoteCount> countVotes();
}
