package project.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users/hello")
    public String hello() {
        return "Hello from User Service";
    }
}
