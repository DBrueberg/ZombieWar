/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Child.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *
 */

// Package name
package entity;

/**
 * The Child Class extends Survivor and has a base health and attack.
 */
public class Child extends Survivor {

    // Class constructor passing in health and attack to superclass
    public Child() {
        super(20, 2);
    }
}