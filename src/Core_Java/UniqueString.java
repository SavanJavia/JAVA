package Core_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class UniqueString {
    public static void main(String[] args) {
        String input = "abc";
        //abc,bca,cab,acb,bac,cba

        char[] c = input.toCharArray();
        int strLength = c.length;

        int position = 0;
        extracted(c,new char[strLength],strLength, position);

    }

    private static void extracted(char[] c, char[] c1, int strLength,int position) {
        if(strLength == position){

            String str = String.copyValueOf(c1);
            char[] temp = str.toCharArray();
            Arrays.sort(temp);

            if(String.copyValueOf(temp).equalsIgnoreCase(String.copyValueOf(c))) {
                String str1 = new String(c1);
                System.out.println(str1);
            }

          return;
        }

        for(int j=0;j<c.length;j++) {
            c1[position] = c[j]; //abc//aab//aaa//

            extracted(c, c1, strLength, position + 1);
        }
    }
}
