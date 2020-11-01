package com.kuznetsovka.myIntegration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("classpath:/integration/http-orders-gateway.xml")
public class OrderIntegrationConfig {
}
