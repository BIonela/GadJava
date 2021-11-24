package lab4.ch1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook("./src/lab4/ch1/contacts");
        System.out.println(phoneBook);
        System.out.println(phoneBook.findContact("Abbey"));
        storeContactToFile("./src/lab4/ch1/findContacts.txt",phoneBook.findContact("Abbey"));

    }

    public static void storeContactToFile(String fileName,Contact contact) {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(contact.toString());
            if(bufferedWriter != null) {
                bufferedWriter.close();
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
