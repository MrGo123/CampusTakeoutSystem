package com.sustart.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName StudentController
 * @Description student service controller
 * @Author Sustart
 * @Date2021/3/17 21:32
 * @Version 1.0
 **/
@RestController
@RequestMapping("student")
public class StudentController {

    // register
    @PostMapping("register")
    public String studentRegister(@RequestParam("phone_number") String phoneNumber, @RequestParam("password") String password){
        return phoneNumber;
    }

    // login
    @PostMapping("login")
    public String studentLogin(@RequestParam("phone_number") String phoneNumber, @RequestParam("password") String password){
        return phoneNumber+password;
    }

    // get the menu by shop
    @PostMapping("menu")
    public String showMenu(){

        return "menu";
    }

}
