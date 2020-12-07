/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectProject;

import java.util.Random;

/**
 * Hero object for RPG battle
 * can use a magic spell to heal which costs MP or use a potion to heal which
 * fully restores HP and MP
 * @author Christian
 */
public class Hero {
    int maxHP;
    int maxMP;
    int currentHP;
    int currentMP;
    int numPotions;
    boolean guarding;
    String name;
    
    Random r = new Random();
    
    // uses a random number generator to generate an amount between 60 and 80
    // and add to currentHP
    // returns the heal amount as an int
    public int heal(){
        int variation = r.nextInt(20);
        int healAmount = 60 + variation;
        currentHP = currentHP + healAmount;
        if(currentHP > maxHP){
            currentHP = maxHP;
        }
        currentMP = currentMP - 10;
        return healAmount;
    } // close method
    
    // sets current hp and mp to max and reduces available potions by 1
    public void usePotion(){
        currentHP = maxHP;
        currentMP = maxMP;
        numPotions = numPotions - 1;
    } // close method
    
} // close class
