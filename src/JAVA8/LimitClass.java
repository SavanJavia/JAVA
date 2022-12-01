package JAVA8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitClass {

    public static void main(String[] args) {
        List<String> list = generateElements();

        System.out.println(list);
    }

    public static List<String> generateElements() {
        return Stream.generate(() -> "Java")
                .limit(12)
                .collect(Collectors.toList());
    }
}

