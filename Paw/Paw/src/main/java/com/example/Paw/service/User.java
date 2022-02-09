package com.example.Paw.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    private @GeneratedValue @Id Long id;
    private String firstName;
    private String lastName;
    private int amtOfDogs;
    private String description;

    public User(String firstName, String lastName, int amtOfDogs, String description){
        this.firstName = firstName;
        this.lastName = lastName;
        this.amtOfDogs = amtOfDogs;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getAmtOfDogs() {
        return amtOfDogs;
    }

    public void setAmtOfDogs(int amtOfDogs) {
        this.amtOfDogs = amtOfDogs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
