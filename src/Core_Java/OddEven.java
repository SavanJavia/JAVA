package Core_Java;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {

        String[] strArray = {"20","22","23","31"};

        Arrays.stream(strArray).mapToInt(a->Integer.parseInt(a)).filter(a->a%2==0).forEach(System.out::println);
        Arrays.stream(strArray).mapToInt(a->Integer.parseInt(a)).filter(a->a%2!=0).forEach(System.out::println);
    }
}
