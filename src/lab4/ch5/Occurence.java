package lab4.ch5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Occurence {

    private static Scanner scanner;
    public static void main(String[] args) {

        int counter = 0;
        try{
            scanner = new Scanner(new BufferedReader(new FileReader("./src/lab4/ch5/file") ));
            while(scanner.hasNext()) {
                String word = scanner.next();
                while(scanner.hasNext()) {
                    if(word.equals(scanner.next())) {
                        counter++;
                    }
                }

            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }


    }



}
