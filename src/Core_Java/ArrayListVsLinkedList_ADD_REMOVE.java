package Core_Java;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * Here manipulation performance different between
 * ArrayList vs LinkList
 *
 */
public class ArrayListVsLinkedList_ADD_REMOVE {

    public static void main(String[] args) {

        //ArrayList
        long startTime1 = System.nanoTime();
        ArrayList<String> al=new ArrayList<>();
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
        System.out.println("ArrayList Initial list of elements: "+al);
        //Removing specific element from arraylist
        al.remove("Vijay");
        System.out.println("ArrayList After invoking remove(object) method: "+al);
        //Removing element on the basis of specific position
        al.remove(0);
        System.out.println("ArrayList After invoking remove(index) method: "+al);
        ArrayList<String> all2=new ArrayList<>();
        all2.add("Ravi");
        all2.add("Hanumat");
        // Adding new elements to arraylist
        al.addAll(all2);
        System.out.println("ArrayList Updated list : "+al);
        long elapsedTime1 = System.nanoTime() - startTime1;
        System.out.println("ArrayList>>>"+elapsedTime1);

        //LinkedList

        long startTime2 = System.nanoTime();

        LinkedList<String> ll=new LinkedList<>();
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
        System.out.println("LinkedList Initial list of elements: "+ll);
        //Removing specific element from arraylist
        ll.remove("Vijay");
        System.out.println("LinkedList After invoking remove(object) method: "+ll);
        //Removing element on the basis of specific position
        ll.remove(0);
        System.out.println("LinkedList After invoking remove(index) method: "+ll);
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Ravi");
        ll2.add("Hanumat");
        // Adding new elements to arraylist
        ll.addAll(ll2);
        System.out.println("LinkedList Updated list : "+ll);

        long elapsedTime2 = System.nanoTime() - startTime2;
        System.out.println("LinkedList>>"+elapsedTime2);

    }
}
