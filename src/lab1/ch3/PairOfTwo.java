package lab1.ch3;

import java.util.ArrayList;

public class PairOfTwo {

    public static void main(String[] args) {
        int [] array = {3,2,-3,-2,3,0};
        int pairs = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if((array[i]+array[j]) == 0){
                    pairs++;
                    //System.out.println("Pair with sum 0 is " + array[i] + "," + array[j]);
                    arrayList.add(array[i]);
                    arrayList.add(array[j]);

                }
            }
        }

        //System.out.println(arrayList);

        int duplicate = 0;

        for(int i = 0; i < arrayList.size(); i++) {
            for(int j = i + 1; j < arrayList.size(); j++) {
                if(arrayList.get(i).equals(arrayList.get(j))){
                    duplicate++;
                    break;
                }
            }
        }

        System.out.println((pairs - (duplicate/2)));

    }
}
