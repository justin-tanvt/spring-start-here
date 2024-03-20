package com.example.controller;

import com.example.domain.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country france() {
        return Country.of("France", 67);
    }
}
