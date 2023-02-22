package com.fitstepper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Eventcontlloer {

    @Autowired
    private EventRepository repository;

    @GetMapping(path = "/api/event/getEventList")
    public Iterable<Event> getEventList() {
        return repository.findAll();
    }

}
