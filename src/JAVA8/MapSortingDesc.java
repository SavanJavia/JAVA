package JAVA8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapSortingDesc {
    public static void main(String[] args) {

      /*  Need to sort the unsorted Map in desc based on key*/

        Map<String,Integer> m= new HashMap<>();
        m.put("D",123);
        m.put("C",012);
        m.put("A",345);
        m.put("B",345);

        Map<String,Integer> ts = new TreeMap<>(m);

        ts.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach(System.out::println);
    }
}