package com.example.futbolistas.repository;

import com.example.futbolistas.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
