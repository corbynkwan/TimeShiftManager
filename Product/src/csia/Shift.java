/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csia;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *
 * @author CorbynKwan
 */
public class Shift implements Serializable{

    private LocalDateTime timeStart;
    private LocalDateTime timeStop;
    private Duration timeWorked;
    private String password;

    /**
     * Gets the start time of a shift
     * @return timeStart
     */
    public LocalDateTime gettimeStart() {
        return this.timeStart;

    }
    /**
     * Gets the stop time of a shift
     * @return a LocalDateTime containing a stop time
     */
    public LocalDateTime gettimeStop() {
        return this.timeStop;

    }
    /**
     * gets the time worked of a shift
     * @return a LocalDateTime containing the time worked 
     */

    public Duration gettimeWorked() {
        return Duration.between(timeStart, timeStop);

    }
    /**
     * sets the start time of a shift
     * @param newtimeStart The new start time
     */

    public void settimeStart(LocalDateTime newtimeStart) {
            this.timeStart = newtimeStart;
    }
    /**
     * sets the stop time of a shift
     * @param newtimeStop The new stop time
     */

    public void settimeStop(LocalDateTime newtimeStop) {
        
      
            this.timeStop = newtimeStop;

        

    }
    /**
     * sets the time worked of a shift
     * @param newtimeWorked The new time worked
     */

    public void settimeWorked(Duration newtimeWorked) {
        this.timeWorked = newtimeWorked;

    }
}
