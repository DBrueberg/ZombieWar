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

    private ArrayList<Survivor> survivorList = new ArrayList<>();
    private ArrayList<Zombie> zombieList = new ArrayList<>();

    public Match(ArrayList<Survivor> survivorList, ArrayList<Zombie> zombieList){

        this.survivorList = survivorList;
        this.zombieList = zombieList;
    }

    public void start(){
        System.out.println("Match Started");
    }
}