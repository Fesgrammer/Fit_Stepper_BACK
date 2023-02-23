package com.fitstepper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LevelController {
    @Autowired
    private LevelRepository repository;

    @RequestMapping("/api/level/clucNowLevel")
    public ClucNowLvOut clucNowLevel(@RequestParam("bui_id") int buiId, @RequestParam("amount") int amount) {
        List<Level> lv = repository.findByBuiIdOrderByAmountAsc(buiId);

        int lvSize = lv.size();
        int level = 0;

        // 対象の部位の運動量を取得
        for (int i = 0; i < lvSize; i++) {
            Level lvs = lv.get(i);
            if (amount < lvs.getAmount()) {
                ClucNowLvOut cnlo = new ClucNowLvOut(lvs.getLevel() - 1);
                return cnlo;
            }
            level = lvs.getLevel();
        }

        // 登録済みのレベルのうち、最高レベルになっている
        ClucNowLvOut cnlo = new ClucNowLvOut(level);
        return cnlo;
    }
}
