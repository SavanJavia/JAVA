package JAVA8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeIntArray {
    public static void main(String[] args) {

        List<Integer> evenInt = Arrays.asList(2,4,6,8,10);
        List<Integer> oddInt = Arrays.asList(1,3,5,7,9);

        /*output
        List<Integer> IntList = {1,2,3,4,5,6,7,8,9,10};*/

        System.out.println(Stream.concat(evenInt.stream(),oddInt.stream()).sorted().collect(Collectors.toList()));


    }
}
