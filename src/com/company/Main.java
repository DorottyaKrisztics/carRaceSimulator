package com.company;

public class Main {

    //static isRaining //30% chance of rain every hour
    //createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
    //simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times
    // and setting whether its raining.
    //printRaceResults() // prints each vehicle's name, distance traveled ant type.*/

    public static void main(String[] args) {

    }
}


class Car {

    String carName;


    Car() {

        //normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h
    }

    // Since cars are so fast there is a 30% chance that they can go only with 70km/h speed
    //static setSpeedLimit(int limit) // Call this from the Main class!
    static void setSpeedLimit(int limit) {

    }


    //distanceTraveled // holds the current distance traveled
    // moveForAnHour() // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only
    int distanceTraveled;

    void moveForAnHour() {

    }

    //name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php
    // and pick 2 randomly for each instance.
    void createCarName() {

    }
}


class Motorcycle {
    /*// speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
    static nameNumber // The number of the instance created. Used for its name.
    name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
    distanceTraveled
    moveForAnHour()*/

    Motorcycle(){

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

