import java.util.*;

public class ClassDate30 {

    public static void main(String[] args) {

        String inputStr = "successfully";
        //output: e

        extracted(inputStr);

        getCharacter(inputStr);

    }

    private static void getCharacter(String inputStr) {
        HashMap<Character,Integer>  characterhashtable =
                new LinkedHashMap<Character ,Integer>();
        int length ;
        Character ch = null;
        length= inputStr.length();  // Scan string and build hash table
        for (int i=0;i < length;i++)
        {
            ch = inputStr.charAt(i);
            if(characterhashtable.containsKey(ch))
            {
                // increment count corresponding to ch
                characterhashtable.put(  ch ,  characterhashtable.get(ch) +1 );
            }
            else
            {
                characterhashtable.put( ch , 1 ) ;
            }
        }
        for(Map.Entry<Character,Integer> entry: characterhashtable.entrySet())
        {
            if(entry.getValue() == 1)
                System.out.println(entry.getKey());
        }
        //System.out.println(ch);
    }

    private static void extracted(String inputStr) {
        for(char i : inputStr.toCharArray()) {
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: " + i);
               // break;
            }
        }
    }
}
