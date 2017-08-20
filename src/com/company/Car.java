package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Car {

    String carName;

    int normalSpeed;
    int speedMin = 80;
    int speedMax = 110;
    static int speedLimit;

    Car() {

        //normalSpeed: the normal speed of the car. Set to a random number in the constructor between 80-110km/h
        Random rand = new Random();
        normalSpeed = speedMin + rand.nextInt((speedMax - speedMin));

        createCarName();
    }


    //there is a 30% chance that they can go only with 70km/h speed
    //static setSpeedLimit(int limit): Call this from the Main class!

    static void setSpeedLimit(int limit) {
        speedLimit = limit;
    }

    int generateSpeed() {
        Random random = new Random();
        double chance = random.nextDouble();
        if (chance <= 0.3) {

            return speedLimit;
        }
        return normalSpeed;
    }


    //distanceTraveled: holds the current distance traveled
    // moveForAnHour(): The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only
    int distanceTraveled = 0;

    void moveForAnHour() {
        int distanceFromSpeed = generateSpeed();
        distanceTraveled += distanceFromSpeed;
    }


    //name: Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php
    //and pick 2 randomly for each instance
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

        Random rand = new Random();
        int randomIndex1 = rand.nextInt(10);
        int randomIndex2 = rand.nextInt(10);

        carName = carNamesList.get(randomIndex1) + " " + carNamesList.get(randomIndex2);
    }

    String getCarName() {
        return carName;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }
}
