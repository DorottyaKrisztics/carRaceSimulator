package com.company;

import java.util.Random;


public class Motorcycle {

    Motorcycle(){
        setSlowerSpeed(false);
        createMotorcycleName();
    }

    // speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
    int motorcycleSpeed = 100;
    int motorSpeedMin = 5;

    int motorSpeedMax = 50;

    void setSlowerSpeed(boolean rainyWeather) {

        Random rand = new Random();
        int randomSpeed = motorSpeedMin + rand.nextInt((motorSpeedMax - motorSpeedMin));

        if (rainyWeather == true) {
            motorcycleSpeed -= randomSpeed;
        } else {
            motorcycleSpeed = 100;
        }
        //System.out.println(motorcycleSpeed);
        System.out.println(rainyWeather);
    }


    //static nameNumber: The number of the instance created. Used for its name
    //name: are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique
    static int nameNumber = 1;

    String motorcycleName;

    void createMotorcycleName() {

        motorcycleName = "Motorcycle " + nameNumber;
        nameNumber++;
        System.out.println(motorcycleName);
    }


    //distanceTraveled, moveForAnHour()

    int distanceTraveled = 0;

    void moveForAnHour(boolean rainyWeather) {
        setSlowerSpeed(rainyWeather);

        int distanceFromSpeed = motorcycleSpeed;
        distanceTraveled += distanceFromSpeed;
        System.out.println(distanceTraveled);
    }

}

