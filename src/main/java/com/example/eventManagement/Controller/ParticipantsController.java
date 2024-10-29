package com.example.eventManagement.Controller;
import com.example.eventManagement.Service.ParticipantsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/participants")
public class ParticipantsController {

    @Autowired
    private ParticipantsService participantsService;


}



