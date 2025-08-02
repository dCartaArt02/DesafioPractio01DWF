package com.letrasvivas.bookapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI letrasVivasOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Letras Vivas Book API")
                        .description("API for managing the book catalog of Letras Vivas editorial")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Development Team")
                                .email("dev@letrasvivas.com")));
    }
}