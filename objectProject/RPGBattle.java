/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectProject;

import java.util.Scanner;

/**
 * Simulates an RPG battle with 3 different difficulty settings
 * @author Christian
 */
public class RPGBattle {
    public static void main(String[] args) {

        // create objects
        Scanner s = new Scanner(System.in);
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        
        // prompt user to enter name
        System.out.println("Enter thy hero's name");
        hero.name = s.next();
        
        // sets the rest of hero's member variables besides potions which is
        // set when difficulty is chosen
        hero.maxHP = 100;
        hero.maxMP = 50;
        hero.currentHP = 100;
        hero.currentMP = 50;
        
        // prompt user to choose a difficulty, which determines object variables
        System.out.println("Choose a difficulty");
        System.out.println("1 - Easy");
        System.out.println("2 - Normal");
        System.out.println("3 - Hard");
        int userSelection = 0;
        while(userSelection <= 0 || userSelection > 3){
            userSelection = s.nextInt();
            switch(userSelection){
                case 1:
                    enemy.name = "Slime";
                    enemy.currentHP = 150;
                    enemy.strength = 20;
                    enemy.attackLine[0] = "The Slime wiggles around helplessly.";
                    enemy.attackLine[1] = "The Slime decides to attack!";
                    enemy.attackLine[2] = "The Slime jumps headfirst!";
                    hero.numPotions = 2;
                    break;
                case 2:
                    enemy.name = "Skeleton";
                    enemy.currentHP = 250;
                    enemy.strength = 40;
                    enemy.attackLine[0] = "The Skeleton slashes with its sword!";
                    enemy.attackLine[1] = "The Skeleton threw one of it's bones like a boomerang!";
                    enemy.attackLine[2] = "The Skeleton attacks rapidly with it's sword!";
                    hero.numPotions = 3;
                    break;
                case 3:
                    enemy.name = "Dragon";
                    enemy.currentHP = 500;
                    enemy.strength = 50;
                    enemy.attackLine[0] = "The Dragon attacks with it's claws!";
                    enemy.attackLine[1] = "The Dragon swipes with it's tail!";
                    enemy.attackLine[2] = "The Dragon breathes fire!";
                    hero.numPotions = 4;
                    break;
                default:
                    System.out.println("Enter 1, 2, or 3 to select a difficulty");
            } // close switch
        } // close while
        
        System.out.println("A wild " + enemy.name + " appears!");
        
        // while loop for each battle turn
        turnloop:
        while(hero.currentHP > 0 && enemy.currentHP > 0){
            hero.guarding = false;
            System.out.println(hero.name + "'s turn.");
            System.out.println("HP: " + hero.currentHP + "/" + hero.maxHP);
            System.out.println("MP: " + hero.currentMP + "/" + hero.maxMP);
            System.out.println("1 - Attack");
            System.out.println("2 - Guard");
            System.out.println("3 - Heal (costs 10 MP)");
            System.out.println("4 - Use Potion (x" + hero.numPotions + " left)");
            userSelection = 0;
            while(userSelection <= 0 || userSelection > 4){
                userSelection = s.nextInt();
                switch(userSelection){
                    case 1:
                        System.out.println(hero.name + " attacks the " + enemy.name + " for " + enemy.heroAttacks() + " damage.");
                        break;
                    case 2:
                        hero.guarding = true;
                        System.out.println(hero.name + " guards.");
                        break;
                    case 3:
                        if(hero.currentMP >= 10){
                            System.out.println(hero.name + " heals for " + hero.heal() + " HP.");
                        } else {
                            System.out.println(hero.name + " trys to heal but there isn't enough MP!");
                        }
                        break;
                    case 4:
                        if(hero.numPotions > 0){
                            hero.usePotion();
                            System.out.println(hero.name + " uses a potion and returns to full status.");
                        } else {
                            System.out.println(hero.name + " trys to use a potion but there are none left!");
                        }
                        break;
                    default:
                        System.out.println("Enter 1, 2, 3, or 4 to select an action");
                } // close switch
            } // close while
            
            // breaks loop before enemy turn if their hp is 0 or less 
            if(enemy.currentHP <= 0){
                break turnloop;
            }
            
            // runs enemy attack method and calculates damage to hero
            int attackAmount = enemy.attack();
            if(hero.guarding){
                attackAmount = attackAmount / 2;
            }
            hero.currentHP = hero.currentHP - attackAmount;
            System.out.println(hero.name + " takes " + attackAmount + " damage.");
            
            
        } // close while
        
        if(enemy.currentHP <= 0){
            System.out.println("You have slain the " + enemy.name + "! Congratulations, you are winner!!!");
        } else {
            System.out.println("You have been slain by the " + enemy.name + " and your quest ends here.");
        }
        
        System.out.println("THE END");
        
    } // close main
} // close class
