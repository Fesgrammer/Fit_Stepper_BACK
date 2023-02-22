package com.fitstepper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BuiContlloer {

    @Autowired
    private MoitonRepository repository;

    @GetMapping(path = "/api/bui/getBuiList")
    public Iterable<Bui> getBuiList() {
        return repository.findAll();
    }

    /*
     * @GetMapping(path = "/api/motion/getEventList")
     * public Iterable<Event> getEventList() {
     * return repository.findAll();
     * }
     */

}