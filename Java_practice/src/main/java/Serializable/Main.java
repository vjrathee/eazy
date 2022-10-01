package Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        // User user = new User("basant", "hellobasant"); // red line here
        // because when no constructor is specified in object class
        // then JVM provides default constructor, having no parameters

        User user = new User();
        user.name = "basant";
        user.password ="hellobasant";
        FileOutputStream fileOut = new FileOutputStream("C:\\projects\\Java_practice\\src\\main\\resources\\userinfo.ser");
        ObjectOutputStream outObject = new ObjectOutputStream(fileOut);
        outObject.writeObject(user);
        outObject.close(); fileOut.close();
    }
}
