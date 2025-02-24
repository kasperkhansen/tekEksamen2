package org.example.tekeksamen2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EksamenController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to TekEksamen";
    }
}
