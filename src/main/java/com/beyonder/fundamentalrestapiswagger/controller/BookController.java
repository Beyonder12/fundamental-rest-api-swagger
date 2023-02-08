package com.beyonder.fundamentalrestapiswagger.controller;

import com.beyonder.fundamentalrestapiswagger.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello!";
    }

    @GetMapping("/detail")
    public Map<String, String> getBook(@RequestParam int id, int name) {
        Map<String, String> response = new HashMap<>();
        response.put("code", "200");
        response.put("message", "Horray get a data with id " + id + name);
        response.put("status", "Success");
        response.put("data", id + "");
        return response;
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<BookDTO> getBook(@PathVariable int id)  {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setName("Physics " + id);
        return new ResponseEntity<>(bookDTO, HttpStatus.OK);
    }




}
