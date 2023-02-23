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
    public String login(@RequestParam("user_id") int userId){
      
            return "YES";
    }

    @RequestMapping("api/user/add")
    public String add(@RequestParam("user_id") int userId){
      
            return "YES";
    }

    @RequestMapping("api/user/getLevel")//実装できるかわからなそう？
    public int getuserlevel(@RequestParam("user_id") int userId){
      
            return 1;
    }
}
