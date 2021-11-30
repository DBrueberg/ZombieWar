/* Group 1 - Original author Devin Brueberg
 * CSC 422 Assignment 5 Part 2
 * PlayMatchControl.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *
 *
 */

// Package name
package control;

// Importing needed Classes

import entity.Character;
import entity.CharacterList;
import entity.Match;

// Importing needed java.util
import java.util.ArrayList;

/**
 * The PlayMatchControl Class will handle the flow and control
 * the program if the Player chooses to play a Match. It will
 * create all the Characters needed using CharacterList, run a
 * Match, then print the results using the PrintReportControl.
 */
public class PlayMatchControl {
    // The needed Character Lists for the Match
    private ArrayList<Character> survivorList;
    private ArrayList<Character> zombieList;

    /**
     * The PlayMatchControl() constructor will use CharacterList
     * to generate a Character List then assign the lists to
     * the Class variables.
     */
    public PlayMatchControl() {
        // Constructing a new CharacterList
        CharacterList characterList = generateCharacterList();

        // Using the get methods from the CharacterList to
        // initialize the PlayMatchControl variables
        this.survivorList = characterList.getSurvivorList();
        this.zombieList = characterList.getZombieList();
    }

    /**
     * The generateCharacterList() method will construct and
     * return a new CharacterList() using its default constructor.
     *
     * @return - A newly constructed CharacterList.
     */
    private CharacterList generateCharacterList() {
        return new CharacterList();
    }

    /**
     * The createMatch() method will create a new Match using the
     * generated Character Lists. It will first print the Character List
     * information before starting the Match. After the Match is over the
     * Class specific Character Lists will be updated `to reflect the results.
     */
    public void createMatch() {
        // Printing the current Character stats pre Match
        printStartStats();

        // DEBUG START *********************************************************
//        zombieList.forEach(e -> {
//            System.out.println(e.getClass().getSimpleName() + " zombie class.");
//        });
//        survivorList.forEach(e -> {
//            System.out.println(e.getClass().getSimpleName() + " survivor class.");
//        });
        // DEBUG END ************************************************************

//        // Constructing a new Match using the current values of survivorList and
//        // zombieList in this instance
          Match match = new Match(getSurvivorList(), getZombieList());

          // Starting the Match using the start() method
          match.start();

//        // Updating the Match results to reflect in this instances variables
          this.survivorList = match.getSurvivorList();
          this.zombieList = match.getZombieList();
    }

    /**
     * The createPrintReportControl() will create a new PrintReportControl object
     * and print the Report to the screen.
     */
    public void createPrintReportControl() {
//        PrintReportControl printReportControl = new PrintReportControl(getSurvivorList(), getZombieList());
//        printReportControl.printReport();
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
     * The printStartStats() method will print the current state of
     * this instances Character Lists.
     */
    private void printStartStats() {
        // Printing out the current pre Match Stats
        System.out.println("Match Started");
        System.out.println("We have " + survivorList.size() +
                " survivors trying to make it to safety.");
        System.out.println("But there are " + zombieList.size() +
                " zombies waiting for them.");
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