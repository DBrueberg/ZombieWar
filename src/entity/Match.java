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

    private final ArrayList<Character> survivorList;
    private final ArrayList<Character> zombieList;
    private int currentTurn = 0;

    public Match(ArrayList<Character> survivorList, ArrayList<Character> zombieList){
        this.survivorList =  (ArrayList<Character>) survivorList.clone();
        this.zombieList = (ArrayList<Character>) zombieList.clone();

    }

    /**
     * Start the match
     */
    public void start(){

        while(this.getSurvivorCount() > 0 && this.getZombieCount() > 0){
            Character activeSurvivor = this.survivorList.get(0);
            Character activeZombie = this.zombieList.get(0);

            if(this.isSurvivorsTurn()){
                activeSurvivor.attack(activeZombie);

                if(!activeZombie.isAlive()){
                    this.zombieList.remove(0);
                    System.out.println(activeSurvivor.getClass().getSimpleName()+" "+activeSurvivor.getId()+" killed "
                            +activeZombie.getClass().getSimpleName()+" "+activeZombie.getId());
                }
            }else{
                activeZombie.attack(activeSurvivor);

                if(!activeSurvivor.isAlive()){
                    this.survivorList.remove(0);
                    System.out.println(activeZombie.getClass().getSimpleName()+" "+activeZombie.getId()+" killed "
                            +activeSurvivor.getClass().getSimpleName()+" "+activeSurvivor.getId());
                }
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