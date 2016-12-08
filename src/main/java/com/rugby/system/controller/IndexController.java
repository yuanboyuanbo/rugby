package com.rugby.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Yuanbo on 2016/12/7.
 * 首页
 */
@RestController
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/index")
    public void list(HttpServletResponse response){
        try {
            response.sendRedirect("/page/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
