/* Group 1 - Original author Coleman Dietsch
 * CSC 422 Assignment 5 Part 2
 * EndGameControl.java
 * November 29, 2021
 * Updated(Initials, Date, Changes):
 *
 *
 */

// Package name
package control;

/**
 * The EndGameControl will perform the actions needed before terminating 
 * a game. It will be called through the EndOption found in GameControl. 
 */
public class EndGameControl {

     /**
     * Public constructor that will construct a new
     * EndGameControl object.
     */
    public EndGameControl() {
    }
    
    /**
     * 
     * This will set isPlaying to false in GameControl 
     * and end the while loop.
     */
    public static boolean endGame() {
        return false;
    }
}
