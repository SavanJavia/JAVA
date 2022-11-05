import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List<String> s = new ArrayList<>();
        s.add("H");
        s.add("H");
        s.add("S");
        s.add("A");
        s.add("A");

        List a = s.stream().distinct().collect(Collectors.toList());

        System.out.println(a);

    }
}
