import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumMovesCount {

    public static void main(String[] args) {

        List<Integer> arr1 = Arrays.asList(123, 543);
        List<Integer> arr2 = Arrays.asList(321, 279);

        int count = miniMoves(arr1,arr2);
        System.out.println(count);
    }

    private static int miniMoves(List<Integer> arr1, List<Integer> arr2) {
        int count=0;

        int[] a = arr1.stream().mapToInt(Integer::intValue).toArray();
        int[] b = arr2.stream().mapToInt(Integer::intValue).toArray();

        for (int i=0;i<a.length;i++) {

            String s1 = String.valueOf(a[i]);
            String s2 = String.valueOf(b[i]);

            for (int c=0;c<s1.length();c++) {

                int c1 = Integer.parseInt(String.valueOf(s1.charAt(c)));
                int c2 = Integer.parseInt(String.valueOf(s2.charAt(c)));

                if (c1 > c2) {
                    count+= c1 - c2;
                } else {
                    count+= c2 - c1;
                }
            }
        }

        return count;
    }


}
