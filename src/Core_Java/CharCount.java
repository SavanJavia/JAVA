package Core_Java;

import java.util.Arrays;
import java.util.List;

public class CharCount {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
       // list.stream().filter(a->(a % 2==0)).forEach(System.out::println);



       /* StringBuilder sb = new StringBuilder(input);
        sb.reverse();*/

        String input = "aaabbbbdccccc";
        //output : 3a3b4c

        char[] c = input.toCharArray();
        int count =1;
        String str = "";
        String output="";
        String output1="";

        for(int i=0;i<c.length;i++){
            if(i==0) {
                str = String.valueOf(c[i]);
            }else{
                str = String.valueOf(c[i-1]);
            }
            if (!str.equals(String.valueOf(c[i]))) {
                output1 = output;
                count=1;
            }

            output = output1 +""+c[i]+""+count;
            count++;
        }
        System.out.print(output);//a3b4d1c5
    }
}
