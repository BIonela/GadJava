package lab8.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static List<String> removeOdd(List<String> words) {

        return words.stream().filter(s -> (s.length() % 2 == 0))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> res = removeOdd(Arrays.asList("abc","er","u","1234"));
        System.out.println(res);
    }
}
