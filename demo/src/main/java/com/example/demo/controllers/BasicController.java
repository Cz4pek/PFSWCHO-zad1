package com.example.demo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.TimeZone;

@RestController
public class BasicController {

    @GetMapping("/main")
    public String mainPage(TimeZone timeZone, HttpServletRequest request){
        String clientIp = request.getRemoteAddr();
        ZonedDateTime clientLocalTime = ZonedDateTime.now(timeZone.toZoneId());
        return "Client ip: " + clientIp + " client local time: " + clientLocalTime.toString();
    }
}
