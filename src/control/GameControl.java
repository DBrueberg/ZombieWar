/* Group 1 - Original author Devin Brueberg
 * CSC 422 Assignment 5 Part 2
 * GameControl.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *
 *
 */

// Package name
package control;

// Importing the needed java utilities
import java.util.Scanner;

/**
 * GameControl will handle all features available to a
 * Game. Currently, a Game allows for a Match to be played or allows
 * the Player to EndGame.
 */
public class GameControl {
    // The final variables that control/display the Game menu
    public final int MATCH_OPTION = 1;
    public final int END_OPTION = 2;

    /**
     * Public constructor that will construct a new
     * GameControl object.
     */
    public GameControl() {
    }

    /**
     * The start() method will display a menu used to navigate
     * through a Game.
     */
    public void start() {
        // Display the in Game menu to the Player
        displayMenu();
    }

    /**
     * The displayMenu() method will display the menu used to navigate
     * a ZombieWar Game.
     */
    public void displayMenu() {
        // The Player will be allowed to navigate the menu until the
        // sentinel value is false
        boolean isPlaying = true;

        // Displaying a welcome message to the Player
        System.out.println("Welcome to Zombie War!\n");

        // The while loop will repeat until isPlaying is set to false
        // allowing the Player to select Match after Match or just EndGame
        while (isPlaying) {
            // The choice variable will hold the menu choice of the Player
            int choice;

            // Menu items are displayed for the Player to choose from
            System.out.println("What would you like to do?");
            System.out.println(MATCH_OPTION + ") Play a Match");
            System.out.println(END_OPTION + ") End Game\n");

            // The choice is int validated by calling the choiceValidator()
            // method
            choice = choiceValidator();

            // A switch is used to execute the choice of the Player
            switch (choice) {
                // The MATCH_OPTION case will begin a Match by calling PlayMatch
                case MATCH_OPTION:
                    // CALL PlayMatch Here
                    break;
                // The END_OPTION case will end the Game by calling EndGame
                case END_OPTION:
                    // CALL EndGame Here
                    // EndOption should set isPlaying to false
                    // to terminate the Game
                    break;
                // If no case item is selected the menu is displayed again
                default:
                    break;
            }
        }
    }

    /**
     * The choiceValidator() will request the Player for an int value and
     * return either that value if a valid int is used or 0 is an invalid
     * input is entered.
     *
     * @return - 0 for invalid input and the valid int if an int input is
     * entered.
     */
    public int choiceValidator() {
        // Creating a new Scanner object to get user input
        Scanner input = new Scanner(System.in);
        // Initializing and priming choice for Player input
        int choice = 0;

        // Enclosing the Player input in a try/catch block to catch
        // a possible InputMismatchException
        try {
            // Requesting the int choice from the Player
            choice = input.nextInt();
            // Clearing the Scanner
            input.nextLine();

            // Adding a newLine for formatting
            System.out.println();
        // If the input entered is invalid
        } catch (Exception e) {
            // The Player is notified with a message
            System.out.println("Please enter a valid int choice\n");
            // The Scanner is cleared for the next input
            input.nextLine();
        }

        // Closing the Scanner
        input.close();

        // Returning the Player entered choice to the caller
        return choice;
    }
}