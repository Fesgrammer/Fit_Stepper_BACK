package com.fitstepper;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ExampleController {
    @GetMapping(path = "/api/hello")
    public Aisatu hello(@RequestParam(value = "name") String name) {
        Aisatu ast = new Aisatu(name);
        return ast;
    }
}
