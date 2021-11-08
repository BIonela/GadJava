package lab1.ch4;

import java.util.ArrayList;

public class PairOfThree {

    public static void main(String[] args) {

        int[] array = {-1, -1, -1, 2};
        int pairs = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if ((array[i] + array[j]) + array[k] == 0) {
                        pairs++;
                        //System.out.println("Pair with sum 0 is " + array[i] + "," + array[j] + "," + array[k]);
                        arrayList.add(array[i]);
                        arrayList.add(array[j]);
                        arrayList.add(array[k]);

                    }
                }
            }
        }

        //System.out.println(arrayList);

        int duplicate = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 2; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    duplicate++;
                    break;
                }


            }
        }

        System.out.println((pairs - (duplicate / 3)));

    }
}
