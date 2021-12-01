/* Group 1 - Original author Casey Flier
 * CSC 422 Assignment 5 Part 2
 * Match.java
 * November 29, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 11/30/2021, Fixed error in getZombie)
 *  (DAB, 11/30/2021, Added some additional comments
 *  to the Class variables, start() algo, Match Class
 *  main comment)
 *  (DAB, 11/30/2021, Altered the start() algorithm)
 *
 *
 */

//Package name
package entity;

//Import ArrayList

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The Match Class will run a Match in which Zom
 */
public class Match {
    // Initializing the needed class variables
    private final ArrayList<Character> survivorList;
    private final ArrayList<Character> zombieList;
    // This class variable keeps track of what Character attacks
    private int currentTurn = 0;

    /**
     * This Match constructor will create a Match object with a new List of
     * Survivor and Zombie Character objects.
     *
     * @param survivorList - List of Survivor objects.
     * @param zombieList   - List of Zombie objects.
     */
    public Match(ArrayList<Character> survivorList, ArrayList<Character> zombieList) {
        // The input data is cloned to keep data integrity within the class
        this.survivorList = (ArrayList<Character>) survivorList.clone();
        this.zombieList = (ArrayList<Character>) zombieList.clone();
    }

    /**
     * The xAttackAllY will have every x attack every y in the List.
     *
     * @param x Character that is attacking this round.
     * @param y Character that is defending this round.
     */
    private void xAttackAllY(ArrayList<Character> x, ArrayList<Character> y) {
        // Using a forEach loop to traverse through each x/attacker one at a time
        x.forEach(attacker -> {
            // Using an Iterator to travers the y/defender List. Iterator is used
            // to remove a defender in the event that they die
            Iterator<Character> defender = y.iterator();

            // While there is a defender in the List to traverse
            while (defender.hasNext()) {
                // The next defender is assigned to the currentDefender
                Character currentDefender = defender.next();
                // The attacker attacks the currentDefender
                attacker.attack(currentDefender);

                // DEBUG: BATTLE PRINTOUT **************************************************
//                System.out.println(attacker.getClass().getSimpleName() + " attacks " +
//                        currentDefender.getClass().getSimpleName());
//                System.out.println(currentDefender.getClass().getSimpleName() +
//                " has " + currentDefender.getHealth());
//                System.out.println();

                // If the currentDefender dies, they are removed from the List
                if (!currentDefender.isAlive()) {
                    defender.remove();
                }
            }
        });
    }

    /**
     * Start the Match will first have all Survivors attack every Zombie,
     * then all Zombies attack every Survivor. If a Character dies in the
     * attack, it is removed from the corresponding Character List. If
     * either all Survivor or Zombie objects are dead, then the Match is
     * over.
     */
    public void start() {
        // This while loop will continue until either all Survivor or Zombie
        // objects are dead in their Lists
        while (this.getSurvivorCount() > 0 && this.getZombieCount() > 0) {

            // If it is the Survivor objects turn to attack each Survivor
            // attacks every Zombie
            if (this.isSurvivorsTurn()) {
                // Each Survivor will attack every Zombie
                xAttackAllY(survivorList, zombieList);
                // If it is the Zombie objects turn to attack each Zombie
                // attacks every Survivor
            } else {
                // Each Zombie will attack every Survivor
                xAttackAllY(zombieList, survivorList);
            }

            // The turn counter is incremented by 1
            this.currentTurn++;
        }
    }

    /**
     * The isSurvivorsTurn returns true if it is the
     * Survivor objects turn to attack.
     *
     * @return Whether it is the survivors' turn
     */
    private boolean isSurvivorsTurn() {
        return (this.currentTurn % 2 == 0);
    }

    /**
     * The getSurvivorCount() method returns the number of Survivor
     * objects in the Survivor List.
     *
     * @return The number of survivors left
     */
    private int getSurvivorCount() {
        return this.survivorList.size();
    }

    /**
     * The getZombieCount() method returns the number of Zombie
     * objects in the Zombie List.
     *
     * @return The number of zombies left
     */
    private int getZombieCount() {
        return this.zombieList.size();
    }

    /**
     * Accessor for survivorList
     *
     * @return value of survivorList
     */
    public ArrayList<Character> getSurvivorList() {
        return (ArrayList<Character>) this.survivorList.clone();
    }

    /**
     * Accessor for zombieList
     *
     * @return value of zombieList
     */
    public ArrayList<Character> getZombieList() {
        return (ArrayList<Character>) this.zombieList.clone();
    }
}