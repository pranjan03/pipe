package com.jenkins.docker.pipe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/")

    public Map<String, Object> getValues() {
        Map<String, Object> data  = new HashMap<>();
        data.put("Name", "Prashant Ranjan");
        data.put("message", "Java API is Working");
        data.put("languages", Arrays.asList("Java", "C++", "JavaScript", "TypeScript"));
        data.put("email", "prashant.ranjan@nagarro.com");
        return data;
    }
}
