package lab2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class ModelFactory implements Serializable {

    //Main attributes
    private String dataFileName = "notifications.ser";

    //This is the object that will be actively serialized
    private BlackoutPersistenceObject dataObject;
    
    public ModelFactory()
    {
        //Read from file on disk
        readDataFile();

        //If the object doesn't exist, create a new one and read from that
        if (dataObject == null)
        {
            this.createTestDataFile();
            this.saveDataFile();
            this.readDataFile();
        }
    }

    public void readDataFile()
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;

        try
        {
            fis = new FileInputStream(dataFileName);
            in = new ObjectInputStream(fis);

            dataObject = (BlackoutPersistenceObject)in.readObject();

            in.close();

        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Data file not found! Creating default data file.", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE); 
        }
    }

    public void saveDataFile()
    {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try
        {
            fos = new FileOutputStream(dataFileName);
            out = new ObjectOutputStream(fos);

            out.writeObject(dataObject);
            out.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void createTestDataFile()
    {
        dataObject = new BlackoutPersistenceObject();
    }

    public BlackoutPersistenceObject getDataObject()
    {
        return dataObject;
    }


}
