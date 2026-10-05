package com.example.voting.repos;

import com.example.voting.models.api.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DistrictRepo extends JpaRepository<District, UUID> {
}
