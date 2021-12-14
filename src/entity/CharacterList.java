/* Group 1 - Original author Devin Brueberg
 * CSC 422 Assignment 5 Part 2
 * CharacterList.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *  (DAB, 12/03/2021, CharacterLists are now constructed with
 *  unique ID's)
 *  (CPD, 12/13/2021, Added methods to generate and access weaponCache)
 *  (CPD, 12/13/2021, Implemented giving new survivors random weapons)
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
    private static final int MAX_WEAPON_TYPES = 7;
    private static final int COMMON_INFECT = 0;
    private static final int TANK = 1;
    private static final int CHILD = 0;
    private static final int TEACHER = 1;
    private static final int SOLDIER = 2;
    private static final int ASSAULT_RIFLE = 0;
    private static final int AXE = 1;
    private static final int CROWBAR = 2;
    private static final int FRYING_PAN = 3;
    private static final int PISTOL = 4;
    private static final int SHOTGUN = 5;
    private static final int SUBMACHINE_GUN = 6;

    // The Character ArrayLists Class specific variables
    private ArrayList<Character> survivorList = new ArrayList<>();
    private ArrayList<Character> zombieList = new ArrayList<>();
    private ArrayList<Weapon> weaponCache = new ArrayList<>();

    /**
     * The CharacterList() constructor will populate both survivorList and
     * zombieList with a randomly generated number of Characters.
     */
    public CharacterList() {
        // Generating Survivor and Zombie Lists
        createSurvivorList();
        createZombieList();
    }

    /**
     * The createSurvivorList() method will create a List of Character list of Survivor
     * objects and add them to the Class variable survivorList.
     */
    private void createSurvivorList() {
        // Generating an int number of Survivor objects to construct
        int survivorCount = (int) (Math.floor(Math.random() * MAX_SURVIVOR_CHARACTERS)+1);
        // Declaring a variable to hold the random Survivor subclass
        int survivorType;
        // Adding ID's for Zombie Characters
        int childID = 0;
        int teacherID = 0;
        int soldierID = 0;
        
        // Create cache of random weapons. Each survivor gets a weapon
        createWeaponCache(survivorCount);

        // The random number of Survivor objects will be constructed
        for (int i = 0; i < survivorCount; i++) {
            // A random int Survivor subclass is chosen
            survivorType = (int) Math.floor(Math.random() * (MAX_SURVIVOR_TYPES));

            // Using multi-directional control statement to create the correct Survivor
            // subclass and add it to the survivorList. ID's are used to construct the
            // Character objects
            switch (survivorType) {
                case CHILD:
                    this.survivorList.add(new Child(childID++,takeWeapon()));
                    break;
                case TEACHER:
                    this.survivorList.add(new Teacher(teacherID++,takeWeapon()));
                    break;
                case SOLDIER:
                    this.survivorList.add(new Soldier(soldierID++,takeWeapon()));
                    break;
                default:
                    System.out.println("Error creating survivor list, check in CharacterList.java");
                    break;
            }
        }
    }

    /**
     * The createZombieList() method will create a List of Character list of Zombie
     * objects and add them to the Class variable zombieList.
     */
    private void createZombieList() {
        // Generating an int number of Zombie objects to construct
        int zombieCount = (int) (Math.floor(Math.random() * MAX_ZOMBIE_CHARACTERS)+1);
        // Declaring a variable to hold the random Zombie subclass
        int zombieType;
        // Adding ID's for Zombie Characters
        int commonInfectID = 0;
        int tankId = 0;

        // The random number of Zombie objects will be constructed
        for (int i = 0; i < zombieCount; i++) {
            // A random int Zombie subclass is chosen
            zombieType = (int) Math.floor(Math.random() * (MAX_ZOMBIE_TYPES));

            // Using multi-directional control statement to create the correct Zombie
            // subclass and add it to the zombieList. ID's are used to construct the
            // Character objects
            if (zombieType == COMMON_INFECT) {
                this.zombieList.add(new CommonInfect(commonInfectID++));
            } else if (zombieType == TANK) {
                this.zombieList.add(new Tank(tankId++));
            } else {
                System.out.println("Error creating zombie list, check in CharacterList.java");
            }
        }
    }
    
    /**
     * The createWeaponCache() method will create a list of Weapon
     * objects and add them to the Class variable weaponCache.
     */
    private void createWeaponCache(int survivorCount) {
        // Generate a weapon for each survivor
        int weaponCount = survivorCount;
        // Declaring a variable to hold the random Weapon subclass
        int weaponType;

        // The random number of Survivor objects will be constructed
        for (int i = 0; i < weaponCount; i++) {
            // A random int Survivor subclass is chosen
            weaponType = (int) Math.floor(Math.random() * (MAX_WEAPON_TYPES));

            // Using multi-directional control statement to create the correct Weapon
            // subclass and add it to the weaponCache.
            switch(weaponType) {
                case ASSAULT_RIFLE:
                    this.weaponCache.add(new AssaultRifle());
                    break;
                case AXE:
                    this.weaponCache.add(new Axe());
                    break;
                case CROWBAR:
                    this.weaponCache.add(new Crowbar());
                    break;
                case FRYING_PAN:
                    this.weaponCache.add(new FryingPan());
                    break;
                case PISTOL:
                    this.weaponCache.add(new Pistol());
                    break;
                case SHOTGUN:
                    this.weaponCache.add(new Shotgun());
                    break;
                case SUBMACHINE_GUN:
                    this.weaponCache.add(new SubmachineGun());
                    break;
                default:
                    System.out.println("Error creating weapon cache, check in CharacterList.java");
                    break;
            }
        }
        
        // Debug code
//        System.out.println("Debugging weapon cache");
//        for (int i=0; i<weaponCache.size(); i++) {
//            System.out.println("Weapon: " + i + " is " + weaponCache.get(i));
//        }
    }
    
    /**
     * Method to return a random weapon from the cache
     * Also removes the weapon from the cache
     *
     * @return - random Weapon from weaponCache
     */
    public Weapon takeWeapon() {
        int weaponCount = weaponCache.size();
//        System.out.println("Weapon cache size is " + weaponCount);
        
        // Generate a random index to use in the weaponCache ArrayList
        int randomWeaponIndex = (int) (Math.floor(Math.random() * weaponCount));
        
        // Create a Weapon from the random index
        Weapon randomWeapon = weaponCache.get(randomWeaponIndex);
        
        // Remove the Weapon from the weaponCache so it can't be used twice
        weaponCache.remove(randomWeaponIndex);
        
        // Return random Weapon that has been removed from the cache
        return randomWeapon;
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
     * Accessor method for weaponCache. Will return a clone of the
     * original for data integrity.
     *
     * @return - value of weaponCache.
     */
    public ArrayList<Weapon> getWeaponCache() {
        return (ArrayList<Weapon>) this.weaponCache.clone();
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
    
    /**
     * Mutator method for weaponCache.
     *
     * @param - new value for weaponCache.
     */
    public void setWeaponCache(ArrayList<Weapon> weaponCache) {
        this.weaponCache = weaponCache;
    }
}