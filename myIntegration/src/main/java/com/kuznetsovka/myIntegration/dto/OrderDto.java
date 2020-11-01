package com.kuznetsovka.myIntegration.dto;

import com.kuznetsovka.myIntegration.domain.OrderDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long orderId;
    private String username;
    private String address;
    private List<OrderDetails> details;
}
