package org.example;

import java.io.*;

public class DataReader {
    public static void main(String[] args) {

        File file = new File("C:\\projects\\Java_practice\\src\\main\\java\\org\\example\\sample");

        //BufferedReader br = new BufferedReader(new FileReader(file));
        // here it is giving pre compilation warning

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while(br.readLine() != null)
                System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}