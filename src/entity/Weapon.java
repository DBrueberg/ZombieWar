/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Weapon.java
 * December 13, 2021
 * Updated(Initials, Date, Changes):
 *
 */

// Package name
package entity;

/**
 Weapon superclass handles a Weapon's damage and accuracy
 */
public class Weapon {
    // Weapon instance variables
    private int dmg;
    private double accuracy;

    // Class constructor initializes dmg and accuracy instance variables
    public Weapon(int dmg, double accuracy){
        this.dmg = dmg;
        this.accuracy = accuracy;
    }

    // Getter method for dmg instance variable
    public int getDamage(){
        return dmg;
    }

    // Getter method for accuracy instance variable
    public double getAccuracy(){
        return accuracy;
    }
}
