package org.brainypeople.eazy.practise;

import org.brainypeople.eazy.util.Util;

import java.util.ArrayList;
import java.util.List;

public class ClassC {

    public static void main (String[] args)
    {
        System.out.println(" Encrypted Password ::: "+ Util.hashPassword("password"));
        ClassA obj = new ClassB();
        obj.display();
        System.out.println(obj.getMyint());
        obj.doubleDisplay();
        System.out.println(obj.myint);

        String str = "asdfgh";
        List<String> strList = new ArrayList<String>();
        strList.add("a");
        strList.add("b");
//will give false, any argument which is not String will return false;
        System.out.println(strList.contains('a'));
        //will return true;
        System.out.println(strList.contains("a"));

        //will give false, any argument which is not String will return false;
        System.out.println(strList.contains(str.charAt(0)));

        //will return true;
        System.out.println(strList.contains(String.valueOf(str.charAt(0))));

//        List<Character> list = new ArrayList<Character>();
//        list.add('a');
//        list.add('b');
//        list.add('c');
//        list.contains(str.charAt(0));


//        System.out.println(list.contains('a'));
//        System.out.println(list.contains(str.charAt(0)));
    }

}
