package com.isscollege.ribbon.controller;

import com.isscollege.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/updateMobphone")
    public void hi(@RequestParam String name,@RequestParam String mobphone) {
        name = "litiangang";
        String password = "000000";
        mobphone = "123456789";
       String s1 = helloService.updatePassWord(name,password);
       if ("1".equals(s1)){
           helloService.updateMobphone(name,mobphone);
       }

    }

//    @RequestMapping(value = "/hi")
//    public String hi(@RequestParam String name){
//        return helloService.marketService(name);
//    }

    @RequestMapping(value = "/markhi")
    public String markhi(@RequestParam String name){
        return helloService.marketService(name);
    }
}
