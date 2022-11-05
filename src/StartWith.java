import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith {

    public static void main(String[] args) {

        List<String> s = new ArrayList<>();
        s.add("aab");
        s.add("vc");

        System.out.println(s.stream().filter(a -> a.startsWith("a")).collect(Collectors.toList()));
    }

}
