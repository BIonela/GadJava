package lab4.ch4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberToLCD {

    private static final String none = "   ";
    private static final String right = "  |";
    private static final String left = "|  ";
    private static final String both = "| |";
    private static final String middle = " _ ";
    private static final String middleRight = " _|";
    private static final String middleLeft = "|_ ";
    private static final String all = "|_|";
    private static Map<Integer, String[]> numbers;
    private static Scanner scanner = new Scanner(System.in);

    public NumberToLCD() {
        numbers = new HashMap<Integer, String[]>();
        numbers.put(0, new String[]{middle, both, all});
        numbers.put(1, new String[]{none, right, right});
        numbers.put(2, new String[]{middle, middleRight, middleLeft});
        numbers.put(3, new String[]{middle, middleRight, middleRight});
        numbers.put(4, new String[]{all, right});
        numbers.put(5, new String[]{middle, middleLeft, middleRight});
        numbers.put(6, new String[]{middle, middleLeft, all});
        numbers.put(7, new String[]{middle, right, right});
        numbers.put(8, new String[]{middle, all, all});
        numbers.put(9, new String[]{middle, all, middleRight});


//        for(Integer key: numbers.keySet()) {
//            print(numbers.get(key));
//        }

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;


        if(number / 10 == 0) {
            choicePrint(number);
        }else{
            while(number != 0) {
                reversed = reversed * 10 + number % 10;
                number = number / 10;
            }
            while (reversed != 0) {
                int lastDigit = reversed % 10;
                reversed = reversed / 10;
                choicePrint(lastDigit);
            }
        }
    }


    public static void print(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void choicePrint(int choice) {
        switch (choice) {
            case 1:
                print(numbers.get(1));
                break;
            case 2:
                print(numbers.get(2));
                break;
            case 3:
                print(numbers.get(3));
                break;
            case 4:
                print(numbers.get(4));
                break;
            case 5:
                print(numbers.get(5));
                break;
            case 6:
                print(numbers.get(6));
                break;
            case 7:
                print(numbers.get(7));
                break;
            case 8:
                print(numbers.get(8));
                break;
            case 9:
                print(numbers.get(9));
                break;
            case 0:
                print(numbers.get(0));
                break;
            default:
                break;
        }
    }

}
