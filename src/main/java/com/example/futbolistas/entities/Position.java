package com.example.futbolistas.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
}
