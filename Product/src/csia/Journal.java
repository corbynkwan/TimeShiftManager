/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csia;

import java.io.Serializable;
import java.time.Duration;
import java.util.ArrayList;

/**
 *
 * @author CorbynKwan
 */
public class Journal extends Shift implements Serializable{
    private ArrayList<Shift>listOfShifts = new ArrayList<Shift>(); 
    /**
     * for loop to get time worked for each worker, and adds to total
     * @return total 
     */
    public Duration gettotalHours(){
    Duration total = Duration.ZERO; // initialized total with a value of 0
        for(int i = 0; i <listOfShifts.size();i++){ //for loop
          total = total.plus(listOfShifts.get(i).gettimeWorked());
        }       
        return total; 
        
    
 
}
    /**
     * Adds a shift to listOfShifts
     * @param newShift The new shift 
     */
    public void addShift(Shift newShift){ 
        listOfShifts.add(newShift); 
    }
    /**
     * gets the list of shifts
     * @return the an ArrayList of liftOfShifts
     */
    public ArrayList<Shift>getAllShift(){ 
        return  listOfShifts; 
    }
    /**
     * gets the size of the listOfShift ArrayList
     * @return the size of the liftOfShifts ArrayList
     */
    public int getLength(){ 
        return listOfShifts.size(); 
     }
}
    

