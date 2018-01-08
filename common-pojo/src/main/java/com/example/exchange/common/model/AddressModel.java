package com.example.exchange.common.model;

public interface AddressModel {
    Long getId();
    void setId(Long id);
    String getStreet();
    void setStreet(String street);
    String getHouseNumber();
    void setHouseNumber(String houseNumber);
    String getFlatNumber();
    void setFlatNumber(String flatNumber);
    String getCity();
    void setCity(String city);
    String getZipCode();
    void setZipCode(String zipCode);

}
