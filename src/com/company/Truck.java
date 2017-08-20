package com.company;

import java.util.Random;


public class Truck {

    int truckName;
    boolean breakdown;


    Truck() {
        createTruckName();
    }

    //speed: 100km/h. 5% chance of breaking down for 2 hours
    int truckSpeed = 100;

    boolean setBreakingDown() {
        breakdown=false;
        Random random = new Random();
        double chance = random.nextDouble();
        if (chance <= 0.05) {
            breakdown = true;
            breakdownTurnsLeft = 2;
        }
        return breakdown;
    }


    //breakdownTurnsLeft: holds how long its still broken down
    int breakdownTurnsLeft;

    int distanceTraveled = 0;

    void moveForAnHour() {
        int distanceFromSpeed = truckSpeed;
        // the truck will be broken down for 1 or 2 hours long
        if (breakdownTurnsLeft > 0) {
            distanceTraveled += 0;
            breakdownTurnsLeft -= 1;

        } else {
            breakdownTurnsLeft = 0;
            distanceTraveled += distanceFromSpeed;
            setBreakingDown();
        }

        System.out.println("truckname: " + truckName + " " + distanceTraveled);
        System.out.println(breakdownTurnsLeft);
    }

    //They call all their trucks a random number between 0 and 1000
    int truckNameMin = 0;
    int truckNameMax = 1000;

    void createTruckName() {
        Random rand = new Random();
        truckName = truckNameMin + rand.nextInt((truckNameMax - truckNameMin));
        System.out.println("truckname: " + truckName);
    }

    int getTruckName() {
        return truckName;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }
}

