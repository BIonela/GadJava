package lab1;

public class Exercises {

    public void arrays() {
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(new String(copyTo));
    }

    public void copyOfRange() {
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom,2,9);

        System.out.println(new String(copyTo));
    }
}
