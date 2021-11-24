package lab4.ch4;

import java.util.Scanner;

public class NumberToLCD {

    static Scanner scanner = new Scanner(System.in);
    static String verticalLine = "|";
    static String underLine = "_";
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int reverse = 0;

        while(number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        numberToLCD(reverse, 5);

    }

    public static void numberToLCD(int reverse, int height) {
        while(reverse != 0) {
            int choice = reverse % 10;
            reverse = reverse / 10;
            switch (choice) {
                case 1:
                    if(height % 2 == 0) {
                        while (height > 0) {
                            System.out.println(verticalLine);
                            height--;
                        }
                    }else{
                        System.out.println();
                        while (height > 1) {
                            System.out.println(verticalLine);
                            height--;
                        }
                    }
                    break;
                case 2:
                    System.out.println(" " + underLine);
                    System.out.println(" " + underLine + verticalLine);
                    System.out.println(verticalLine + underLine);
                    break;
                case 3:
                    System.out.println(underLine);
                    System.out.println(underLine + verticalLine);
                    System.out.println(underLine + verticalLine);
                    break;
                case 4:
                    System.out.println();
                    System.out.println(verticalLine + "_" + verticalLine);
                    System.out.println("  " + verticalLine);
                    break;
                case 5:
                    System.out.println(" " + underLine);
                    System.out.println(verticalLine + underLine);
                    System.out.println(" " + underLine + verticalLine);
                    break;
                case 6:
                    System.out.println(" " + underLine);
                    System.out.println(verticalLine + underLine);
                    System.out.println(verticalLine + underLine + verticalLine);
                    break;
                case 7:
                    System.out.println(underLine);
                    System.out.println(" " + verticalLine);
                    System.out.println(" " + verticalLine);
                    break;
                case 8:
                    System.out.println(" " + underLine);
                    System.out.println(verticalLine + underLine + verticalLine);
                    System.out.println(verticalLine + underLine + verticalLine);
                    break;
                case 9:
                    System.out.println(" " + underLine);
                    System.out.println(verticalLine + underLine + verticalLine);
                    System.out.println(" " + underLine + verticalLine);
                default:
                    break;
            }
        }
    }



}
