package Core_Java;

import java.util.Arrays;
import java.util.HashSet;

public class SingleStr {



    public static void main(String[] args) {
        String str = "aapwebfbplfrls";
        //output: wers
        String temp = "";
        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }
        }

        System.out.println(temp + " ");
    }

}
