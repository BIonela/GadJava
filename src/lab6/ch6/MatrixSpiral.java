package lab6.ch6;

import java.util.Arrays;
import java.util.LinkedList;

public class MatrixSpiral {

    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> linkedLists = new LinkedList<LinkedList<Integer>>();
//        linkedLists.add(new LinkedList<Integer>(Arrays.asList(1, 2, 3)));
//        linkedLists.add(new LinkedList<Integer>(Arrays.asList(4, 5, 6)));
//        linkedLists.add(new LinkedList<Integer>(Arrays.asList(7, 8, 9)));

        linkedLists.add(new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4)));
        linkedLists.add(new LinkedList<Integer>(Arrays.asList(5, 6, 7, 8)));
        linkedLists.add(new LinkedList<Integer>(Arrays.asList(9, 10, 11, 12)));
        linkedLists.add(new LinkedList<Integer>(Arrays.asList(13, 14, 15, 16)));

        int top = 0;
        int right = linkedLists.indexOf(linkedLists.getLast());
        int bottom = linkedLists.indexOf(linkedLists.getLast());
        int left = 0;
        String direction = "right";

        while (top <= bottom && left <= right) {

            if (direction.equals("right")) {
                for (int j = left; j <= right; j++) {
                    System.out.print(linkedLists.get(top).get(j) + " ");
                }
                direction = "down";
                top++;
            } else if (direction.equals("down")) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(linkedLists.get(i).get(right) + " ");
                }
                direction = "left";
                right--;
            } else if (direction.equals("left")) {
                for (int j = right; j >= left; j--) {
                    System.out.print(linkedLists.get(bottom).get(j) + " ");
                }
                direction = "up";
                bottom--;
            } else if (direction.equals("up")) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(linkedLists.get(i).get(left) + " ");
                }
                left++;
                direction = "right";
            }
        }
    }
}


