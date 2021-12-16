/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * AssaultRifle.java
 * December 13, 2021
 * Updated(Initials, Date, Changes):
 *
 */

// Package name
package entity;

/**
 AssaultRifle subclass handles initializing the Weapon superclass
 */
public class AssaultRifle extends Weapon{

    // Class constructor calls the superclass constructor
    public AssaultRifle(){
        super(14, 0.95);
    }

    // toString method to output the weapon type
    @Override
    public String toString(){
        return "Assault Rifle";
    }
}
