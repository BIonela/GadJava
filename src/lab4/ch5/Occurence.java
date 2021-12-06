package lab4.ch5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class Occurence {

    private static Scanner scanner;
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

        scanner = new Scanner(new BufferedReader(new FileReader("./src/lab4/ch5/file")));

        while(scanner.hasNext()) {
            String word = scanner.next();
            if (!Pattern.matches("\\p{Punct}", word)) {
                Integer count = wordCount.get(word);
                if (count == null) {
                    wordCount.put(word.toLowerCase(), 1);
                } else {
                    wordCount.put(word.toLowerCase(), count + 1);
                }
            }
        }

        Map<String, Integer> sorted = sortByValue(wordCount);

        for(Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hashMap) {
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer>>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> a : list) {
            temp.put(a.getKey(),a.getValue());
        }
        return temp;
    }

}
