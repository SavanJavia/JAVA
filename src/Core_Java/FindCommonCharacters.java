package Core_Java;

import java.util.HashSet;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String first = "abcbcda";
        String second = "cdefefa";

        //cd
        String common = commonCharacters(first, second);
        System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");

    }

    public static String commonCharacters(String a, String b) {

        HashSet<String> hs = new HashSet<>();


        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        for (char c:c1) {

            for (char c0 : c2) {

                if(c == c0){
                   hs.add(String.valueOf(c));
                }
            }

        }

        return String.join("", hs);
    }
}
