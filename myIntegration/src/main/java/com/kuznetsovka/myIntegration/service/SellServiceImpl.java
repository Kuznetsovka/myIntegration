package com.kuznetsovka.myIntegration.service;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.kuznetsovka.myIntegration.domain.Order;
import com.kuznetsovka.myIntegration.domain.Sell;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class SellServiceImpl implements SellService{
    @Override
    public void save(Sell sell) {
        File orderFolder = new File("C:\\temp\\gb_orders");

        File orderFile = new File(orderFolder, sell.getOrderId() + "_sell.json");
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(orderFile, sell);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
