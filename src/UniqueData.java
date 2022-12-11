import java.util.*;
import java.util.stream.Collectors;

public class UniqueData {
    public static void main(String[] args) {


       /* Merge two arrays into one with only Unique numbers been printed. The output should be in ascending order.*/

                List<Integer> l1 = Arrays.asList(1, 2, 22, 48, 87,3, 4, 5);

                List<Integer> l2 = Arrays.asList(5, 6, 7, 48, 22);

                Set<Integer> output = new HashSet<>();

        for(int i =0;i<l1.size();i++){

            output.add(l1.get(i));

        }
        for(int i =0;i<l2.size();i++){

            output.add(l2.get(i));

        }

        System.out.println(output.stream().sorted().collect(Collectors.toList()));




    }
}
