package io.jaconi.nativevalidatedcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Validated
@Controller
public class ValidatedController {

    @GetMapping("/class")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Validated Class");
    }
}
