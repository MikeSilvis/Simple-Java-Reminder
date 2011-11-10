/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mikesilvis
 */
public class Reminder implements Serializable{
    private String reminder;
    private String due;
    
    public Reminder(String sentReminder, String sentDue){
       setReminder(sentReminder);
       setDue(sentDue);
    }
    // gettors
    public String getReminder(){
        return reminder;
    }
    public String getDue(){
        return due;
    }
    // settors
    public void setReminder(String sentReminder){
        reminder = sentReminder;
    }
    public void setDue(String sentDue){
        due = sentDue;
    }



}
