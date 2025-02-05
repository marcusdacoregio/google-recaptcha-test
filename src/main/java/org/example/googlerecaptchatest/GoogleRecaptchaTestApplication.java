package org.example.googlerecaptchatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GoogleRecaptchaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoogleRecaptchaTestApplication.class, args);
    }

    @Controller
    public static class HomeController {

        @GetMapping({"/", ""})
        public String home() {
            return "index";
        }
    }

}
