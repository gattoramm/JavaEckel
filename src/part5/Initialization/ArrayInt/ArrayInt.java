package part5.Initialization.ArrayInt;

import java.util.Arrays;

public class ArrayInt {
    public static void main(String[] args) {
        Integer[] a = { new Integer(1), new Integer(2), 3, }; //Autoboxing
        Integer[] b = new Integer[]{ new Integer(1), new Integer(2), 3, };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
