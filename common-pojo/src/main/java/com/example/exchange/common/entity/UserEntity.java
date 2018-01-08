package com.example.exchange.common.entity;

import com.example.exchange.common.model.UserModel;

import javax.persistence.*;

@Entity(name = "common__user")
public class UserEntity implements UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
