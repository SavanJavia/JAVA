import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class JAVA8_5thDec {

    //employ -->>

    public static void main(String[] args) {

        String str = "java is languages java";
        //output: i

        char[] c = str.toCharArray();

        for(int i =0;i<c.length;i++){

            if(str.indexOf(c[i]) == str.lastIndexOf(c[i])){
                System.out.println(c[i]);
                break;
            }

        }

        Map<Character,Integer> map = new LinkedHashMap();
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
        System.out.println(map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey());
    }
}
