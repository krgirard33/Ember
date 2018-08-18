package com.nosin.ember.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull(message = "Please enter your user name")
    @Size(min= 5, max= 15, message = "Must be between 5-15 characters")
    private String username;

    @NotNull(message = "Please enter your password.")
    private String password;

    public User() { }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
