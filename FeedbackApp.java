package com.example.feedbackapp.model;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication

public class FeedbackApp {
    public static void main(String[] args) {
        SpringApplication.run(FeedbackApp.class, args);
    }



@Bean
public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/api/**")  // Adjust the mapping based on your API endpoints
                    .allowedOrigins("http://localhost:3000")  // Allow requests from your React app
                    .allowedMethods("GET", "POST");  // Specify the allowed HTTP methods
        }
    };
}
}
