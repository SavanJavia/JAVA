package Core_Java;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length()==b.length())
        {
            int[] arr = new int[256];
            int[] brr = new int[256];
            for (int i = 0; i < a.length(); i++)
            {
                arr[(int) a.charAt(i)] += 1;
               // System.out.println(arr[(int) a.charAt(i)]);
                brr[(int) b.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++)
            {
                if (arr[i] != brr[i])
                    return false;
            }
            return true;
        }
        else
        {
            return false;
        }
    }

   /* anagram
            margana*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
