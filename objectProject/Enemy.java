/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectProject;

import java.util.Random;

/**
 * Enemy object for RPG battle
 * Can be attacked by the hero object and can use its own attacks at random
 * @author Christian
 */
public class Enemy {
    int currentHP;
    int strength;
    String[] attackLine = new String[3];
    String name;
    boolean charged = false;
    
    Random r = new Random();
    
    // uses a random number generator to generate an amount between 30 and 40
    // and subtract from currentHP
    // returns the attack amount as an int
    public int heroAttacks(){
        int variation = r.nextInt(10);
        int attackAmount = 30 + variation;
        currentHP = currentHP - attackAmount;
        return attackAmount;
    } // close method
    
    // random number generator chooses from three attacks and returns
    // attack amount
    public int attack(){
        int rng = r.nextInt(7);
        if(charged){
            rng = 5;
        }
        int attackAmount = 0;
        attackSwitch:
        switch(rng){
            case 0:
            case 1:
            case 2:
                System.out.println(attackLine[0]);
                attackAmount = strength - 20;
                break;
            case 3:
            case 4:
                System.out.println(attackLine[1]);
                attackAmount = strength;
                break;
            case 5:
            case 6:
                if(charged){
                    System.out.println(attackLine[2]);
                    attackAmount = strength * 2;
                    charged = false;
                    break attackSwitch;
                } else {
                    charged = true;
                    System.out.println("The " + name + " starts charging a strong attack.");
                }
                
        }
        
        return attackAmount;
    } // close method
    
} // close class
