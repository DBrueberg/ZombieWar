/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Survivor.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *  (DAB, 12/03/2021, added in id constructor)
 *
 */

// Package name
package entity;

/**
 * The Survivor Class extends Character and has many friendly subclasses.
 */
public class Survivor extends Character {

    // Class constructor passing in health and attack to superclass
    public Survivor(int health, int attack) {
        super(health, attack);
    }

    // Class constructor passing in health, attack, and id to superclass
    public Survivor(int health, int attack, int id) {
        super(health, attack, id);
    }
}