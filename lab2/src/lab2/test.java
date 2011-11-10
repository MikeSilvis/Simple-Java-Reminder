package lab2;

import junit.framework.*;

public class test extends TestCase {
    private LoginCntl theLoginCntl = new LoginCntl();

    public void testLogin()
    {
        System.out.println("Testing false username, and false password.");
        theLoginCntl.submitButtonClicked("rabble","rabble");

        System.out.println("Testing correct username, and false password");
        theLoginCntl.submitButtonClicked("MikeSilvis","Rabble");

        System.out.println("Testing correct username, and correct password");
        theLoginCntl.submitButtonClicked("MikeSilvis","Michael1%");
    }
}