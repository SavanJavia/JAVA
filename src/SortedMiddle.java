import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortedMiddle {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4,3,2,1,5,6);

        TreeSet<Integer> ts = new TreeSet<>(lst);

        System.out.println(ts.stream().map (a -> a.intValue()).collect(Collectors.toList()).get((ts.size()/2)-1));
    }


}
