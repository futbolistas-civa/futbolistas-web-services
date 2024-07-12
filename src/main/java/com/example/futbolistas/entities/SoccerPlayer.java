package com.example.futbolistas.entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="soccer_player")
public class SoccerPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SoccerPlayerId;

    @Column(name = "name", nullable = false, length = 100)
    private String Name;

    @Column(name = "lastname", nullable = false, length = 100)
    private String lastName;

    @Column(name = "birthdate", nullable = false)
    private String birthdate;

    @Column(name = "features", nullable = false)
    private String features;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
}
