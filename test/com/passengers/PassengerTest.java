package com.passengers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
        Passenger newPassenger;
        SecureRandom random;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
@Test
    void testThat_PassengerHasAFirstName(){
        newPassenger = new Passenger("Ola", "Tokunbo");
        String firstName =  newPassenger.getFirstName();
        assertEquals("Ola", firstName);
}
    @Test
    void testThat_PassengersFirstNameCanBeUpdated(){
        newPassenger = new Passenger("Ola", "Tokunbo");
        newPassenger.setFirstName("Shola");
        assertEquals("Shola", newPassenger.getFirstName());
    }

    @Test
    void testThat_PassengerHasALastName(){
        newPassenger = new Passenger("Ola", "Tokunbo");
        String lastName =  newPassenger.getLastName();
        assertEquals("Tokunbo", lastName);
    }
    @Test
    void testThat_PassengersLastNameCanBeUpdated(){
        newPassenger = new Passenger("Ola","Tokunbo");
        newPassenger.setLastName("Williams");
        assertEquals("Williams", newPassenger.getLastName());
    }
    @Test
    void testThat_PassengerHasAPassengerId(){
        random = new SecureRandom();
        newPassenger = new Passenger("Ola","Tokunbo");
        int id = newPassenger.generateId();
        assertNotEquals(0,id);
        assertNotNull(id);

    }
}