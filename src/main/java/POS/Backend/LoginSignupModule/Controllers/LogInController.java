package POS.Backend.LoginSignupModule.Controllers;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJpaRepositories
public class LogInController {

    @GetMapping("/user/login")
    public String login(){
        return "Logged succesfully";
    }

}
