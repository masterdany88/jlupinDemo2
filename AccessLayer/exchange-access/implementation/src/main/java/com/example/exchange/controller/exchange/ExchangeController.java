package com.example.exchange.controller.exchange;

import com.example.exchange.common.dto.Currency;
import com.example.exchange.common.dto.ConvertDto;
import com.example.exchange.service.interfaces.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class ExchangeController {
    @Autowired
    CurrencyConverterService currencyConverterService;

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
    @CrossOrigin
    @PostMapping("/exchange/convert")
    public List<ConvertDto> convert(@RequestBody ConvertDto in) {
        List<ConvertDto> result = new LinkedList<ConvertDto>();

        for (final Currency currency : Currency.values()) {
            final ConvertDto out = new ConvertDto();
            out.setCurrency(currency);
            if (currency.equals(in.getCurrency())) {
                out.setValue(in.getValue());
            } else {
                out.setValue(currencyConverterService.convert(in.getValue(), in.getCurrency(), currency));
            }
            result.add(out);
        }
        return result;
    }
}