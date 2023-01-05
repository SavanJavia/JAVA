package JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectUniqueNumber {
    public static void main(String[] args) {
       /* Print unique numbers from list by using stream
        List 1 2 3 4 5 6 1 7 2 8 3
        Output: 1 2 3 4 5 6 7 8*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(3);

        List<Integer> output = list.stream().distinct().collect(Collectors.toList());

        System.out.println(output);
     }
}
