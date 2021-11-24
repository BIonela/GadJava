package lab6.ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static List merge(List<Integer> list1, List<Integer> list2) {
        ArrayList toReturn = new ArrayList();

        Iterator<Integer> i1 = list1.iterator();
        Iterator<Integer> i2 = list2.iterator();

        int current1 = i1.next();
        int current2 = i2.next();
        while(i2.hasNext() && i2.hasNext()) {
            if(current1 < current2) {
                toReturn.add(current1);
                current1 = i1.next();
            }else{
                toReturn.add(current2);
                current2 = i2.next();
            }
        }

        Integer last;
        Iterator<Integer> lastIterator;
        int current;

        if(current1 < current2) {
            toReturn.add(current1);
            last = current2;
        }else{
            toReturn.add(current2);
            last = current1;
        }

        if(i1.hasNext()) {
            lastIterator = i1;
        }else{
            lastIterator = i2;
        }

        while(lastIterator.hasNext()) {
            current = lastIterator.next();
            if(last != null && last < current){
                toReturn.add(last);
                last=null;
            }
            toReturn.add(current);
        }

        return toReturn;
    }

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,5,6));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(2,3,4));

        System.out.println(merge(l1,l2));
        l1.addAll(Arrays.asList(7,8,9));
        System.out.println(merge(l1,l2));

        //equal length
        //first longer
        //second longer
        //first empty
        //second empty
        //both empty

    }

}
