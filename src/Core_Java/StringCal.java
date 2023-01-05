package Core_Java;

import java.util.HashMap;

public class StringCal {

    //A4B4C3
    public static void main(String[] args) {
        String s = "AAABBCCCABB";
        char[] c = s.toCharArray();

        HashMap<Character,Integer> map =new HashMap<>();

        for(char ch : c){
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch,count+1);
            }else{
                map.put(ch,1);
            }
        }

        for(char c1: map.keySet()){
            System.out.print(c1+""+map.get(c1));
        }

    }
}
