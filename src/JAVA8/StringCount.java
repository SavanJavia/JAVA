package JAVA8;

import java.util.*;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {

        {

            String input = "hello is a void great word is void hello void";
        /*void = 3
        hello = 2
        is = 2
        a = 1
        great = 1
        word = 1*/
            TreeMap<String,Integer> map1 = new TreeMap<>();

            String[] strArr = input.split(" ");

            for(int i=0;i<strArr.length;i++){

                if(map1.get(strArr[i])!=null){
                    map1.put(strArr[i],map1.get(strArr[i])+1);
                }else{
                    map1.put(strArr[i],1);
                }
            }

            List<Map.Entry<String, Integer>> l = map1.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .collect(Collectors.toList());

            System.out.println(l);

            Spliterator<Map.Entry<String, Integer>> spliterator1 = l.spliterator();
            Spliterator<Map.Entry<String, Integer>> spliterator2 = spliterator1.trySplit();
            System.out.println("========");
            spliterator1.forEachRemaining(System.out::println);
            System.out.println("========");
            spliterator2.forEachRemaining(System.out::println);
        }
    }
}