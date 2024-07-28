package com.ver.resource_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingController {
    @GetMapping("/hello")
    public String helloMessage() {
        return "hello this is resource server";
    }
}
