package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    //static isRaining(): 30% chance of rain every hour
    static boolean isRaining() {
        boolean rain=false;
        Random random = new Random();
        double chance = random.nextDouble();
        if (chance <= 0.3) {
            rain = true;
        }
        return rain;
    }


    //createVehicles(): creates 10 cars, 10 trucks and 10 motorcycles
    static List<Car> carObjectList = new ArrayList<>();
    static List<Motorcycle> motorcycleObjectList = new ArrayList<>();
    static List<Truck> truckObjectList = new ArrayList<>();

    static void createVehicles() {

        for (int count = 1; count <= 10; count++) {

            carObjectList.add(new Car());
            motorcycleObjectList.add(new Motorcycle());
            truckObjectList.add(new Truck());
        }

        for (int i=0; i < carObjectList.size(); i++) {
            carObjectList.get(i).setSpeedLimit(70);
        }
    }


    //simulates the race by calling moveForAnHour() on every vehicle 50 times
    // and setting whether its raining
    static void simulateRace() {
        for (int j =0; j < 50; j++) {
            boolean rainyRace = isRaining();

            for (int i = 0; i < 10; i++) {
                carObjectList.get(i).moveForAnHour();
                motorcycleObjectList.get(i).moveForAnHour(rainyRace);
                truckObjectList.get(i).moveForAnHour();
            }
        }
    }


    //printRaceResults(): prints each vehicle's name, distance traveled and type
    static void printRaceResults() {

        for (int i=0; i< carObjectList.size(); i++) {

            String getCarName = carObjectList.get(i).getCarName();
            int getDistanceTraveled = carObjectList.get(i).getDistanceTraveled();
            System.out.println("Car: " + getCarName + " " + getDistanceTraveled);
        }

        for (int i=0; i< truckObjectList.size(); i++) {

            int getTruckName = truckObjectList.get(i).getTruckName();
            int getDistanceTraveled = truckObjectList.get(i).getDistanceTraveled();
            System.out.println("Truck: " + getTruckName + " " + getDistanceTraveled);
        }

        for (int i=0; i< motorcycleObjectList.size(); i++) {

            String getMotorcycleName = motorcycleObjectList.get(i).getMotorcycleName();
            int getDistanceTraveled = motorcycleObjectList.get(i).getDistanceTraveled();
            System.out.println("Motorcycle: " + getMotorcycleName + " " + getDistanceTraveled);
        }
    }


    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }
}


