package lab8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {

    public static long ex1(List<String> strings) {
        long count = strings.stream()
                .flatMap(line -> {
                    return Stream.of(line.split(" "));
                })
                .count();
        return count;
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("My string 1","just one"));
        System.out.println(ex1(strings));
    }
}
