package com.vineeth.contentcalender.controller;

import com.vineeth.contentcalender.config.ContentCalenderProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
//        @Value("${cc.welcomeMessage: Default welcome message}")
//    private String welcomeMessage;


    private final ContentCalenderProperties properties;

    public HomeController(ContentCalenderProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalenderProperties home(){
        return properties;
    }
}
