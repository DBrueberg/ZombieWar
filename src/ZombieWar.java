/* Group 1 - Original author Devin Brueberg
 * CSC 422 Assignment 5 Part 2
 * ZombieWar.java
 * November 28, 2021
 * Updated(Initials, Date, Changes):
 *
 *
 */

// Importing needed package
import entity.Game;

/**
 * The ZombieWar class is the entry point for a Player to play
 * a ZombieWar Game.
 */
public class ZombieWar {
    /**
     * The main() method will create a new Game instance and
     * start the game by calling the execute() method.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Constructing a new Game instance
        Game game = new Game();
        // Executing game to begin the Game
        game.execute();
    }
}
