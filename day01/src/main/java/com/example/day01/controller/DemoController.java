package com.example.day01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 沈伟
 * @date 2021/10/22 10:35
 */

@RestController
public class DemoController {


    @RequestMapping("getHw")
    public String getHw(){
        return "helloWord";
    }
}
