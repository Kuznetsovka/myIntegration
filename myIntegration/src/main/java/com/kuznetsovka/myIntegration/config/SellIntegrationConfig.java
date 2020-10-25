package com.kuznetsovka.myIntegration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.DirectChannel;

@Configuration
@ImportResource("integration/http-sells-gateway.xml")
public class SellIntegrationConfig {

}
