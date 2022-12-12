package Core_Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinedListOrder {
    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<>();
        lst.add(1);
        lst.add(10);
        lst.add(8);
        lst.add(7);
        lst.add(6);
        lst.add(4);
        lst.add(5);
        lst.add(2);
        lst.add(9);
        lst.add(3);

        System.out.println(lst);

        List<String> lst1 = new ArrayList<>();
        lst1.add("A");
        lst1.add("C");
        lst1.add("D");
        lst1.add("B");

        System.out.println(lst1);
    }
}
