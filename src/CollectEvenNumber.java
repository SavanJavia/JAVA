import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEvenNumber {

    public static void main(String[] args) {

       /* List 1 2 3 4 5 6 7 8 values
        Output :- 2 4 6 8*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        List<Integer> output = list.stream().filter(a -> a%2==0).collect(Collectors.toList());
        System.out.println(output);
    }
}
