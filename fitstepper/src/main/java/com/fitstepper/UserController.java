package com.fitstepper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
        @Autowired
        private UserRepository repository;

        @RequestMapping("api/user/login")
        public String login(@RequestParam("user_id") int userId) {

                return "YES";
        }

        @RequestMapping("api/user/add")
        public String add(@RequestParam("user_id") int userId) {

                return "YES";
        }

        @RequestMapping("api/user/getLevel") // 実装できるかわからなそう？
        public int getuserlevel(@RequestParam("user_id") int userId) {

                return 1;
        }

        @RequestMapping(value = "api/user/updateData", method = { RequestMethod.POST })
        public String updateData(@RequestBody UpdateUsrDataIn uddi) {
                User usrBefore = repository.findByUserId(uddi.getUser_id());
                User usr = new User();

                usr = usrBefore;
                Boolean updateFlag = false;

                switch (uddi.getBui_id()) {
                        case 1:
                                if (usrBefore.getJouwan2Level() < uddi.getNew_level()) {
                                        usr.setJouwan2Level(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setJouwan2Amt(uddi.getTotal_amount());
                                break;
                        case 2:
                                if (usrBefore.getJouwan3Level() < uddi.getNew_level()) {
                                        usr.setJouwan3Level(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setJouwan3Amt(uddi.getTotal_amount());
                                break;
                        case 3:
                                if (usrBefore.getChestLevel() < uddi.getNew_level()) {
                                        usr.setChestLevel(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setChestAmt(uddi.getTotal_amount());
                                break;
                        case 4:
                                if (usrBefore.getAdsLevel() < uddi.getNew_level()) {
                                        usr.setAdsLevel(uddi.getNew_level());
                                        ;
                                        updateFlag = true;
                                }
                                usr.setAdsAmt(uddi.getTotal_amount());
                                break;
                        case 5:
                                if (usrBefore.getShoulderLevel() < uddi.getNew_level()) {
                                        usr.setShoulderLevel(uddi.getNew_level());
                                        ;
                                        updateFlag = true;
                                }
                                usr.setShoulderAmt(uddi.getTotal_amount());
                                break;
                        case 6:
                                if (usrBefore.getBackLevel() < uddi.getNew_level()) {
                                        usr.setBackLevel(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setBackAmt(uddi.getTotal_amount());
                                break;
                        case 7:
                                if (usrBefore.getHipLevel() < uddi.getNew_level()) {
                                        usr.setHipLevel(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setHipAmt(uddi.getTotal_amount());
                                break;
                        case 8:
                                if (usrBefore.getThighLevel() < uddi.getNew_level()) {
                                        usr.setThighLevel(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setThighAmt(uddi.getTotal_amount());
                                break;
                        case 9:
                                if (usrBefore.getCalfLevel() < uddi.getNew_level()) {
                                        usr.setCalfLevel(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setCalfAmt(uddi.getTotal_amount());
                                break;

                }

                repository.save(usr);

                if (updateFlag) {
                        return "UP";
                } else {
                        return "KEEP";
                }

        }
}
