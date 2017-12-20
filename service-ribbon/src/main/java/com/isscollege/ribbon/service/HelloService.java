package com.isscollege.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String updateMobphone(String name, String mobphone) {
        return restTemplate.getForObject("http://service-hi/test/updateMobphone?account=" + name + "&mobphone=" + mobphone, String.class);
    }

    public String updatePassWord(String userAccount,String password){
        return restTemplate.getForObject("http://service-hi/test/updatePassWord?account=" + userAccount + "&password=" + password, String.class);
    }

//    public String hiService(String name) {
//        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
//    }

    public String marketService(String name) {
        return restTemplate.getForObject("http://springboot-market1/hi?name="+name,String.class);
    }
}
