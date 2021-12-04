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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
     * The mapCharacterList() method retrieves the generated Character Arrays
     * and maps the Class with the Class quantities. The resulting map is
     * returned to the caller.
     *
     * @return - A Map<String, Integer> containing a class descriptor and the
     * quantity of that class.
     */
    private Map<String, Integer> mapCharacterList() {
        // Initializing a new LinkedHashMap to hold the Character quantities
        Map<String, Integer> characterMap = new LinkedHashMap<>();

        // The subclass names of Zombie and Survivor classes as of 12/02/2021
        String[] characterArray =
                {"children", "teachers", "soldiers", "common infected", "tanks"};

        // Creating an array of character descriptors to use as keys and setting all
        // quantity values to 0
        for (int i = 0; i < characterArray.length; i++) {
            characterMap.put(characterArray[i], 0);
        }

        // Traversing through the Survivor List and counting up each Character quantity
        survivorList.forEach(survivor -> {
            // Retrieving the simple class name and assigning it to a String for comparison
            String survivorClass = survivor.getClass().getSimpleName();

            // If of Class Child it is incremented
            if (survivorClass.equals("Child")) {
                characterMap.put("children", characterMap.get("children") + 1);
            }
            // If of Class Teacher it is incremented
            else if (survivorClass.equals("Teacher")) {
                characterMap.put("teachers", characterMap.get("teachers") + 1);
            }
            // If of Class Soldier it is incremented
            else if (survivorClass.equals("Soldier")) {
                characterMap.put("soldiers", characterMap.get("soldiers") + 1);
            }
        });

        // Traversing through the Zombie List and counting up each Character quantity
        zombieList.forEach(zombie -> {
            // Retrieving the simple class name and assigning it to a String for comparison
            String zombieClass = zombie.getClass().getSimpleName();

            // If of Class CommonInfect it is incremented
            if (zombieClass.equals("CommonInfect")) {
                characterMap.put("common infected", characterMap.get("common infected") + 1);
            }
            // If of Class Tank it is incremented
            else if (zombieClass.equals("Tank")) {
                characterMap.put("tanks", characterMap.get("tanks") + 1);
            }
        });

        // Returning the Character map
        return characterMap;
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
        PrintReportControl printReportControl = new PrintReportControl(getSurvivorList(), getZombieList());
        printReportControl.printReport();
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
        // Calling mapCharacterList to map the Characters and their quantities
        Map<String, Integer> characterMap = mapCharacterList();

        // Printing out the current pre Match Stats
        // First print out survivors
        System.out.print("We have " + survivorList.size() +
                " survivors trying to make it to safety");
        System.out.println(" (" + characterMap.get("children") + " children, " +
                characterMap.get("teachers") + " teachers, " +
                characterMap.get("soldiers") + " soldiers)");
        // Next print out zombies
        System.out.print("But there are " + zombieList.size() +
                " zombies waiting for them");
        System.out.println(" (" + characterMap.get("common infected") +
                " common infected, " + characterMap.get("tanks") + " tanks)");
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