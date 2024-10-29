package com.example.eventManagement.Controller;
import com.example.eventManagement.Service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/events")

public class EventController {

    @Autowired
    private EventService eventService;


}
