package com.lukes.microservices.currencyexchangeservice.repository;

import com.lukes.microservices.currencyexchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lyaegel on 07/25/2019
 */

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
