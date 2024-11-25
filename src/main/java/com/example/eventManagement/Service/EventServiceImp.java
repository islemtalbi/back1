package com.example.eventManagement.Service;

import com.example.eventManagement.Entites.Event;
import com.example.eventManagement.Repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class EventServiceImp implements EventService{
    private final EventRepository eventRepository;

    public EventServiceImp(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getAllEvents() {
        return List.of();
    }

    @Override
    public Event getEventById(long id) {
        return null;
    }

    @Override
    public Event createEvent(Event event) {
        return null;
    }

    @Override
    public Event updateEvent(long id, Event event) {
        return null;
    }

    @Override
    public void deleteEvent(long id) {

    }
}

