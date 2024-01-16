package de.jkueck.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/continents")
@RequiredArgsConstructor
public class ContinentController {

    @PostMapping
    public ResponseEntity<?> create() {

        return ResponseEntity.status(HttpStatus.CREATED).body("v1.0.1 " + LocalDateTime.now().toString());
    }

}
