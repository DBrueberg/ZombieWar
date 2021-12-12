/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Soldier.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *  (DAB, 12/03/2021, added in id constructor)
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

    // Class constructor passing in health, attack, and id to superclass
    public Soldier(int id) {
        super(100, 10, id);
    }

    // Class constructor passing in health, attack, and weapon to superclass
    public Soldier(Weapon weapon) {
        super(100, 10, weapon);
    }

    // Class constructor passing in health, attack, id, and weapon to superclass
    public Soldier(int id, Weapon weapon) {
        super(100, 10, id, weapon);
    }
}