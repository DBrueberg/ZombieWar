/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Teacher.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *  (DAB, 12/03/2021, added in id constructor)
 *
 */

// Package name
package entity;

/**
 * The Teacher Class extends Survivor and has a base health and attack.
 */
public class Teacher extends Survivor {

    // Class constructor passing in health and attack to superclass
    public Teacher() {
        super(50, 5);
    }

    // Class constructor passing in health, attack, and id to superclass
    public Teacher(int id) {
        super(50, 5, id);
    }

    // Class constructor passing in health, attack, and weapon to superclass
    public Teacher(Weapon weapon) {
        super(50, 5, weapon);
    }

    // Class constructor passing in health, attack, id, and weapon to superclass
    public Teacher(int id, Weapon weapon) {
        super(50, 5, id, weapon);
    }
}