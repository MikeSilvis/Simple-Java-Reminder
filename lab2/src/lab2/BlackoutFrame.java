package lab2;

import javax.swing.JFrame;


public class BlackoutFrame extends JFrame {

    public BlackoutFrame()
    {
        initializeComponents();
    }

    public void initializeComponents()
    {
        this.setTitle("Blackout");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(500,250);
    }

}
