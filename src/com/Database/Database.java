package com.Database;

import com.passengers.Passenger;

import java.util.ArrayList;

public class Database {
    private ArrayList<Passenger> passengers;

    public Database() {
        passengers = new ArrayList<>();
    }

    public Passenger addPassengerToAirLineDataBase(Passenger newPassenger) {
       Passenger passenger = findPassenger(newPassenger.getId());
       if(passenger == null){
           passengers.add(passenger);
       }
       return passenger;
    }

    public int getDataBaseLength() {
        return passengers.size();
    }

    public Passenger findPassenger(int passengerId){
        for(Passenger passenger : passengers){
            if(passenger.getId() == passengerId)
                return passenger;
        }
        return null;
    }
}
