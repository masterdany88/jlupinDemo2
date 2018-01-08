package com.example.exchange.common.entity;

import com.example.exchange.common.model.CustomerModel;

import javax.persistence.Entity;

@Entity(name = "common__customer")
public class CustomerEntity extends UserEntity implements CustomerModel {
    private Long Cif;

    public Long getCif() {
        return Cif;
    }

    public void setCif(Long cif) {
        Cif = cif;
    }
}
