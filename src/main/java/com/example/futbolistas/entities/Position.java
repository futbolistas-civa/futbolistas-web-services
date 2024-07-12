package com.example.futbolistas.entities;

import com.example.futbolistas.entities.enumeration.PositionEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private PositionEnum type;
}
