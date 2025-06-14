package com.example.rotterdam;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private static final ZoneId ROTTERDAM_ZONE = ZoneId.of("Europe/Amsterdam");
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

    @GetMapping("/")
    public String time() {
        ZonedDateTime now = ZonedDateTime.now(ROTTERDAM_ZONE);
        return "Current date and time in Rotterdam: " + now.format(FORMATTER);
    }
}
