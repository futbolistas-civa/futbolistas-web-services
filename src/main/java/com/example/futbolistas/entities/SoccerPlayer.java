package com.example.futbolistas.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
@Table(name="soccer_player")
public class SoccerPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long soccerPlayerId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "lastname", nullable = false, length = 100)
    private String lastName;

    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

    @Column(name = "features", nullable = false)
    private String features;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
}
