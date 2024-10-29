package com.example.eventManagement.Entites;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_event")
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "dateHeure")
    private LocalDateTime dateHeure;
    @Column(name = "rappelAvant")
    private int rappelAvant;
    @Column(name = "userId")
    private long userId;
    @Column(name = "participants")
    @OneToMany(mappedBy = "event")
    private List<Participants> participants;






    }


