package com.thoughtworks.capability.gtb.alice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://bob:8081/hello", String.class);
        return response.getBody();
    }
}
