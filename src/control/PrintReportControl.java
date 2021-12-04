/* Group 1 - Original author Coleman Dietsch
 * CSC 422 Assignment 5 Part 2
 * PrintReportControl.java
 * November 29, 2021
 * Updated(Initials, Date, Changes):
 *
 *
 */

// Package name
package control;

import java.util.ArrayList;

// Importing the needed package's
import entity.Report;

/**
 * The PrintReportControl class will receive data on the starting number 
 * of survivors and zombies as well as the amount of survivors left from 
 * the PlayMatchControl class after the Match ends . It will then create 
 * a Report instance that will print the information to the user similar 
 * to the example output shown below:
 */
public class PrintReportControl {
    
    private Report report;

     /**
     * Public constructor that will construct a new
     * PrintReportControl object.
     */
    public PrintReportControl() {
    }
    
    /**
     * 
     * @param survivorList
     * @param zombieList 
     * 
     * This second constructor takes the two Character lists and finds the
     * size of each so we can generate our report.
     */
    public PrintReportControl(ArrayList<entity.Character> survivorList, 
            ArrayList<entity.Character> zombieList) {
        // Assigning the number of Survivor and/or Zombies that are alive
        // to a variable
        int survivorAlive = (int) survivorList.parallelStream()
                .filter(e -> e.isAlive() == true)
                .count();
        int zombieAlive = (int) zombieList.parallelStream()
                .filter(e -> e.isAlive() == true)
                .count();

        // Create a new report object passing in the count of survivors
        // and zombies.
        report = new Report(survivorAlive, zombieAlive);
    }
    
    /**
     * Print the results of the report object. The Report.toString() method
     * determines the formatting of this output.
     */
    public void printReport() {
        System.out.println(report);
    }
}