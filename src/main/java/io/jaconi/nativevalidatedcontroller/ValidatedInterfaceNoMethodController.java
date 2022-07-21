package io.jaconi.nativevalidatedcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValidatedInterfaceNoMethodController implements ValidatedInterfaceNoMethod {
    @GetMapping("/nomethod")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Validated Interface No Interface Method");
    }
}
