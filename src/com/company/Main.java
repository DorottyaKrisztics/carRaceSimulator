package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    //static isRaining //30% chance of rain every hour
    static boolean isRaining() {
        boolean rain=false;
        Random random = new Random();
        double chance = random.nextDouble();
        if (chance <= 0.3) {
            rain = true;
        }
        return rain;
    }


    //createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
    static List<Car> carObjectList = new ArrayList<>();
    static void createVehicles() {

        for (int count = 1; count <= 10; count++) {
            carObjectList.add(new Car());
        }
        System.out.println(carObjectList);
    }


    //simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times
    // and setting whether its raining.
    static void simulateRace() {
        for (int j =0; j < 50; j++) {
            for (int i = 0; i < carObjectList.size(); i++) {
                carObjectList.get(i).moveForAnHour();
            }
        }
    }


    //printRaceResults() // prints each vehicle's name, distance traveled ant type
    void printRaceResults() {}


    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle();
        Motorcycle motorcycle2 = new Motorcycle();

        motorcycle1.moveForAnHour(isRaining());
        motorcycle1.moveForAnHour(true);
        //createVehicles();
        //simulateRace();
    }
}


class Car {

    String carName;

    int normalSpeed;
    int speedMin = 80;
    int speedMax = 110;
    static int speedLimit;

    Car() {

        //normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h
        Random rand = new Random();
        normalSpeed = speedMin + rand.nextInt((speedMax - speedMin));
        System.out.println(normalSpeed);

        createCarName();

    }

    // Since cars are so fast there is a 30% chance that they can go only with 70km/h speed
    //static setSpeedLimit(int limit) // Call this from the Main class!
    static void setSpeedLimit(int limit) {
        speedLimit = limit;
        System.out.println(speedLimit);
    }

    int generateSpeed() {
        Random random = new Random();
        double chance = random.nextDouble();
        if (chance <= 0.3) {

            return speedLimit;
        }
        return normalSpeed;
    }


    //distanceTraveled // holds the current distance traveled
    // moveForAnHour() // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only
    int distanceTraveled = 0;

    void moveForAnHour() {
        int distanceFromSpeed = generateSpeed();
        distanceTraveled += distanceFromSpeed;
        System.out.println(distanceTraveled);
    }


    //name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php
    // and pick 2 randomly for each instance.
    void createCarName() {
        List<String> carNamesList = new ArrayList<String>();
        carNamesList.add("Vigor");
        carNamesList.add("Hollo");
        carNamesList.add("Symbol");
        carNamesList.add("Dynamo");
        carNamesList.add("Orbit");
        carNamesList.add("Icon");
        carNamesList.add("Corsair");
        carNamesList.add("Expedition");
        carNamesList.add("Intro");
        carNamesList.add("Hero");
        System.out.println(carNamesList);

        Random rand = new Random();
        int randomIndex1 = rand.nextInt(10);
        int randomIndex2 = rand.nextInt(10);

        carName = carNamesList.get(randomIndex1) + " " + carNamesList.get(randomIndex2);
        System.out.println(carName);
    }
}


class Truck {
    /*// speed: 100km/h. 5% chance of breaking down for 2 hours.
    // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
    breakdownTurnsLeft // holds how long its still broken down.
    distanceTraveled
    moveForAnHour()*/

    Truck() {

    }
}

