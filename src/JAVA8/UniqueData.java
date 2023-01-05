package JAVA8;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueData {
    public static void main(String[] args) {

       /* Merge two arrays into one with only Unique numbers been printed. The output should be in ascending order.*/

                List<Integer> l1 = Arrays.asList(1, 2, 22, 48, 87,3, 4, 5);
                List<Integer> l2 = Arrays.asList(5, 6, 7, 48, 22);

                List<Integer> list = new ArrayList<>();
                list.addAll(l1);
                list.addAll(l2);

                System.out.println(list.stream().sorted().distinct().collect(Collectors.toList()));
    }
}
