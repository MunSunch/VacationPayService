package com.munsun.vacation_service.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Vacation pay service",
                description = "Service for calculating vacation pay", version = "1.0",
                contact = @Contact(
                        name = "Munir Sunchalyaev",
                        url = "https://t.me/score_msConfig021"
                )
        )
)
public class OpenApiConfig {
}
