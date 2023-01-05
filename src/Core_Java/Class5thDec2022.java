package Core_Java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Class5thDec2022 {

   /* Given an unsorted integer array nums, return the smallest missing positive integer.

            Example 1:
    Input: nums = [1,2,0]
    Output: 3
    Explanation: The numbers in the range [1,2] are all in the array.

            Example 2:
    Input: nums = [3,4,-1,1]
    Output: 2
    Explanation: 1 is in the array but 2 is missing.

    Example 3:
    Input: nums = [7,8,9,11,12]
    Output: 1
    Explanation: The smallest positive integer 1 is missing.*/


    public static void main(String[] args) {

        int[] e1 = new int[]{2,0,1};//3
        //int[] e1 = new int[]{3,4,-1,1};//2
        //int[] e1 = new int[]{7,8,9,11,12};//1
       boolean flag;

       for(int i=1;;i++) {
           flag = false;
           for (int j = 0; j < e1.length; j++) {
               int z = e1[j];
               if (z == i) {
                   flag = true;
                   break;
               }
           }
           if (!flag) {
               System.out.println(i);
               break;
           }
       }
    }
}
