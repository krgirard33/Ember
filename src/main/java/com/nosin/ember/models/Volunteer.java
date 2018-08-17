package com.nosin.ember.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Volunteer {

    @Id
    @GeneratedValue
    private int id;

    public Volunteer() {}
}
