package com.kuznetsovka.myIntegration.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "sells")
public class Sell {
    private static final String SEQ_NAME = "sell_seq";
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    private Long id;
    Date date;
    Long orderId;
    String username;
    String productTitle;
    Long amount;
    BigDecimal sum;
    @Transient
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
