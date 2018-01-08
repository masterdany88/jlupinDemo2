package com.example.exchange.common.dto;

import com.example.exchange.common.model.UserModel;

public class UserDto implements UserModel {

    private Long id;
    private String login;

    @Override
    public Long getId() {
        return id;
    }
    @Override
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String getLogin() {
        return login;
    }
    @Override
    public void setLogin(String login) {
        this.login = login;
    }
}
