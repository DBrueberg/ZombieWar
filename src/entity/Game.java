/* Group 1 - Original author Devin Brueberg
 * CSC 422 Assignment 5 Part 2
 * Game.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *
 *
 */

// Package name
package entity;

// Importing the needed package's
import control.GameControl;

/**
 * The Game class will create a new game object that will
 * utilize a GameControl() object in order to execute all
 * of the features available in a Game.
 */
public class Game {
    // Declaring a new game object for this Game instance
    private GameControl control;

    /**
     * Public constructor method that will create a new game
     * object so a Game can be played.
     */
    public Game() {
        // Constructing a new GameControl object that will
        // handle all of the features in a Game
        this.control = new GameControl();
    }

    /**
     * The execute() method will begin a new Game by calling the
     * GameControl start() method.
     */
    public void execute() {
        this.control.start();
    }
}