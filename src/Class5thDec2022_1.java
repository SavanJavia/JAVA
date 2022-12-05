import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class5thDec2022_1 {
    public static void main(String[] args) {

       /* Given an array of integers nums and an integer target, return indices of the two
        numbers such that they add up to target. You may assume that each input would have exactly
        one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6*/

        List<Integer> input = Arrays.asList(2,7,11,15);
        int target = 9;//[0, 1]

        List<Integer> input1 = Arrays.asList(3,2,4);
        int target1 = 6;//[1,2]

        List<Integer> input2 = Arrays.asList(3,3);
        int target2 = 6;//[0, 1]


        List<Integer> lst =  methodABC(input2,target2);
        System.out.println(lst);

    }

    private static List<Integer> methodABC(List<Integer> input, int target) {

        List<Integer> lst;
        int sum = 0;

        for(int i=0;i<input.size();i++){
            for(int j=1;j<input.size();j++){

                sum = input.get(i) + input.get(j);
                lst = Arrays.asList(i,j);
                if(sum == target){
                    System.out.println(sum);
                    return  lst;
                }
                sum = 0;
                lst = new ArrayList<>();
            }
        }
        return null;
    }
}
