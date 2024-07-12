package com.example.futbolistas.repository;

import com.example.futbolistas.entities.SoccerPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoccerPlayerRepository extends JpaRepository<SoccerPlayer, Long> {

}
