package com.example.exchange.common.entity;

import com.example.exchange.common.model.AddressModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="common__Address")
public class AddressEntity implements AddressModel{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private String houseNumber;
    private String flatNumber;
    private String city;
    private String zipCode;

    @Override public Long getId() {
        return id;
    }
    @Override public void setId(Long id) {
        this.id = id;
    }
    @Override public String getStreet() {
        return street;
    }
    @Override public void setStreet(String street) {
        this.street = street;
    }
    @Override public String getHouseNumber() {
        return houseNumber;
    }
    @Override public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    @Override public String getFlatNumber() {
        return flatNumber;
    }
    @Override public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
    @Override public String getCity() {
        return city;
    }
    @Override public void setCity(String city) {
        this.city = city;
    }
    @Override public String getZipCode() {
        return zipCode;
    }
    @Override public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
