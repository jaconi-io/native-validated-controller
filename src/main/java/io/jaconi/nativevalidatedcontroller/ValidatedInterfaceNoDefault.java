package io.jaconi.nativevalidatedcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ValidatedInterfaceNoDefault {

    ResponseEntity<String> get();
}
