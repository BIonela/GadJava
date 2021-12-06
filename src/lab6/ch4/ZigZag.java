package lab6.ch4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ZigZag {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(4,3,7,8,6,2,1));
        System.out.println(linkedList);

        for(int i = 0; i < linkedList.size(); i++) {
            for(int j = i+1; j < linkedList.size(); j++) {
                if(i % 2 == 0) {
                    if (linkedList.get(i) > linkedList.get(j)) {
                        Collections.swap(linkedList, i, j);
                    }
                }else{
                    if (linkedList.get(i) < linkedList.get(j)) {
                        Collections.swap(linkedList,i, j);
                    }
                }
                break;
            }
        }
        System.out.println(linkedList);
    }
}
