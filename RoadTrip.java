/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Christian
 */
public class RoadTrip {
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args){
        
        final double NEDS_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;
        
        // declaring and initializing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5;
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double cashOnHand = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; // declaring but not initializing
        
        // simulation of the roadtrip
        System.out.println("***Road trip simulator***");
        // print out initial stats
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance to destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println("Starting trip with " + currentNumberOfPassengers + " Passenger");
        System.out.println("Destination Reached? " + destinationReached);
        System.out.println("***************************************************");
        
        System.out.println();
        System.out.println("Beginning Leg 1: ");
        
        
        // calculate leg distance: 25% of total trip. store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subrtract leg distance from distance to destiantion, over-write distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // "see" hitch hiker heading west
        System.out.println("Oh look! A person who wants to go west too!");
        
        // check if there is room in the car, if so, pick up hitch hiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
            // alt shorter: currentNumberOfPassengers++
        } // close if()
        
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / miles per gallon) * price per gallon
        double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        
        // deduct $ spent on gas from money remaining and over-write tripBudget
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("Cash paid for gas on leg 1: " + gasPriceForLeg);
        
        // reprint status of variables to the console
        System.out.println();
        System.out.println("***Variable stats at end of leg 1***");
        System.out.println("Distance to destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
        System.out.println();
        System.out.println("Beginning leg 2: ");
        
        
        // set legDistance to 500.0
        legDistance = 500.0;
        
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subrtract leg distance from distance to destiantion, over-write distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // find pair of hitchhikers
        System.out.println("Oh, two more westbound travelers!");
        // if statment to simulate picking up hitchhikers
        if (carFull == false){
            System.out.println("Car is not full, picking up hitchers");
            currentNumberOfPassengers = currentNumberOfPassengers + 2;
            
        } // close if()
        
        // calculate gas price for leg and update budget
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("Cash paid for gas on leg 2: " + gasPriceForLeg);
        
        // print stats for leg 2
        System.out.println();
        System.out.println("***Variable stats at end of leg 2***");
        System.out.println("Distance to destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
        System.out.println();
        System.out.println("Beginning leg 3: ");
        
        // set legDistance to remianing distance
        legDistance = distanceToMoabUtah;
        
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subrtract leg distance from distance to destiantion, over-write distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // find pair of hitchhikers
        System.out.println("More hitchers: another pair! Can we fit them?");
        
        // if/else statment to simulate picking up hitchhikers or not
        int numHitchers = 2;
        if (currentNumberOfPassengers + numHitchers <= maxPassengers){
            System.out.println("Car is not full, picking up hitchers");
            currentNumberOfPassengers = currentNumberOfPassengers + 2;
            
        } else {
            System.out.println("Too many folks--can't take ya, sorry!");
        }// close if/else
        
        // calculate gas price for leg and update budget
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("Cash paid for gas on final leg: " + gasPriceForLeg);
        
        // toggle boolean to represent arriving
        destinationReached = true;
        
        // print stats for leg 3
        System.out.println();
        System.out.println("***Variable stats at end of leg 3***");
        System.out.println("Distance to destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);

        
    } // close main
} // close class
