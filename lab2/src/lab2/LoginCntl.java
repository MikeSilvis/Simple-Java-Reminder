package lab2;

import javax.swing.JPanel;

public class LoginCntl {

    //Controller attributes

    //View attributes
    private BlackoutFrame theFrame;
    private LoginUI theLoginUI;

    //Model attributes
    private ModelFactory theModelFactory;
    private UserList currentUserList;
    private User currentUser;
    private AES theAES = new AES();
    
    public LoginCntl()
    {
        //Initialize UI components (Frame and Panel)
        initializeUI();

        //Initialize Model Factory and UserList
        theModelFactory = new ModelFactory();
        currentUserList = theModelFactory.getDataObject().getUserList();
    }

    //Called by LoginUI when "Submit" button is clicked
    public void submitButtonClicked(String currentUsername, String sentCurrentPassword)
    {
        String currentPassword = theAES.encrypt(sentCurrentPassword);
        
        //Validate login info here
        for (User u : currentUserList.getList())
        {
             if(u.getUsername().equals(currentUsername))
             {
                 //Check password
                 if(u.getPassword().equals(currentPassword))
                 {
                     MainMenuCntl theMainMenuCntl = new MainMenuCntl(theModelFactory, theFrame, u);
                     System.out.println("Login Succesful");
                     theLoginUI.setVisible(false);
                 }
                 else
                 {
                     theLoginUI.setTextofJlabel5("Incorrect Password!");
                     System.out.println("Inccorrect Password!");
                 }
             }
             else{
                theLoginUI.setTextofJlabel5("Username doesn't exist!");
                System.out.println("Username doesn't exist!");
             }
             return;
        }
    }
    public void registerClicked()
    {
        RegisterCntl theRegisterCntl = new RegisterCntl(this,theModelFactory, theFrame);
        theLoginUI.setVisible(false);
    }

    //Sets up the main UI components(Frame, LoginUI panel)
    public void initializeUI()
    {
        //Setup Application Frame
        theFrame = new BlackoutFrame();

        //Setup LoginUI
        theLoginUI = new LoginUI(this);
        theLoginUI.setVisible(true);
        theLoginUI.setTextofJlabel5("");
        theFrame.add(theLoginUI);
        theFrame.pack();
    }
    public void backToLogin(JPanel pPanel) {

        pPanel.setVisible(false);
        theLoginUI.setVisible(true);

    }

}
