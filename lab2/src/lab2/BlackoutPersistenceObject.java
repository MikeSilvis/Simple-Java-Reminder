package lab2;

import java.io.Serializable;

public class BlackoutPersistenceObject implements Serializable{

    private UserList currentUserList;

    //Constructor - only called when the dataObject does not exist
    public BlackoutPersistenceObject()
    {
        createDefLists();
    }

    public UserList getUserList()
    {
        return currentUserList;
    }
    //This method creates default lists to be used if none exist
    public void createDefLists()
    {
        currentUserList = new UserList();
    }



}
