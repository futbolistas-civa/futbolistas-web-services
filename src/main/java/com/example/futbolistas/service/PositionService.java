package com.example.futbolistas.service;

import com.example.futbolistas.entities.Position;
import com.example.futbolistas.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {
    @Autowired
    PositionRepository positionRepository;

    public List<Position> getAllPositions(){
        return positionRepository.findAll();
    }
}
