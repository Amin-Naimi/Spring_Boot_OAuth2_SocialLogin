package com.mohamed.oath2Project.teste;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
public class TesteController {

    @GetMapping
    ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello Brother Welcome to mu secure endpoint");
    }
}
