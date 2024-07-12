package com.example.futbolistas.initializer;

import com.example.futbolistas.entities.Position;
import com.example.futbolistas.entities.enumeration.PositionEnum;
import com.example.futbolistas.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public void run(String... args) throws Exception {
        if (positionRepository.count() == 0) {
            positionRepository.saveAll(List.of(
                    new Position(null, PositionEnum.ARQUERO),
                    new Position(null, PositionEnum.DEFENSA),
                    new Position(null, PositionEnum.MEDIOCAMPISTA),
                    new Position(null, PositionEnum.DELANTERO)
            ));
        }
    }
}