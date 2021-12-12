/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Child.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *  (DAB, 12/03/2021, added in id constructor)
 *  (DAB, 12/12/2021, added in id/weapon constructor)
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

    // Class constructor passing in health, attack, and id to superclass
    public Child(int id) {
        super(20, 2, id);
    }

    // Class constructor passing in health, attack, and weapon to superclass
    public Child(Weapon weapon) {
        super(20, 2, weapon);
    }

    // Class constructor passing in health, attack, id, and weapon to superclass
    public Child(int id, Weapon weapon) {
        super(20, 2, id, weapon);
    }
}