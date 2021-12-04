/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * CommonInfect.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *  (DAB, 12/03/2021, added in id constructor)
 *
 */

// Package name
package entity;

/**
 * The CommonInfect Class extends Zombie and has a base health and attack.
 */
public class CommonInfect extends Zombie {

    // Class constructor passing in health and attack to superclass
    public CommonInfect() {
        super(30, 5);
    }

    // Class constructor passing in health, attack, and id to superclass
    public CommonInfect(int id) {
        super(30, 5, id);
    }
}