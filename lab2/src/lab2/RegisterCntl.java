package lab2;


public class RegisterCntl {

    //Attributes
    private ModelFactory theModelFactory;
    private BlackoutFrame theFrame;
    private RegisterUI theRegisterUI;
    private LoginCntl theLoginCntl;
    
    public RegisterCntl(LoginCntl sentLoginCntl,ModelFactory sentModelFactory, BlackoutFrame sentFrame)
    {
        theLoginCntl = sentLoginCntl;
        theModelFactory = sentModelFactory;
        theFrame = sentFrame;
        initializeUI();
    }

    //Setup the MainMenu UI and add it to the BlackoutFrame
    public void initializeUI()
    {
        theRegisterUI = new RegisterUI(this);
        theRegisterUI.setVisible(true);
        theFrame.add(theRegisterUI);
    }
    public void cancelClicked()
    {
        theLoginCntl.backToLogin(theRegisterUI);
    }
}
