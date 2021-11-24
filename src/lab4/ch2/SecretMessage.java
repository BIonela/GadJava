package lab4.ch2;

import java.io.*;
import java.net.URL;

public class SecretMessage {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/message.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        int c = 0;
        while ((c = bufferedReader.read()) != -1) {
            char character = (char) c;
            if(Character.isUpperCase(character)) {
                if(character == 'X') {
                    character = ' ';
                }
                System.out.print(character);
            }
        }
    }
}
