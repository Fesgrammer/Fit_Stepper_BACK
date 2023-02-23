package com.fitstepper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MotionController {
    @Autowired
    private MotionRepository repository;

    @RequestMapping(value = "/api/motion/regMsRec", method = { RequestMethod.POST })
    public String registMotionRecord(@RequestBody RegMsRecIn rmri) {
        Motion ms = new Motion();
        ms.setMotionId(0);
        ms.setUserId(rmri.getUser_id());
        ms.setBuiId(rmri.getBui_id());
        ms.setEventId(rmri.getEvent_id());
        ms.setAmount(rmri.getAmount());
        ms.setDate(rmri.getDate());

        repository.save(ms);
        return "OK";
    }

    @RequestMapping("/api/motion/exMsRec")
    public String existsMotionRecord(@RequestParam("user_id") int userId) {
        Boolean answer = repository.existsByUserId(userId);
        if (answer) {
            return "YES";
        } else {
            return "NO";
        }
    }

    @RequestMapping("/api/motion/getMsRec")
    public Iterable<Motion> getMotionRecord(@RequestParam("user_id") int userId) {
        return repository.findByUserId(userId);
    }

    @RequestMapping("/api/motion/clucMsSum")
    public ClucMsSumOut clucMotionSum(@RequestParam("user_id") int userId, @RequestParam("bui_id") int buiId) {
        List<Motion> ms = repository.findByUserIdAndBuiId(userId, buiId);

        int msSize = ms.size();
        int sum = 0;

        // 対象の部位の運動量を取得
        for (int i = 0; i < msSize; i++) {
            Motion mss = ms.get(i);
            sum += mss.getAmount();
        }

        ClucMsSumOut cmso = new ClucMsSumOut(sum);
        return cmso;
    }
}
