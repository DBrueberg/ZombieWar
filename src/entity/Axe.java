/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Axe.java
 * December 13, 2021
 * Updated(Initials, Date, Changes):
 *
 */

// Package name
package entity;

/**
 Axe subclass handles initializing the Weapon superclass
 */
public class Axe extends Weapon{

    // Class constructor calls the superclass constructor
    public Axe(){
        super(10, 0.85);
    }

    // toString method to output the weapon type
    @Override
    public String toString(){
        return "Axe";
    }
}
