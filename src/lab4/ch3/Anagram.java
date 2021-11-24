package lab4.ch3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    private static Scanner scanner;

    public static void main(String[] args) throws IOException {
        String listen = "listen";
        char[] listenArray = listen.toCharArray();
        Arrays.sort(listenArray);
        //print(listenArray);

        URL url = new URL("https://raw.githubusercontent.com/dwyl/english-words/master/words_alpha.txt");

        // scanner = new Scanner(new BufferedReader(new FileReader("./src/lab4/ch3/anagram")));
        scanner = new Scanner(new BufferedReader(new InputStreamReader(url.openStream())));

        while (scanner.hasNext()) {
            int counter = 0;
            char[] letters = scanner.next().toCharArray();
            char[] lettersUnsorted = Arrays.copyOf(letters, letters.length);
            if (listenArray.length == letters.length) {
                Arrays.sort(letters);
                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] == listenArray[i]) {
                        counter++;
                    }
                    if (counter == letters.length) {
                        FileWriter fileWriter = new FileWriter("./src/lab4/ch3/output.txt",true);
                        fileWriter.write(returnLetter(lettersUnsorted) + " ");
                        fileWriter.close();
                        print(lettersUnsorted);
                        System.out.println();
                    }
                }
            }
        }
    }

    public static void print(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static String returnLetter(char[] array) {
        String toReturn = "";
        for (int i = 0; i < array.length; i++) {
            toReturn = toReturn + array[i];
        }
        return toReturn;
    }

}
