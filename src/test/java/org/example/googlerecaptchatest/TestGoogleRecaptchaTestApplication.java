package org.example.googlerecaptchatest;

import org.springframework.boot.SpringApplication;

public class TestGoogleRecaptchaTestApplication {

    public static void main(String[] args) {
        SpringApplication.from(GoogleRecaptchaTestApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
