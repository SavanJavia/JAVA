package Core_Java;

public class ReversedString {
    public static void main(String[] args) {

        String str = "this is a java test";
        //output: test java a is this


        String words[] = str.split("\\s");
        String reversedString = "";

        //Reverse each word's position
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }

        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }

}
