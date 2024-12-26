package config;
import java.io.*;

public class SerializableLists {
    
    private FileOutputStream fileCreationOut;
    private FileInputStream fileCreationIN;
    private ObjectOutputStream objectOUT;
    private ObjectInputStream objectIN;

    public SerializableLists() {
        try {
            fileCreationOut = new FileOutputStream("config/database.ser");
            fileCreationIN = new FileInputStream("config/database.ser");
            objectOUT = new ObjectOutputStream(fileCreationOut);
            objectIN = new ObjectInputStream(fileCreationIN);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void input(Object object) {
        try {
            objectOUT.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void output(Object object) {
        try {
            object = (Object) objectIN.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
