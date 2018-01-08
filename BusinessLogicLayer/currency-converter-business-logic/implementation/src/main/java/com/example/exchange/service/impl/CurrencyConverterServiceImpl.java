package com.example.exchange.service.impl;

import com.example.exchange.common.dto.Currency;
import com.example.exchange.service.interfaces.CurrencyConverterService;
import com.example.exchange.service.interfaces.ExchangeRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(value = "currencyConverterService")
public class CurrencyConverterServiceImpl implements CurrencyConverterService {
    @Autowired
    private ExchangeRatesService exchangeRatesService;

    @Override
    public BigDecimal convert(BigDecimal value, Currency from, Currency to) {
        final BigDecimal rate = exchangeRatesService.getRate(from, to);
        return rate != null ? value.multiply(rate).setScale(2, BigDecimal.ROUND_HALF_UP) : null;
    }
}