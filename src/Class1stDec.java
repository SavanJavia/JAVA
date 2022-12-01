import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Class1stDec {
    public static void main(String[] args) {

        String input = "HELLOHLLO";

        char[] c = input.toCharArray();

       for(int i=0;i<c.length;i++){

            if(input.indexOf(c[i]) == input.lastIndexOf(c[i])){
                System.out.println(c[i]);
                break;
            }
        }



    }
}
