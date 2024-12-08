package com.example.eventManagement.Service;

import com.example.eventManagement.Repository.EventRepository;
import com.example.eventManagement.Repository.ParticipantRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
abstract class ParticipantsServiceImp implements ParticipantsService {
    private final ParticipantRepository participantRepository ;


    public ParticipantsServiceImp(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }
}


