package lab2;

import java.util.ArrayList;
import javax.swing.JPanel;


public class MainMenuCntl {

    //Attributes
    private ModelFactory theModelFactory;
    private BlackoutFrame theFrame;
    private MainMenuUI theMainMenuUI;
    private User currentUser;

    public MainMenuCntl(ModelFactory sentModelFactory, BlackoutFrame sentFrame, User sentUser)
    {
        theModelFactory = sentModelFactory;
        theFrame = sentFrame;
        currentUser = sentUser;
        initializeUI();
    }

    //Setup the MainMenu UI and add it to the BlackoutFrame
    public void initializeUI()
    {
        theMainMenuUI = new MainMenuUI(this, currentUser);
        theMainMenuUI.setVisible(true);
        theFrame.add(theMainMenuUI);
    }
    public void addReminderClicked()
    {
        addReminderCntl theaddReminderCntl = new addReminderCntl(this, theFrame, theModelFactory, currentUser);
        theMainMenuUI.setVisible(false);
    }
    public void deleteReminderClicked()
    {
        theMainMenuUI.populateList(currentUser);
        theModelFactory.saveDataFile();
        theMainMenuUI.populateList(currentUser);
    }
    public void backToMainMenu(JPanel pPanel) {
        theMainMenuUI.populateList(currentUser);
        pPanel.setVisible(false);
        theMainMenuUI.setVisible(true);
    }
}
