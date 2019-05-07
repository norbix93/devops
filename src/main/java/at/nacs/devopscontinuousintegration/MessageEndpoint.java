package at.nacs.devopscontinuousintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageEndpoint {

    @GetMapping
    public String get() {
        return "I am living the dream!";
    }

}
