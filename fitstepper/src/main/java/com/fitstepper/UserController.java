package com.fitstepper;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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

        @RequestMapping(value = "api/user/add", method = { RequestMethod.POST })
        public String add(@RequestBody AcAddInput aai) throws NoSuchAlgorithmException {
                User usr = new User();
                // すでに該当するユーザ名が登録されている場合はAlreadyを返す
                if (repository.existsByName(aai.getName())) {
                        return "Already";
                }

                // パスワードをハッシュ化
                String passRow = aai.getPass_pow();
                // SHA-256
                MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
                byte[] sha256Result = sha256.digest(passRow.getBytes());
                usr.setUserId(0);
                usr.setName(aai.getName());
                usr.setPass(String.format("%040x", new BigInteger(1, sha256Result)));
                usr.setJouwanTwoLevel(0);
                usr.setJouwanTwoAmt(0);
                usr.setJouwanThLevel(0);
                usr.setJouwanThAmt(0);
                usr.setChestLevel(0);
                usr.setCalfAmt(0);
                usr.setAdsLevel(0);
                usr.setAdsAmt(0);
                usr.setShoulderLevel(0);
                usr.setShoulderAmt(0);
                usr.setBackLevel(0);
                usr.setBackAmt(0);
                usr.setHipLevel(0);
                usr.setHipAmt(0);
                usr.setThighLevel(0);
                usr.setThighAmt(0);
                usr.setCalfLevel(0);
                usr.setCalfAmt(0);

                repository.save(usr);
                return "OK";
        }

        @RequestMapping(value = "api/user/login", method = { RequestMethod.POST })
        public String login(@RequestBody LoginInput lgi) throws NoSuchAlgorithmException {

                // 存在するユーザかどうか確かめる
                if (!repository.existsByName(lgi.getName())) {
                        return "NG";
                }

                User usr = repository.findByName(lgi.getName());

                // パスワードをハッシュ化
                String passRow = lgi.getPass_pow();
                // SHA-256
                MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
                byte[] sha256Result = sha256.digest(passRow.getBytes());
                String hashPassInput = String.format("%040x", new BigInteger(1, sha256Result));

                if (hashPassInput.equals(usr.getPass())) {
                        return "OK";
                } else {
                        return "NG";
                }
        }

        @RequestMapping("api/user/getUserData") // 実装できるかわからなそう？
        public UserDataOut getUserData(@RequestParam("user_id") int userId) {
                User usr = repository.findByUserId(userId);
                UserDataOut udo = new UserDataOut(usr.getuserId(), usr.getName(), usr.getJouwanTwoLevel(),
                                usr.getJouwanThAmt(), usr.getJouwanThLevel(), usr.getJouwanThAmt(), usr.getCalfLevel(),
                                usr.getChestAmt(), usr.getAdsLevel(), usr.getAdsAmt(), usr.getShoulderLevel(),
                                usr.getShoulderAmt(), usr.getBackLevel(), usr.getBackAmt(), usr.getHipLevel(),
                                usr.getHipAmt(), usr.getThighLevel(), usr.getThighAmt(), usr.getCalfLevel(),
                                usr.getCalfAmt());
                return udo;
        }

        @RequestMapping(value = "api/user/updateData", method = { RequestMethod.POST })
        public String updateData(@RequestBody UpdateUsrDataIn uddi) {
                User usrBefore = repository.findByUserId(uddi.getUser_id());
                User usr = new User();

                usr = usrBefore;
                Boolean updateFlag = false;

                switch (uddi.getBui_id()) {
                        case 1:
                                if (usrBefore.getJouwanTwoLevel() < uddi.getNew_level()) {
                                        usr.setJouwanTwoLevel(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setJouwanTwoAmt(uddi.getTotal_amount());
                                break;
                        case 2:
                                if (usrBefore.getJouwanThLevel() < uddi.getNew_level()) {
                                        usr.setJouwanThLevel(uddi.getNew_level());
                                        updateFlag = true;
                                }
                                usr.setJouwanThAmt(uddi.getTotal_amount());
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
