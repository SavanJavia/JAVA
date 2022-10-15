import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * Here inserting performance different between
 * ArrayList vs LinkList
 *
 */
public class ArrayListVsLinkedList_ADD {

    public static void main(String[] args) {

        //ArrayList
        long startTime1 = System.nanoTime();
        ArrayList al = new ArrayList<>();

        for(int i=1; i<= 1000000; i++){
            al.add(i);
        }
        long elapsedTime1 = System.nanoTime() - startTime1;
        System.out.println("ArrayList>>>"+elapsedTime1);

        //LinkedList

        long startTime2 = System.nanoTime();

        LinkedList ll = new LinkedList<>();

        for(int j=1; j<= 1000000; j++){
            ll.add(j);
        }

        long elapsedTime2 = System.nanoTime() - startTime2;
        System.out.println("LinkedList>>"+elapsedTime2);



    }
}
