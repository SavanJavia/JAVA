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

        ArrayList<String> al=new ArrayList<>();

        for(int i=1; i<= 100000; i++) {
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ajay");
            al.add("Anuj");
            al.add("Gaurav");
            al.add("Harsh");
            al.add("Virat");
            al.add("Gaurav");
            al.add("Harsh");
            al.add("Amit");
        }
            al.add("Ravia");
            al.add("Vijaya");
            al.add("Ajaya");
            al.add("Anuja");
            al.add("Gaurava");
            al.add("Harsha");
            al.add("Virata");
            al.add("Gaurava");
            al.add("Harsha");
            al.add("Amita");
        long elapsedTime1 = System.nanoTime() - startTime1;
        System.out.println("ArrayList>>>"+elapsedTime1);

        //LinkedList

        long startTime2 = System.nanoTime();

        LinkedList<String> ll=new LinkedList<>();
        for(int i=1; i<= 100000; i++) {
            ll.add("Ravi");
            ll.add("Vijay");
            ll.add("Ajay");
            ll.add("Anuj");
            ll.add("Gaurav");
            ll.add("Harsh");
            ll.add("Virat");
            ll.add("Gaurav");
            ll.add("Harsh");
            ll.add("Amit");
        }
            ll.add("Ravia");
            ll.add("Vijaya");
            ll.add("Ajaya");
            ll.add("Anuja");
            ll.add("Gaurava");
            ll.add("Harsha");
            ll.add("Virata");
            ll.add("Gaurava");
            ll.add("Harsha");
            ll.add("Amita");

        long elapsedTime2 = System.nanoTime() - startTime2;
        System.out.println("LinkedList>>"+elapsedTime2);



    }
}
