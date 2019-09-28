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
public class Manager implements Serializable {
    
    private String masterPassword = "a"; 
    
    /**
     * Gets the Master Password
     * @return A string containing the master password
     */
    public String getMasterpassword(){ 
        return this.masterPassword; 
    }
    /**
     * 
     * @param newMasterPassword The new master password, which should the masterPassword is not equal to
     */
    public void setMasterPassword(String newMasterPassword){
        this.masterPassword = newMasterPassword; 
    }
    /**
     * 
     * @param password The Password inputted which should equal the Master password
     * @return a boolean statement of true or false 
     */
    public boolean validatePassword(String password){
        if(password.equals(masterPassword)){
           return true; 
        }else { 
            return false;
        }
    }
}
