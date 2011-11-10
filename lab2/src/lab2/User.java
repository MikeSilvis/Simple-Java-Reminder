package lab2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class User implements Serializable {

    //Attributes
    //Login info
    private String userName;
    private String password;
    private ArrayList<Reminder> listOfReminders = new ArrayList<Reminder>();
    transient private AES theAES = new AES();

    public User(String sentUserName, String sentPassword)
    {
        //User attributes
        setUsername(sentUserName);
        setPassword(sentPassword);
    }

    //Accessors
    public String getUsername()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }
    public ArrayList<Reminder> getReminderList()
    {
        return listOfReminders;
    }
    //Mutators
    public void setUsername(String newUsername)
    {
        userName = newUsername;
    }

    public void setPassword(String newPassword)
    {
        password = theAES.encrypt(newPassword);
    }
    // adders
    public void addReminder(String reminder, String due){
        Reminder theReminder = new Reminder(reminder,due);

        listOfReminders.add(theReminder);
        System.out.println("Reminder Added");
    }
    public void removeReminder(int Selected){
        
        System.out.println("Selected " + Selected);
        
        listOfReminders.remove(Selected+1);
        
        System.out.println("Reminder should be removed");
        for(int i=1; i < listOfReminders.size(); i++){
            System.out.println(listOfReminders.get(i).getReminder());
        }
    }
}
