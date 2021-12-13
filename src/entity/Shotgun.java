/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Shotgun.java
 * December 13, 2021
 * Updated(Initials, Date, Changes):
 *
 */

// Package name
package entity;

/**
 Shotgun subclass handles initializing the Weapon superclass
 */
public class Shotgun extends Weapon{

    // Class constructor calls the superclass constructor
    public Shotgun(){
        super(18, 0.1);
    }
}
