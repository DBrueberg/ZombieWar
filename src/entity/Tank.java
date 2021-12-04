/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Tank.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *  (DAB, 12/03/2021, added in id constructor)
 *
 */

// Package name
package entity;

/**
 * The Tank Class extends Zombie and has a base health and attack.
 */
public class Tank extends Zombie {

    // Class constructor passing in health and attack to superclass
    public Tank() {
        super(150, 20);
    }

    // Class constructor passing in health, attack, and id to superclass
    public Tank(int id) {
        super(150, 20, id);
    }
}