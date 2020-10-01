/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

import java.util.Random;

/**
 *
 * @author Christian
 */
public class Quiz {
    public static void main(String[] args) {
        
        // declare variables
        final int MAX_VALUE = 10;
        int value1;
        int value2;
        int value3;
        int answer;
        String question;
        int enteredAnswer;
        int attempts = 0;
        
        // create scanner and random objects
        Scanner scanner = new Scanner(System.in);
        Random randGenerator = new Random();
        
        // randomize integers in the math question
        value1 = randGenerator.nextInt(MAX_VALUE);
        value2 = randGenerator.nextInt(MAX_VALUE);
        value3 = randGenerator.nextInt(MAX_VALUE);
        
        // calculate question with random numbers
        answer = (value1 + value2) * value3;
        question = "(" + value1 + " + " + value2 + ") * " + value3;
        
        while(attempts < 3){
            // prompt user with question and store entered int in enteredAnswer
            System.out.println("Compute the value of " + question);
            enteredAnswer = scanner.nextInt();
            
            // increment attempts each loop
            attempts = attempts + 1;
            
            // determine if entered answer is correct
            if(enteredAnswer == answer){
                System.out.println("Correct! Nice work");
                break;
            } else if(attempts == 3) {
                System.out.println("Sorry, Incorrect");
                System.out.println("Solution: (" + value1 + " + " + value2 + ") * " + value3
                 + " = " + (value1 + value2) + " * " + value3 + " = " + answer);
            } else {
                System.out.println("Sorry, Incorrect");
                if(enteredAnswer > answer){
                    System.out.println("(Your answer is too high)");
                } else {
                    System.out.println("(Your answer is too low)");
                }
                System.out.println("****");
            }  // close if/else chain
            
        } // close while
        
    } // close main
} // close class
