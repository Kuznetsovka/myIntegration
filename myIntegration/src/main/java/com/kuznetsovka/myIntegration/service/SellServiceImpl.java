package com.kuznetsovka.myIntegration.service;

import com.kuznetsovka.myIntegration.dao.SellRepository;
import com.kuznetsovka.myIntegration.domain.Sell;
import org.springframework.stereotype.Service;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Service
public class SellServiceImpl implements SellService{
    private final SellRepository sellRepository;

    public SellServiceImpl(SellRepository sellRepository) {
        this.sellRepository = sellRepository;
    }

    @Override
    public void save(Sell sell) {
        Sell thisSell = Sell.builder()
                .orderId (sell.getOrderId ())
                .username(sell.getUsername ())
                .amount (sell.getAmount ())
                .productTitle (sell.getProductTitle ())
                .sum (sell.getSum ())
                .build();
        sellRepository.save(sell);
    }
}
