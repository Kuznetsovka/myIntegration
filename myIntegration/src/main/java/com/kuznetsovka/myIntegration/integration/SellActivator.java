package com.kuznetsovka.myIntegration.integration;

import com.kuznetsovka.myIntegration.domain.Order;
import com.kuznetsovka.myIntegration.domain.Sell;
import com.kuznetsovka.myIntegration.service.OrderService;
import com.kuznetsovka.myIntegration.service.SellService;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SellActivator {

    private final SellService sellService;

    public SellActivator(SellService sellService) {
        this.sellService = sellService;
    }

    @ServiceActivator(inputChannel = "sellsChannel")
    public void listenNewsChannel(@Payload Sell payload, @Headers Map<String,Object> headers){
        System.out.println("Get order in message: " + payload);
        sellService.save(payload);
    }
}
