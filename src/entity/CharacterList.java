/* Group 1 - Original author Devin Brueberg
 * CSC 422 Assignment 5 Part 2
 * CharacterList.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *
 *
 */

// Package name
package entity;

// Importing needed java.util

import java.util.ArrayList;

/**
 * The CharacterList Class will hold two randomly generated
 * Character Lists. One of Zombie type and one of Survivor type.
 */
public class CharacterList {
    // The Class specific final variables that allow for the
    // List amounts to be altered by changing the values here
    private static final int MAX_ZOMBIE_CHARACTERS = 20;
    private static final int MAX_SURVIVOR_CHARACTERS = 20;
    private static final int MAX_ZOMBIE_TYPES = 2;
    private static final int MAX_SURVIVOR_TYPES = 3;
    private static final int COMMON_INFECT = 0;
    private static final int TANK = 1;
    private static final int CHILD = 0;
    private static final int TEACHER = 1;
    private static final int SOLDIER = 2;

    // The Character ArrayLists Class specific variables
    private ArrayList<Character> survivorList = new ArrayList<>();
    private ArrayList<Character> zombieList = new ArrayList<>();

    /**
     * The CharacterList() constructor will populate both survivorList and
     * zombieList with a randomly generated number of Characters.
     */
    public CharacterList() {
        // Generating Survivor and Zombie Lists
        createSurvivorList();
        createZombieList();
        Character.resetId();
    }

    /**
     * The createSurvivorList() method will create a List of Character list of Survivor
     * objects and add them to the Class variable survivorList.
     */
    private void createSurvivorList() {
        // Generating an int number of Survivor objects to construct
        int survivorCount = (int) Math.floor(Math.random() * (MAX_SURVIVOR_CHARACTERS + 1));
        // Declaring a variable to hold the random Survivor subclass
        int survivorType;

        // The random number of Survivor objects will be constructed
        for (int i = 0; i < survivorCount; i++) {
            // A random int Survivor subclass is chosen
            survivorType = (int) Math.floor(Math.random() * (MAX_SURVIVOR_TYPES));

            // Using multi-directional control statement to create the correct Survivor
            // subclass and add it to the survivorList
            if (survivorType == CHILD) {
                this.survivorList.add(new Child());
            } else if (survivorType == TEACHER) {
                this.survivorList.add(new Teacher());
            } else if (survivorType == SOLDIER) {
                this.survivorList.add(new Soldier());
            } else {
                System.out.println("Error creating survivor list, check in CharacterList.java");
            }
        }
    }

    /**
     * The createZombieList() method will create a List of Character list of Zombie
     * objects and add them to the Class variable zombieList.
     */
    private void createZombieList() {
        // Generating an int number of Zombie objects to construct
        int zombieCount = (int) Math.floor(Math.random() * (MAX_ZOMBIE_CHARACTERS + 1));
        // Declaring a variable to hold the random Zombie subclass
        int zombieType;

        // The random number of Zombie objects will be constructed
        for (int i = 0; i < zombieCount; i++) {
            // A random int Zombie subclass is chosen
            zombieType = (int) Math.floor(Math.random() * (MAX_ZOMBIE_TYPES));

            // Using multi-directional control statement to create the correct Zombie
            // subclass and add it to the zombieList
            if (zombieType == COMMON_INFECT) {
                this.zombieList.add(new CommonInfect());
            } else if (zombieType == TANK) {
                this.zombieList.add(new Tank());
            } else {
                System.out.println("Error creating zombie list, check in CharacterList.java");
            }
        }
    }

    /**
     * Accessor method for survivorList. Will return a clone of the
     * original for data integrity.
     *
     * @return - value of survivorList.
     */
    public ArrayList<Character> getSurvivorList() {
        return (ArrayList<Character>) this.survivorList.clone();
    }

    /**
     * Accessor method for zombieList. Will return a clone of the
     * original for data integrity.
     *
     * @return - value of zombieList.
     */
    public ArrayList<Character> getZombieList() {
        return (ArrayList<Character>) this.zombieList.clone();
    }

    /**
     * Mutator method for survivorList.
     *
     * @param - new value for survivorList.
     */
    public void setSurvivorList(ArrayList<Character> survivorList) {
        this.survivorList = survivorList;
    }

    /**
     * Mutator method for zombieList.
     *
     * @param - new value for zombieList.
     */
    public void setZombieList(ArrayList<Character> zombieList) {
        this.zombieList = zombieList;
    }

}