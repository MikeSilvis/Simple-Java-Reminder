package lab2;

/**
 *
 * @author mikesilvis
 */
public class addReminderCntl {

    //Application Attributes
    private BlackoutFrame theFrame;
    private ModelFactory theModelFactory;
    //View Attributes
    private addReminderUI theaddReminderUI;
    //Controller & Model Attributes
    private MainMenuCntl theMainMenuCntl;
    private MainMenuUI theMainMenuUI;
    private User currentUser;

    public addReminderCntl(MainMenuCntl sentMainMenuCntl, BlackoutFrame sentFrame, ModelFactory sentModelFactory, User sentUser)
    {
        theMainMenuCntl = sentMainMenuCntl;
        theModelFactory = sentModelFactory;
        currentUser = sentUser;
        theFrame = sentFrame;
        initializeUI();
    }
    public void initializeUI()
    {
        //Setup UI
        theaddReminderUI = new addReminderUI(this);
        theaddReminderUI.setVisible(true);
        theFrame.add(theaddReminderUI);
    }
    public void cancelClicked()
    {
        theMainMenuCntl.backToMainMenu(theaddReminderUI);
    }
    public void addReminderClicked(String sentDesc, String sentDue)
    {
        currentUser.addReminder(sentDesc,sentDue);
        theModelFactory.saveDataFile();
        theMainMenuCntl.backToMainMenu(theaddReminderUI);
    }

}
