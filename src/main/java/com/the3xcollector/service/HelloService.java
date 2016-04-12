package com.the3xcollector.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class HelloService {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot with Vaadin!";
    }

}
