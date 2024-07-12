package com.example.futbolistas.controller;

import com.example.futbolistas.entities.Position;
import com.example.futbolistas.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="api/v1/posicion")
public class PositionController {
    @Autowired
    private PositionService positionService;
    @GetMapping
    public List<Position> getAll(){
        return positionService.getAllPositions();
    }
}
