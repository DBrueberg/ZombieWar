package control;

import entity.Character;
import entity.CharacterList;

import java.util.ArrayList;

public class PlayMatchControl {
    ArrayList<Character> survivorList;
    ArrayList<Character> zombieList;

    public PlayMatchControl() {
        CharacterList characterList = generateCharacterList();
        this.survivorList = characterList.getSurvivorList();
        this.zombieList = characterList.getZombieList();
    }

    private CharacterList generateCharacterList() {
        return new CharacterList();
    }

    public ArrayList<Character> populateSurvivorList() {
        return this.survivorList;
    }

    public ArrayList<Character> populateZombieList() {
        return this.zombieList;
    }

    public void createMatch() {
        printStartStats();

        // DEBUG START *********************************************************
//        zombieList.forEach(e -> {
//            System.out.println(e.getClass().getSimpleName() + " zombie class.");
//        });
//        survivorList.forEach(e -> {
//            System.out.println(e.getClass().getSimpleName() + " survivor class.");
//        });
        // DEBUG END ************************************************************

        //**************************ADD MATCH HERE****************************************
        // Add in a new Match() here
        // Just let Match have access to the raw lists so
        // they can be altered in PlayMatchControl from
        // Match.
        // When this method ends, Match will be destroyed
//        Match match = new Match(getSurvivorList(), getZombieList());
//        match.start();
//        this.survivorList = match.getSurvivorList();
//        this.zombieList = match.getZombieList();

    }

    private void printStartStats() {
        System.out.println("Match Started");
        System.out.println("We have " + survivorList.size() +
                " survivors trying to make it to safety.");
        System.out.println("But there are " + zombieList.size() +
                " zombies waiting for them.");
    }

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
