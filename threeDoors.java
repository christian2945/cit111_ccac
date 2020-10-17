/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Christian
 */
public class threeDoors {
        
    final static int MAX_NUMBER = 100;
    
    public static void main(String[] args) {
        // declare variables
        int favNumber = MAX_NUMBER;
        int doorChosen;
        
        // create scanner object
        Scanner scanner = new Scanner(System.in);
        
        // prompt user for their favorite number
        System.out.println("What is your favorite one or two digit number?");
        
        // reads input until favNumber is within correct range
        while(favNumber >= MAX_NUMBER || favNumber < 0){
            favNumber = scanner.nextInt();
            if(favNumber >= MAX_NUMBER || favNumber < 0){
                System.out.println("Number must be below 100 and positive");
            }
            
        }
        
        // prompt user which door to pick
        System.out.println("********* ********* *********");
        System.out.println("*  **   * *  * *  * * ***   *");
        System.out.println("*   *   * * *   * * *    *  *");
        System.out.println("*   *   * *     * * * ***** *");
        System.out.println("*   *   * *    *  * *    *  *");
        System.out.println("*  ***  * * ***** * * ***   *");
        System.out.println("********* ********* *********");
        System.out.println("");
        System.out.println("Choose which door to open - 1, 2, or 3:");


        // read input and store in doorChosen
        doorChosen = scanner.nextInt();

        // switch to determine which method to call based on input
        switch(doorChosen){
            case 1:
                door1(favNumber);
                break;
            case 2:
                door2(favNumber);
                break;
            case 3:
                door3(favNumber);
                break;
            default:
                System.out.println("Error, unknown selection, exiting program");
        } // close switch

    } // close method
    
    // compares the users entered favirute number with my own
    public static void door1(int favNumber){
        final int MY_FAV_NUM = 22;
        
        if(favNumber == MY_FAV_NUM){
            System.out.println("Wow, we have the same favorite number, thats cool I guess.");
        } else if(favNumber > MY_FAV_NUM){
            System.out.println("Your favorite number is higher than mine");
        } else {
            System.out.println("Your favorite number is lower than mine");
        }
    } // close method
    
    // generates random numbers until the entered number is generated
    public static void door2(int favNumber){
        // declare variables
        int randomNumber;
        int loops = 0;
        // create random object
        Random r = new Random();
        
        randomNumber = r.nextInt(MAX_NUMBER);
        
        while(randomNumber != favNumber){
            loops = loops + 1;
            randomNumber = r.nextInt(MAX_NUMBER);
            System.out.println(randomNumber);
        } // close while
        
        System.out.println("It took " + loops + " attempts to randomly generate your favorite number");
    } // close method
    
    // cubes the users entered number and displays
    public static void door3(int favNumber){
        System.out.println("Your favorite number cubed is " + favNumber * favNumber * favNumber + "... neat.");
    } // close method
    
} // close class
