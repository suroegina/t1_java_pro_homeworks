package org.example.lessons.les2.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("File.txt");
        InputStream in = new

                FileInputStream(file);

        try {
            //System.out.println(division(6, 2));
            System.out.println(division(6, 0));
            //System.out.println("Program Completed");
        } catch (IllegalArgumentException e) {
            System.out.println("Рассчитать не удалось? пусть будет единица!");
        }

    }

    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b is zero!");
        }
        return a / b;
    }
}
