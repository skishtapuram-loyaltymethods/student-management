package net.learning.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("service")
public class HealthController {

    @GetMapping("health")
    public ResponseEntity health() {

        return ResponseEntity.ok("UP");

    }
}
