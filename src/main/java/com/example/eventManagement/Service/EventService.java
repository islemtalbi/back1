package com.example.eventManagement.Service;

import com.example.eventManagement.Entites.Event;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();
    Event getEventById(long id);
    Event createEvent(Event event);
    Event updateEvent(long id, Event event);
    void deleteEvent(long id);

}
