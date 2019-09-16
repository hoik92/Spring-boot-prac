package com.prac;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5500")
                .allowedOrigins("http://localhost:8080")
                .allowedOrigins("http://127.0.0.1:5500")
                .allowedOrigins("http://127.0.0.1:8080");
    }
}
