/* Group 1 - Original author Nicholas Handberg
 * CSC 422 Assignment 5 Part 2
 * Survivor.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/28/2021, added main class comment)
 *  (DAB, 12/03/2021, added in id constructor)
 *  (DAB, 12/12/2021, added in Weapon variable and
 *  override Character attack() method to include
 *  Weapon damage)
 *
 */

// Package name
package entity;

/**
 * The Survivor Class extends Character and has many friendly subclasses.
 */
public class Survivor extends Character {
    // The weapon variable will allow a Survivor to use a Weapon
    private Weapon weapon;

    // Class constructor passing in health and attack to superclass
    public Survivor(int health, int attack) {
        super(health, attack);
    }

    // Class constructor passing in health, attack, and id to superclass
    public Survivor(int health, int attack, int id) {
        super(health, attack, id);
    }

    // Class constructor passing in health, attack, and weapon
    public Survivor(int health, int attack, Weapon weapon) {
        super(health, attack);
        this.weapon = weapon;
    }

    // Class constructor passing in health, attack, id and weapon
    public Survivor(int health, int attack, int id, Weapon weapon) {
        super(health, attack, id);
        this.weapon = weapon;
    }

    /**
     * Overriding the Character attack() method so that Survivor Class
     * can damage Character objects with Weapon damage based on the
     * Weapon objects damage and accuracy.
     *
     * @param character - Character object that will be attacked.
     */
    @Override
    public void attack(Character character) {
        // If there is no Weapon equipped the super class handles the
        // attack
        if (weapon == null) {
            super.attack(character);
        }
        // Else there is a Weapon equipped so the weapon will inflict max
        // Weapon damage as long as it does not miss
        else {
            // The weapon has hit, the Character takes Weapon damage. If it misses
            // nothing happens
            if (weapon.getAccuracy() >= Math.random()) {
                // Subtracts the passed in character's health by the attack of the Weapon
                int healthAfter = character.getHealth() - weapon.getDamage();

                // Checks the whether healthAfter is max or 0 is max and sets the characters health to that value
                // This is to check for negative health values. If the healthAfter is negative (set health to 0)
                // Otherwise set health to healthAfter
                character.setHealth(Math.max(healthAfter, 0));
            }
        }
    }

    /**
     * Accessor method for weapon.
     *
     * @return - value of weapon.
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Mutator method for weapon.
     *
     * @param - new value for weapon.
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}