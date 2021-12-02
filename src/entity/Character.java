/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Character.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *
 */

// Package name
package entity;

/**
 * Character superclass handles a Character's health and attack
 */
public class Character {
    // The private variables associated with the Character Class
    private int health;
    private int attack;


    // Class constructor receives health and attack from subclasses and initializes
    // the instance variables
    public Character(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }


    // Setter method for the health instance variable
    public void setHealth(int health) {
        this.health = health;
    }


    // Getter method for the health instance variable

    public int getHealth() {
        return this.health;
    }


    // Getter method for the attack instance variable
    public int getAttack() {
        return attack;
    }


    // Attack method calculates the passed in characters health after the attack
    // and sets the characters health to the result
    public void attack(Character character) {
        // Subtracts the passed in character's health by the attack of this instance
        int healthAfter = character.getHealth() - this.attack;

        // Checks the whether healthAfter is max or 0 is max and sets the characters health to that value
        // This is to check for negative health values. If the healthAfter is negative (set health to 0)
        // Otherwise set health to healthAfter
        character.setHealth(Math.max(healthAfter, 0));
    }

    // Checks if the player is alive (health not 0) and returns boolean
    public boolean isAlive() {
        return health != 0;
    }
}