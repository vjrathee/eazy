package Deserializable;

import Serializable.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;
        FileInputStream fileIn = new FileInputStream
                ("C:\\projects\\Java_practice\\src\\main\\resources\\userinfo.ser");
        ObjectInputStream inObject = new ObjectInputStream(fileIn);
        user = (User) inObject.readObject();
        inObject.close();
        fileIn.close();

        System.out.println("the deserialize user is   :   "+ user.);
    }
}
