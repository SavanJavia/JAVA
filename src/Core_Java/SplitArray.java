package Core_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SplitArray {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {

        int numberOfArrays = array.length / splitSize;
        int remainder = array.length % splitSize;

        int start =0;
        int end =0;

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < numberOfArrays; i++) {
            end += splitSize;
            list.add(Arrays.copyOfRange(array, start, end));
            start = end;
        }

        if(remainder>0){
            list.add(Arrays.copyOfRange(array, start, start+remainder));
        }


        return list;
    }
}
