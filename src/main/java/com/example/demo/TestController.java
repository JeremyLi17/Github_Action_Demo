package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jeremy on 2023/5/13
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>("Hello world!", HttpStatus.OK);
    }
}
