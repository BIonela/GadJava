package lab8.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {

    public static List<String> toUppercase(List<String> words) {

        return words.stream().map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> res = toUppercase(Arrays.asList("abc","er","u","1234"));
        System.out.println(res);
    }
}
