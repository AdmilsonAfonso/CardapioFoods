package com.para.todos;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permite todas as rotas
                .allowedOrigins("*") // Permite todas as origens
                .allowedHeaders("*") // Permite todos os cabeçalhos
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS"); // Permite métodos
    }
}
