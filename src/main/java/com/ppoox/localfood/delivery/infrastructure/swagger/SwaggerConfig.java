package com.ppoox.localfood.delivery.infrastructure.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI().info(new Info().title("Delivery Service")
                .description("Delivery Service API"));
    }

    @Bean
    public GroupedOpenApi allApi() {
        return GroupedOpenApi.builder().group("All")
                .packagesToScan("com.ppoox.localfood.delivery.adapter.in.presentation").build();
    }

}
