package com.healthme.controller;

import com.healthme.log.SystemLog;
import com.healthme.service.UserService;
import com.healthme.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private UserService userService;

    @SystemLog(event = "测试controller")
    @ResponseBody
    @RequestMapping(value = "/test")
    public String test(String parm){
        String str = "--------------------------------------------lllllllllllllllllllllllllllllllllllllllllllllllllllll-----" +
                "--dtrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr--------";
        try {
            RedisUtil.setString("test-f", "fffffffffffffffffffffffffffffffffff");

            str = userService.TestLock();

        }catch (Exception e){
            e.printStackTrace();
        }
        return str;
    }
}
