/* Group 1 - Original author Casey Flier
 * CSC 422 Assignment 5 Part 2
 * Match.java
 * November 29, 2021
 * Updated(Initials, Date, Changes):
 *
 *
 */

//Package name
package entity;

//Importing needed classes


//Import ArrayList
import java.util.ArrayList;

public class Match{

    private ArrayList<Character> survivorList = new ArrayList<>();
    private ArrayList<Character> zombieList = new ArrayList<>();
    private int currentTurn = 0;
    private Survivor activeSurvivor;
    private Zombie activeZombie;

    public Match(ArrayList<Character> survivorList, ArrayList<Character> zombieList){
        this.survivorList =  survivorList;
        this.zombieList = zombieList;
        this.activeSurvivor = (Survivor) survivorList.get(0);
        this.activeZombie = (Zombie) zombieList.get(0);
    }

    public void start(){

        while(this.getSurvivorCount() > 0 && this.getZombieCount() > 0){


            if(this.isSurvivorsTurn()){


            }else{

            }

            this.currentTurn++;
        }
    }

    /**
     * @return Whether it is the survivors' turn
     */
    private boolean isSurvivorsTurn(){
        return (this.currentTurn % 2 == 0);
    }

    /**
     * @return The number of survivors left
     */
    private int getSurvivorCount(){
        return this.survivorList.size();
    }

    /**
     * @return The number of zombies left
     */
    private int getZombieCount(){
        return this.zombieList.size();
    }

    /**
     * Accessor for survivorList
     * @return value of survivorList
     */
    public ArrayList<Character> getSurvivorList(){ return this.survivorList; }

    /**
     * Accessor for zombieList
     * @return value of zombieList
     */
    public ArrayList<Character> getZombieList(){ return this.survivorList; }
}