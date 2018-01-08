package com.example.exchange.service.interfaces;

import com.example.exchange.common.dto.Currency;

import java.math.BigDecimal;

public interface CurrencyConverterService {
    BigDecimal convert(BigDecimal value, Currency from, Currency to);
}