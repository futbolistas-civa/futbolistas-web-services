package com.example.futbolistas.controller;

import com.example.futbolistas.entities.SoccerPlayer;
import com.example.futbolistas.service.SoccerPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/futbolista")
public class SoccerPlayerController {

    @Autowired
    private SoccerPlayerService soccerPlayerService;
    @GetMapping
    public List<SoccerPlayer> getAll(){
        return soccerPlayerService.getSoccerPlayers();
    }

    @GetMapping("/{soccerPlayerId}")
    public Optional<SoccerPlayer> getById(@PathVariable("soccerPlayerId") Long soccerPlayerId){
        return soccerPlayerService.getSoccerPlayers(soccerPlayerId);
    }
    @PostMapping
    public void saveUpdate(@RequestBody SoccerPlayer soccerPlayer){
        soccerPlayerService.saveOrUpdate(soccerPlayer);
    }

    @DeleteMapping("/{soccerPlayerId}")
    public void saveUpdate(@PathVariable("soccerPlayerId") Long soccerPlayerId){
        soccerPlayerService.delete(soccerPlayerId);
    }
}
