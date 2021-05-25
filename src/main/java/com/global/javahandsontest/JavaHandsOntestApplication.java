package com.global.javahandsontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JavaHandsOntestApplication {

//    @Bean
//    public RestTemplate getRestTemplate(){
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(JavaHandsOntestApplication.class, args);
    }

}
