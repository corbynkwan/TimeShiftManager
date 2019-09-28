/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csia;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CorbynKwan
 */
public class ListOfWorkers implements Serializable {
     private ArrayList<Worker>ListOfWorkers = new ArrayList<Worker>(); 
     /**
      * 
      * @param index The index number of the array
      * @return The item inside the index of the ListOfWorkers
      */
     public Worker getWorker(int index){ 
        return ListOfWorkers.get(index); 
     }
     
     /**
      * 
      * @param id The id of a worker which should be an int
      * for loop to find if the name of one of the workers in the ListOfWorkers has the id inputted
      * if the id of the worker is equal to the one inputted, the worker is removed from the ListOfWorkers
      */
     public void deleteWorker(int id) { 
       for(int i = 0; i<ListOfWorkers.size();i++){
           if(ListOfWorkers.get(i).getid() == id){
               ListOfWorkers.remove(i); 
               
           }
       } 
     }
     /**
      * 
      * @param name The name of a worker 
      * The name is added to the ListOfWorkers
      */
     public void createWorker(String name){ 
         Worker x = new Worker(name);//Calling the constructor
         ListOfWorkers.add(x); 
         x.setName(name);

         }
     /**
      * gets the size of ListOfWorkers 
      * @return ListOfWorkers.size()
      */
       public int getLength(){ 
        return ListOfWorkers.size(); 
     }
     }

