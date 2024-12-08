package com.example.eventManagement.Controller;
import com.example.eventManagement.Entites.Participants;
import com.example.eventManagement.Service.ParticipantsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/participants")
public class ParticipantsController {

    @Autowired
    private ParticipantsService participantsService;
    @GetMapping
    public ResponseEntity<List<Participants>> getAllParticipants() {
        List<Participants> participants = participantsService.getAllParticipants();
        return new ResponseEntity<>(participants, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Participants> getParticipantById(@PathVariable long id) {
        Participants participant = participantsService.getParticipantById(id);
        if (participant != null) {
            return new ResponseEntity<>(participant, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping
    public ResponseEntity<Participants> createParticipant(@RequestBody Participants participant) {
        Participants createdParticipant = participantsService.createParticipant(participant);
        return new ResponseEntity<>(createdParticipant, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Participants> updateParticipant(@PathVariable long id, @RequestBody Participants participant) {
        Participants updatedParticipant = participantsService.updateParticipant(id, participant);
        if (updatedParticipant != null) {
            return new ResponseEntity<>(updatedParticipant, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParticipant(@PathVariable long id) {
        if (participantsService.deleteParticipant(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }





}



