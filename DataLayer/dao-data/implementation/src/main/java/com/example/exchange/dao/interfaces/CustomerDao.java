package com.example.exchange.dao.interfaces;

import com.example.exchange.common.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<CustomerEntity, Long> {
}
