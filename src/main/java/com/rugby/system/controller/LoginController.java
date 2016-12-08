package com.rugby.system.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yuanbo on 2016/12/5.
 */

@RestController
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/login")
    public String startApplication(){
        return "..start....run....";
    }
}

