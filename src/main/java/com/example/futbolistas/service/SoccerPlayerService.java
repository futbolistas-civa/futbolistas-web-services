package com.example.futbolistas.service;

import com.example.futbolistas.entities.Position;
import com.example.futbolistas.entities.SoccerPlayer;
import com.example.futbolistas.repository.PositionRepository;
import com.example.futbolistas.repository.SoccerPlayerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoccerPlayerService {
    @Autowired
    SoccerPlayerRepository soccerPlayerRepository;
    PositionRepository positionRepository;

    public List<SoccerPlayer> getSoccerPlayers(){
        return soccerPlayerRepository.findAll();
    }

    public Optional<SoccerPlayer> getSoccerPlayers(Long id){
        return soccerPlayerRepository.findById(id);
    }

    @Transactional
    public SoccerPlayer saveOrUpdate(SoccerPlayer soccerPlayer) {
        // Ensure the position is already persisted
        Position position = soccerPlayer.getPosition();
        if (position != null && position.getId() == null) {
            // Save the new position
            position = positionRepository.save(position);
            soccerPlayer.setPosition(position);
        }
        return soccerPlayerRepository.save(soccerPlayer);
    }

    public void delete(Long id){
        soccerPlayerRepository.deleteById(id);
    }
}
