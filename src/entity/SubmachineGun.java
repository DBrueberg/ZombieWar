/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * SubmachineGun.java
 * December 13, 2021
 * Updated(Initials, Date, Changes):
 *
 */

// Package name
package entity;

/**
 SubmachineGun subclass handles initializing the Weapon superclass
 */
public class SubmachineGun extends Weapon{

    // Class constructor calls the superclass constructor
    public SubmachineGun(){
        super(16, 0.8);
    }

    // toString method to output the weapon type
    @Override
    public String toString(){
        return "Submachine Gun";
    }
}
