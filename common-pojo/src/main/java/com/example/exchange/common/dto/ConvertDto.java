package com.example.exchange.common.dto;


import com.example.exchange.common.dto.Currency;

import java.math.BigDecimal;

public class ConvertDto {
    private BigDecimal value;
    private Currency currency;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
