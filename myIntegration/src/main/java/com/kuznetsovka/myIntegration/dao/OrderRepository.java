package com.kuznetsovka.myIntegration.dao;


import com.kuznetsovka.myIntegration.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
