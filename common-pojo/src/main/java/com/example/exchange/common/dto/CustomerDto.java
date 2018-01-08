package com.example.exchange.common.dto;

import com.example.exchange.common.model.CustomerModel;

public class CustomerDto extends UserDto implements CustomerModel {
    private Long Cif;

    public Long getCif() {
        return Cif;
    }

    public void setCif(Long cif) {
        Cif = cif;
    }
}