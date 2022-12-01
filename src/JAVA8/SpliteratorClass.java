package JAVA8;

import java.util.*;

public class SpliteratorClass {
    public static void main(String[] args) {

        List<String> list = LimitClass.generateElements();

        Spliterator<String> spliterator = list.spliterator();

        int expected = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;

        System.out.println(spliterator.characteristics() == expected);  //true

        if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
            System.out.println("ORDERED");
        }

        if (spliterator.hasCharacteristics(Spliterator.DISTINCT)) {
            System.out.println("DISTINCT");
        }

        if (spliterator.hasCharacteristics(Spliterator.SORTED)) {
            System.out.println("SORTED");
        }

        if (spliterator.hasCharacteristics(Spliterator.SIZED)) {
            System.out.println("SIZED");
        }

        if (spliterator.hasCharacteristics(Spliterator.CONCURRENT)) {
            System.out.println("CONCURRENT");
        }

        if (spliterator.hasCharacteristics(Spliterator.IMMUTABLE)) {
            System.out.println("IMMUTABLE");
        }

        if (spliterator.hasCharacteristics(Spliterator.NONNULL)) {
            System.out.println("NONNULL");
        }

        if (spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            System.out.println("SUBSIZED");
        }

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator.getExactSizeIfKnown());

        SortedSet<String> set = new TreeSet<>( Collections.reverseOrder() );

        set.add("A");
        set.add("D");
        set.add("C");
        set.add("B");

        System.out.println(set);

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");
        list1.add("G");

        Spliterator<String> spliterator1 = list1.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        System.out.println("========");
        spliterator1.forEachRemaining(System.out::println);

        System.out.println("========");

        spliterator2.forEachRemaining(System.out::println);
    }
}
