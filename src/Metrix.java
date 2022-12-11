import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Metrix {

    public static void main(String[] args) {

        int[][] array = {{2, 1, 9}, {10, 58, 5}};
        int input = 3; //get kth highest number form 2d Array

        int output = getHighestElement(array, input);
        System.out.println(output);
    }

    private static int getHighestElement(int[][] array, int input) {

        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= array.length; j++) {
                lst.add(array[i][j]);
            }
        }

        lst = lst.stream().sorted().collect(Collectors.toList());
        System.out.println(lst);
        return lst.get(input-1);
    }
}
