package com.example.exchange.service.impl;

import com.example.exchange.common.entity.CustomerEntity;
import com.example.exchange.common.model.CustomerModel;
import com.example.exchange.dao.interfaces.CustomerDao;
import com.example.exchange.service.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;


    @Override
    public CustomerModel save(CustomerEntity customer) {
        return customerDao.save(customer);
    }
}