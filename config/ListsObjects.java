package config;
import java.util.*;
import models.*;
import java.io.*;

public class ListsObjects implements Serializable
{
    public ArrayList<Product> products = new ArrayList<Product>();
    public ArrayList<User> users = new ArrayList<User>();
    public LinkedList<Order> orders = new LinkedList<Order>();

    public ListsObjects() {
        try {
            FileInputStream fileCreationIN = new FileInputStream("config/database.ser");
            ObjectInputStream objectIN = new ObjectInputStream(fileCreationIN);
            ListsObjects list = (ListsObjects) objectIN.readObject();
            this.products = list.products;
            this.users = list.users;
            this.orders = list.orders;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try {
            FileOutputStream fileCreationOut = new FileOutputStream("config/database.ser");
            ObjectOutputStream objectOUT = new ObjectOutputStream(fileCreationOut);
            objectOUT.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }        
}
}