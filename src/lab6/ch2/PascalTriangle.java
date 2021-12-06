package lab6.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numRows = scanner.nextInt();

        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) {
            System.out.println(result);
        }
        result.add(Arrays.asList(1));
        List<Integer> resultSet;

        for(int i = 1; i <  numRows; i++) {
            resultSet = new ArrayList<>();

            resultSet.add(1);
            List<Integer> prevRow = result.get(i-1);
            for(int j = 1; j < i; j++) {
                resultSet.add(prevRow.get(j-1) + prevRow.get(j));
            }
            resultSet.add(1);
            result.add(resultSet);
        }

        for(int i = 0; i< result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

}
