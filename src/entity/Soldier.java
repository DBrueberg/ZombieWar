/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Soldier.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *
 *
 */

// Package name
package entity;

/**
 * The Soldier Class extends Survivor and has a base health and attack.
 */
public class Soldier extends Survivor {

    // Class constructor passing in health and attack to superclass
    public Soldier() {
        super(100, 10);
    }

}