package com.example.futbolistas.controller;

import com.example.futbolistas.entities.Position;
import com.example.futbolistas.entities.SoccerPlayer;
import com.example.futbolistas.service.PositionService;
import com.example.futbolistas.service.SoccerPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping(path="api/v1/futbolista")
public class SoccerPlayerController {

    @Autowired
    private SoccerPlayerService soccerPlayerService;
    @Autowired
    private PositionService positionService;
    @GetMapping
    public List<SoccerPlayer> getAll(){
        return soccerPlayerService.getSoccerPlayers();
    }


    @GetMapping("/{soccerPlayerId}")
    public Optional<SoccerPlayer> getById(@PathVariable("soccerPlayerId") Long soccerPlayerId){
        return soccerPlayerService.getSoccerPlayers(soccerPlayerId);
    }
    @PostMapping
    public SoccerPlayer saveUpdate(@RequestBody SoccerPlayer soccerPlayer) {

        return soccerPlayerService.saveOrUpdate(soccerPlayer);
    }

    @DeleteMapping("/{soccerPlayerId}")
    public void delete(@PathVariable("soccerPlayerId") Long soccerPlayerId){
        soccerPlayerService.delete(soccerPlayerId);
    }
}
