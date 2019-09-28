/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csia;

import java.io.Serializable;

/**
 *
 * @author CorbynKwan
 */
public class Worker implements Serializable {

    private static int nextID = 1;

    private Journal journal;
    private String Name;
    private int id;

    public Worker(String Name) {
        this.Name = Name;
        this.id = nextID; 
        nextID = nextID+1;
        this.journal = new Journal();
    }

    /**
     * Gets the name of a worker
     *
     * @return A string containing a name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Gets the journal
     *
     * @return a Journal containing a journal
     */
    public Journal getJournal() {
        return this.journal;
    }

    /**
     * Adds a shift
     *
     * @param newShift The new shift
     */
    public void addShift(Shift newShift) {
        journal.addShift(newShift);
    }

    /**
     * Gets the id of a worker
     *
     * @return an int containing an id
     */
    public int getid() {
        return this.id;
    }

    /**
     * Sets the name of a worker
     *
     * @param newName The new name of a worker
     */
    public void setName(String newName) {
        this.Name = newName;
    }

}
