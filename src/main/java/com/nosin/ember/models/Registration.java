package com.nosin.ember.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class
Registration {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, message = "First name must not be empty")
    private String firstName;

    @NotNull
    @Size(min=1, message = "Last name must not be empty")
    private String lastName;

    @NotNull
    @Size(min=1, message = "Burner name must not be empty")
    private String burnerName;

    @NotNull
    @Size(min=1, message = "Email must not be empty")
    private String email;

    private String address1;
    private String address2;

    @NotNull
    @Size(min=1, message = "City must not be empty")
    private String city;

    @NotNull
    @Size(min=2, message = "State must not be empty")
    private String state;

    private String zip;

    private String country;

    @ManyToOne
    private Themecamp themecamp;

    @ManyToOne
    private Placement placement;

    public Registration() { }

    public Registration(String firstName, String lastName, String burnerName, String email, String address1,
                        String address2, String city, String state, String zip, String country, Themecamp themecamp, Placement placement) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.burnerName = burnerName;
        this.email = email;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.themecamp = themecamp;
        this.placement = placement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBurnerName() {
        return burnerName;
    }

    public void setBurnerName(String burnerName) {
        this.burnerName = burnerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Themecamp getThemecamp() {
        return themecamp;
    }

    public void setThemecamp(Themecamp themecamp) {
        this.themecamp = themecamp;
    }

    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }
}
