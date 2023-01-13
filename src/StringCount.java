import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCount {

    public static void main(String[] args) {
        String input = "savanjavia";

        System.out.println(Arrays.stream(input.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
