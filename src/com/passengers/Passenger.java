package com.passengers;

import java.security.SecureRandom;

public class Passenger {
    private String firstName;
    private String lastName;
SecureRandom random = new SecureRandom();
    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int generateId() {
        final int STARTING_POINT = 1;
        return  STARTING_POINT +  random.nextInt(50);
    }
}
