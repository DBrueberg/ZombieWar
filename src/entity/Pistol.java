/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Pistol.java
 * December 13, 2021
 * Updated(Initials, Date, Changes):
 *
 */

// Package name
package entity;

/**
 Pistol subclass handles initializing the Weapon superclass
 */
public class Pistol extends Weapon{

    // Class constructor calls the superclass constructor
    public Pistol(){
        super(12, 0.7);
    }

    // toString method to output the weapon type
    @Override
    public String toString(){
        return "Pistol";
    }
}