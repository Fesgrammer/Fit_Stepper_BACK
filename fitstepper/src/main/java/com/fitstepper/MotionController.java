package com.fitstepper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MotionController {
    @Autowired
    private MotionRepository repository;

    @RequestMapping(value = "/api/motion/regMsRec", method = { RequestMethod.POST })
    public String registMotionRecord(@RequestBody RegMsRecIn rmri) {
        Motion ms = new Motion();
        ms.setMotion_id(0);
        ms.setUser_id(rmri.getUser_id());
        ms.setBui_id(rmri.getBui_id());
        ms.setEvent_id(rmri.getEvent_id());
        ms.setAmount(rmri.getAmount());
        ms.setDate(rmri.getDate());

        repository.save(ms);
        return "OK";
    }
}
