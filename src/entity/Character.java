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
    private int id;
    private static int soldierCount = 0;
    private static int teacherCount = 0;
    private static int childCount = 0;
    private static int commonCount = 0;
    private static int tankCount = 0;


    // Class constructor receives health and attack from subclasses and initializes
    // the instance variables
    public Character(int health, int attack) {
        this.health = health;
        this.attack = attack;
        setId();
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

    // Sets the id using the current count of specific subclass objects created
    public void setId(){
        if(this instanceof Soldier){
            this.id = soldierCount++;
        }
        else if(this instanceof Teacher){
            this.id = teacherCount++;
        }
        else if(this instanceof Child){
            this.id = childCount++;
        }
        else if(this instanceof CommonInfect){
            this.id = commonCount++;
        }
        else if(this instanceof Tank){
            this.id = tankCount++;
        }
    }

    // Getter method for returning id
    public int getId(){
        return id;
    }

    // Resets the id's after each match
    public static void resetId(){
        soldierCount = 0;
        teacherCount = 0;
        childCount = 0;
        commonCount = 0;
        tankCount = 0;
    }
}