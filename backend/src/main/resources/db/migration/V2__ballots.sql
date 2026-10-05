CREATE TABLE candidate_ballots (
    id uuid PRIMARY KEY,
    created_at timestamp NOT NULL,
    candidate_id uuid NOT NULL REFERENCES candidates(id)
);
CREATE INDEX idx_candidate_ballots_candidate ON candidate_ballots(candidate_id);

CREATE TABLE parliament_ballots (
    id uuid PRIMARY KEY,
    created_at timestamp NOT NULL,
    party_id uuid NOT NULL REFERENCES parties(id)
);
CREATE INDEX idx_parliament_ballots_party ON parliament_ballots(party_id);