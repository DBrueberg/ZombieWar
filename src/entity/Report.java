/* Group 1 - Original author Colemman Dietsch
 * CSC 422 Assignment 5 Part 2
 * Report.java
 * November 29, 2021
 * Updated(Initials, Date, Changes):
 *
 *
 */
package entity;

/**
 * The Report class prints the end match report containing the remaining 
 * number of zombies and survivors.
 */
public class Report {
    // Declaring a new report object
    private int survivorCount;
    private int zombieCount;

    /**
     * Public constructor method that will create a new report
     */
    public Report() {
    }
    
    /**
     * 
     * @param survivorCount
     * @param zombieCount 
     * 
     * Second constructor that takes the list counts as arguments
     */
    public Report(int survivorCount, int zombieCount) {
        this.survivorCount = survivorCount;
        this.zombieCount = zombieCount;
    } 
    
    /**
     * This will display the report whenever a Report object is printed out
     * @return 
     */
    public String toString() {
        String myString = "";
        myString += "It seems ";
        myString += survivorCount;
        myString += " have made it to safety.";
        return myString;
    }

}
