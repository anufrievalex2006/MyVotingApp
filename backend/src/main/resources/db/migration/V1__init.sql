CREATE TABLE districts (
    id uuid PRIMARY KEY,
    name varchar(255) NOT NULL
);

CREATE TABLE parties (
    id uuid PRIMARY KEY,
    name varchar(255) NOT NULL,
    description varchar(255)
);

CREATE TABLE candidates (
    id uuid PRIMARY KEY,
    name varchar(255) NOT NULL,
    description varchar(255),
    district_id uuid NOT NULL REFERENCES districts(id),
    party_id uuid NOT NULL REFERENCES parties(id),
    CONSTRAINT uq_candidate_party_district UNIQUE (party_id, district_id)
);