package io.jaconi.nativevalidatedcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Validated
public interface ValidatedInterface {

    @GetMapping("/interface")
    default ResponseEntity<String> get() {
        return ResponseEntity.ok("Validated Interface");
    }
}
