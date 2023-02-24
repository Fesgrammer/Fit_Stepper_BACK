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
                User usrBefore = repository.findById(uddi.getUser_id());
                User usr = new User();

                usr = usrBefore;
                Boolean updateFlag = false;

                switch (uddi.getBui_id()) {
                        case 1:
                                if (usrBefore.getJouwan2_level() < uddi.getNew_level()) {
                                        usr.setJouwan2_level(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setJouwan2_amt(uddi.getTotal_amount());
                                break;
                        case 2:
                                if (usrBefore.getJouwan3_level() < uddi.getNew_level()) {
                                        usr.setJouwan3_level(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setJouwan3_amt(uddi.getTotal_amount());
                                break;
                        case 3:
                                if (usrBefore.getChest_level() < uddi.getNew_level()) {
                                        usr.setChest_level(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setChest_amt(uddi.getTotal_amount());
                                break;
                        case 4:
                                if (usrBefore.getAds_level() < uddi.getNew_level()) {
                                        usr.setAds_level(uddi.getNew_level());
                                        ;
                                        updateFlag = true;
                                }
                                usr.setAds_amt(uddi.getTotal_amount());
                                break;
                        case 5:
                                if (usrBefore.getShoulder_level() < uddi.getNew_level()) {
                                        usr.setShoulder_level(uddi.getNew_level());
                                        ;
                                        updateFlag = true;
                                }
                                usr.setShoulder_amt(uddi.getTotal_amount());
                                break;
                        case 6:
                                if (usrBefore.getBack_level() < uddi.getNew_level()) {
                                        usr.setBack_level(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setBack_amt(uddi.getTotal_amount());
                                break;
                        case 7:
                                if (usrBefore.getHip_level() < uddi.getNew_level()) {
                                        usr.setHip_level(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setHip_amt(uddi.getTotal_amount());
                                break;
                        case 8:
                                if (usrBefore.getThigh_level() < uddi.getNew_level()) {
                                        usr.setThigh_level(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setThigh_amt(uddi.getTotal_amount());
                                break;
                        case 9:
                                if (usrBefore.getCalf_level() < uddi.getNew_level()) {
                                        usr.setCalf_level(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setCalf_amt(uddi.getTotal_amount());
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
