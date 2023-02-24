package com.fitstepper;

import java.util.ArrayList;
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

    @RequestMapping(value = "/api/level/getNeedMsAmt", method = { RequestMethod.POST })
    public List<GetNdMsAmtOut> getNeedMotionAmount(@RequestBody List<GetNdMsAmtIn> nmai) {
        List<GetNdMsAmtOut> nmao = new ArrayList<GetNdMsAmtOut>();

        int nmaiSize = nmai.size();

        for (int i = 0; i < nmaiSize; i++) {
            GetNdMsAmtIn nmais = nmai.get(i);
            int now_amount = nmais.getNow_amount();
            int sub;
            if (repository.existsByBuiIdAndLevel(nmais.getBui_id(), nmais.getNow_level() + 1)) {
                Level lv = repository.findByBuiIdAndLevel(nmais.getBui_id(), nmais.getNow_level() + 1);
                sub = lv.getAmount() - now_amount;
                GetNdMsAmtOut nmaos = new GetNdMsAmtOut(nmais.getBui_id(), nmais.getBui_name(),
                        nmais.getNow_level() + 1, sub);
                nmao.add(nmaos);
            } else {
                // 次のレベルが登録されていない
                GetNdMsAmtOut nmaos = new GetNdMsAmtOut(nmais.getBui_id(), nmais.getBui_name(),
                        nmais.getNow_level() + 1, -1);
                nmao.add(nmaos);
            }
        }

        return nmao;
    }
}
