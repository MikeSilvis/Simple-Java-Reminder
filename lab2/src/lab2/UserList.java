package lab2;

import java.io.Serializable;
import java.util.ArrayList;


public class UserList implements Serializable{

    //Contains the actual "list" of User objects
    private ArrayList<User> listOfUsers = new ArrayList<User>();

    //Constructor only called when dataObject does not exist on disk
    //This method populates a the newly created UserList with test-users
    public UserList()
    {
        listOfUsers.add(new User("MikeSilvis", "Michael1%"));
        listOfUsers.add(new User("BrianWenner", "Brian123#"));

        System.out.println("Test UserList created");
    }

    public ArrayList<User> getList()
    {
        return listOfUsers;
    }
}