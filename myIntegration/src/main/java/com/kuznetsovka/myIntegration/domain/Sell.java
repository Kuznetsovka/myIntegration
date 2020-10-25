package com.kuznetsovka.myIntegration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sell {
    Date date;
    Long orderId;
    String username;
    String productTitle;
    Long amount;
    BigDecimal sum;
    SimpleDateFormat dateFormat = new SimpleDateFormat();

    @Override
    public String toString() {
        return "Sell{" +
                "date=" + dateFormat.format(date) +
                ", orderId=" + orderId +
                ", username='" + username + '\'' +
                ", productTitle='" + productTitle + '\'' +
                ", amount=" + amount +
                ", sum=" + sum +
                '}';
    }
}
