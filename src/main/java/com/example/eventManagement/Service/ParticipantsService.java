package com.example.eventManagement.Service;

import com.example.eventManagement.Entites.Participants;
import java.util.List;
import java.util.Optional;

public interface ParticipantsService {
    List<Participants> getAllParticipants();

    Participants getParticipantById(long id);

    Participants createParticipant(Participants participant);

    Participants updateParticipant(long id, Participants participant);

    boolean deleteParticipant(long id);












    /*
    List<Participants> getAllParticipants();
    Optional<Participants> getParticipantById(long id);
    Participants createParticipant(Participants participant);
    Participants updateParticipant(Participants participant);
    void deleteParticipant(long id)
    */;

}

