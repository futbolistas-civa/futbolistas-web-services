package com.example.futbolistas.service;

import com.example.futbolistas.entities.SoccerPlayer;
import com.example.futbolistas.repository.SoccerPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoccerPlayerService {
    @Autowired
    SoccerPlayerRepository soccerPlayerRepository;

    public List<SoccerPlayer> getSoccerPlayers(){
        return soccerPlayerRepository.findAll();
    }

    public Optional<SoccerPlayer> getSoccerPlayers(Long id){
        return soccerPlayerRepository.findById(id);
    }

    public void saveOrUpdate(SoccerPlayer soccerPlayer){
        soccerPlayerRepository.save(soccerPlayer);
    }

    public void delete(Long id){
        soccerPlayerRepository.deleteById(id);
    }
}
