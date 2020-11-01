package com.kuznetsovka.myIntegration.dao;

import com.kuznetsovka.myIntegration.domain.Sell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellRepository extends JpaRepository<Sell, Long> {
}
