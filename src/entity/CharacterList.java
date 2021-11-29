package entity;

import java.util.ArrayList;

public class CharacterList {
    private static final int MAX_ZOMBIE_CHARACTERS = 20;
    private static final int MAX_SURVIVOR_CHARACTERS = 20;
    private static final int MAX_ZOMBIE_TYPES = 2;
    private static final int MAX_SURVIVOR_TYPES = 3;
    private static final int COMMON_INFECT = 0;
    private static final int TANK = 1;
    private static final int CHILD = 0;
    private static final int TEACHER = 1;
    private static final int SOLDIER = 2;

    private ArrayList<Character> survivorList = new ArrayList<>();
    private ArrayList<Character> zombieList = new ArrayList<>();

    public CharacterList() {
        createSurvivorList();
        createZombieList();
    }

    private void createSurvivorList() {
        int survivorCount = (int) Math.floor(Math.random()*(MAX_SURVIVOR_CHARACTERS+1));
        int survivorType;

        for (int i = 0; i < survivorCount; i++) {

            survivorType = (int) Math.floor(Math.random()*(MAX_SURVIVOR_TYPES));

            if (survivorType == CHILD) {
                this.survivorList.add(new Child());
            }
            else if (survivorType == TEACHER){
                this.survivorList.add(new Teacher());
            }
            else if (survivorType == SOLDIER) {
                this.survivorList.add(new Soldier());
            }
            else {
                System.out.println("Error creating survivor list, check in CharacterList.java");
            }
        }
    }

    private void createZombieList() {
        int zombieCount = (int) Math.floor(Math.random()*(MAX_ZOMBIE_CHARACTERS+1));
        int zombieType;

        for (int i = 0; i < zombieCount; i++) {

            zombieType = (int) Math.floor(Math.random()*(MAX_ZOMBIE_TYPES));

            if (zombieType == COMMON_INFECT) {
                this.zombieList.add(new CommonInfect());
            }
            else if (zombieType == TANK){
                this.zombieList.add(new Tank());
            }
            else {
                System.out.println("Error creating zombie list, check in CharacterList.java");
            }
        }
    }

    /**
     * Accessor method for survivorList.
     *
     * @return - value of survivorList.
     */
    public ArrayList<Character> getSurvivorList() {
        return (ArrayList<Character>) this.survivorList.clone();
    }

    /**
     * Accessor method for zombieList.
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
