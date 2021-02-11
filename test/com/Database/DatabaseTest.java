package com.Database;

import com.passengers.Passenger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database database;
    Passenger passenger;

    @BeforeEach
    void setUp() {
        database = new Database();
        passenger = new Passenger("Abdullah", "Ismail");
    }

    @AfterEach
    void tearDown() {
        database = null;
    }

    @Test
    void airlineDatabase_canAddPassenger(){
        database.addPassengerToAirLineDataBase(passenger);
        assertEquals(1, database.getDataBaseLength());
    }
}