package pl.lo1workshop.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi {

    @GetMapping
    String welcomeAll() {
        return "Witajcie w LO";
    }
}
