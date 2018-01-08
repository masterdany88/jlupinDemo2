package com.example.exchange.service.interfaces;


import com.example.exchange.common.entity.CustomerEntity;
import com.example.exchange.common.model.CustomerModel;

public interface CustomerService {
    CustomerModel save(CustomerEntity customer);
}