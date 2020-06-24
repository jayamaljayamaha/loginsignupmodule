package POS.Backend.LoginSignupModule;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LoginSignupModule{

    public static void main(String[] args) {
        SpringApplication.run(LoginSignupModule.class, args);
    }
}