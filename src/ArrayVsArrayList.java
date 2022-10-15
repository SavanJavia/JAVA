import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * The capacity of an Array is fixed.
 * Whereas ArrayList can increase and decrease size dynamically.
 *
 * An Array is a collection of similar items.
 * Whereas ArrayList can hold item of different types.
 *
 * An array is faster and that is because ArrayList uses a fixed amount of array.
 * However when you add an element to the ArrayList and it overflows.
 * It creates a new Array and copies every element from the old one to the new one.
 */
public class ArrayVsArrayList {

    public static void main(String[] args) {
        //ARRAY
        long startTime1 = System.nanoTime();

        int array[] = new int [1000000];
        for (int a = 0; a < array.length; a++){
            array[a] = a;
        }

        long elapsedTime1 = System.nanoTime() - startTime1;
        System.out.println("Array>>"+elapsedTime1);

        //ArrayList
        long startTime2 = System.nanoTime();
        ArrayList al = new ArrayList<>();

        for(int i=1; i<= 1000000; i++){
           al.add(i);
        }
        long elapsedTime2 = System.nanoTime() - startTime2;
        System.out.println("ArrayList>>"+elapsedTime2);
    }
}
