package com.nosin.ember.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Placement {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3)
    private String name;

    public Placement() { }

    public Placement(String name) {
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO Link this to Registration, so that each attendee can be tied to a place
}
