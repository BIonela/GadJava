package lab6.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BellTriangle {

    public static void createArrayList() {
        System.out.print("Enter number of rows: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();

        //MANUAL SOLUTION FOR NUMBER OF ROWS = 5

//        arrayList.add(0, new ArrayList<Integer>(Arrays.asList(1)));
//        arrayList.add(1, new ArrayList<>(Arrays.asList(arrayList.get(0).get(arrayList.get(0).size() - 1))));
//        arrayList.get(1).addAll(Arrays.asList(arrayList.get(0).get(0) + arrayList.get(0).get(0)));
//        arrayList.add(2,new ArrayList<Integer>(Arrays.asList(arrayList.get(1).get(arrayList.get(1).size() - 1))));
//        arrayList.get(2).addAll(Arrays.asList((arrayList.get(1).get(0) + arrayList.get(2).get(0))));
//        arrayList.get(2).addAll(Arrays.asList((arrayList.get(1).get(1) + arrayList.get(2).get(1))));
//        arrayList.add(3, new ArrayList<>(Arrays.asList((arrayList.get(2).get(arrayList.size() - 1)))));
//        arrayList.get(3).addAll(Arrays.asList(arrayList.get(2).get(0) + arrayList.get(3).get(0)));
//        arrayList.get(3).addAll(Arrays.asList(arrayList.get(2).get(1) + arrayList.get(3).get(1)));
//        arrayList.get(3).addAll(Arrays.asList(arrayList.get(2).get(2) + arrayList.get(3).get(2)));
//        arrayList.add(4, new ArrayList<>(Arrays.asList(arrayList.get(3).get(arrayList.get(3).size() - 1))));
//        arrayList.get(4).addAll(Arrays.asList(arrayList.get(3).get(0) + arrayList.get(4).get(0)));
//        arrayList.get(4).addAll(Arrays.asList(arrayList.get(3).get(1) + arrayList.get(4).get(1)));
//        arrayList.get(4).addAll(Arrays.asList(arrayList.get(3).get(2) + arrayList.get(4).get(2)));
//        arrayList.get(4).addAll(Arrays.asList(arrayList.get(3).get(3) + arrayList.get(4).get(3)));

        //SOLUTION FOR ANY NUMBER OF ROWS

        arrayList.add(0, new ArrayList<>(Arrays.asList(1)));
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(j == 0) {
                    arrayList.add(i, new ArrayList<>(Arrays.asList(arrayList.get(i-1).get(arrayList.get(i-1).size() - 1))));
                }
                arrayList.get(i).addAll(Arrays.asList(arrayList.get(i-1).get(j) + arrayList.get(i).get(j)));
            }
        }
        print(arrayList,n);
    }

    public static void print(ArrayList<ArrayList<Integer>> arrayList, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(arrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        createArrayList();
    }

}
