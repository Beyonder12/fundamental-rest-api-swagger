package com.beyonder.fundamentalrestapiswagger.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public String sayHello() {
        return "Hello!";
    }

    @GetMapping("/detail")
    public Map<String, String> getBook(@RequestParam int id) {
        Map<String, String> response = new HashMap<>();
        response.put("code", "200");
        response.put("message", "Horray get a data with id" + id);
        response.put("status", "Success");
        response.put("data", id + "");
        return response;
    }

}
