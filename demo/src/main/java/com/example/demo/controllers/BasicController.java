package com.example.demo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.TimeZone;


@RestController
public class BasicController {

    @GetMapping("/")
    public ResponseEntity<?> mainPage(TimeZone timeZone, HttpServletRequest request){
        // pobranie adresu IP z przeslanego zadania HTTP
        String clientIp = request.getRemoteAddr();
        // pobranie strefy czasowej, oraz uzyskanie obecnego czasu w niej
        ZonedDateTime clientLocalTime = ZonedDateTime.now(timeZone.toZoneId());
        // wyświetlenie adresu IP oraz czasu w strefie czasowej
        String res = "Client ip: " + clientIp + " client local time: " + clientLocalTime.toString();
        return new ResponseEntity<>(res, HttpStatus.OK);    
    }
}
