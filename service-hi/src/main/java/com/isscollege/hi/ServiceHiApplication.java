package com.isscollege.hi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ImportResource({ "classpath:bytetcc-supports-springcloud.xml"})
@SpringBootApplication
@EnableEurekaClient
@RestController
@MapperScan(basePackages = "com.isscollege.hi.mapper")
public class ServiceHiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

//    @Value("${server.port}")
//    String port;
//    @RequestMapping("/hi")
//    public String home(@RequestParam String name) {
//        return "hi "+name+",i am from port:" +port;
//    }

}
