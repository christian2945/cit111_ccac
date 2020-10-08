/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 * Project for cit111 that gauges friendship compatibility with moi
 * @author Christian
 */
public class MightWeBeFriends {
    public static void main(String[] args) {
        // declare variables
        int compScore = 0;
        int answer;
        
        // create scanner object
        Scanner scanner = new Scanner(System.in);
        
        // ask first question
        System.out.println("Do you like video games? (answer 1 for yes or 0 for no)");
        
        // read input
        answer = scanner.nextInt();
        
        // if block for adjusting variable based on response and asking
        // followup question in a nested if
        if(answer == 1){
            compScore = compScore + 10;
            System.out.println("Do you like MMORPGS?");
            answer = scanner.nextInt();
            if(answer == 1){
                compScore = compScore + 10;
            }
        }
        
        // second question
        System.out.println("Would you like to live in a small town instead of the city?");
        answer = scanner.nextInt();
        if(answer == 1){
            compScore = compScore + 10;
        }
        
        // third question
        System.out.println("Do you like dogs more than cats?");
        answer = scanner.nextInt();
        if(answer == 1){
            compScore = compScore + 10;
        }
        
        // fourth question
        System.out.println("Have you ever done volunteer work of any kind?");
        answer = scanner.nextInt();
        if(answer == 1){
            compScore = compScore + 10;
        }
        
        // if/else to compare final score and show result
        if(compScore >= 20){
            System.out.println("Yay! We might be friends! Hit me up!");
        } else {
            System.out.println("We might not be friends :( but who knows, people are complex, and I only asked a few questions.");
        }
        
        
    } // close main
} // close class
