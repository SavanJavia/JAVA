import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class6thDec2022 {
   /* Given a String, find the first non-repeated character in it using Stream functions?*/

    public static void main(String[] args) {

        String input = "javaislanguagejava";

        //output:i

        Map<Character,Integer> hm = new LinkedHashMap<>();
        char[] c = input.toCharArray();

       /* for(int i=0;i<c.length;i++) {
            Character ch = c[i];

            if(input.indexOf(ch) == input.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }

        }*/

        for(int i=0;i<c.length;i++){
            Character ch = c[i];
            hm.put(ch,hm.containsKey(ch)?hm.get(ch)+1:1);
        }

        //j -2, i -1
        //System.out.println(hm);
        System.out.println(hm.entrySet().stream().filter(element -> element.getValue()==1).findFirst().get().getKey());



    }
}
