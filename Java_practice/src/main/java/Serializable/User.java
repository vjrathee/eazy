package Serializable;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    public static void sayHello(){
        System.out.println("User method sent hello");
    }


}
