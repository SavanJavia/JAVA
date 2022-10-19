public class CollectMatchStringCount {

    public static void main(String[] args) {
        /*Program to count occurrence of a given String in a string.

                Input :
        Ex1 - str = "Accolite Digital" Find The Count = 'a'
        Output : 2

        Ex2 - str = "accolite digital account" Find The Count = “ac”
        Output : 2

        Ex3 - str = "digit digital account" Find The Count = “dig”
        Output : 2*/

        String str = "Accolite Digital";
        String str1 = "a";

       /* String str = "accolite digital account";
        String str1 = "ac";*/

      /*  String str = "digit digital account";
        String str1 = "dig";*/

        System.out.println(subsrting_rec(str.toLowerCase(), str1.toLowerCase()));

    }

    /**
     * Recursive Method using replaceFirst method
     *
     * @param str
     * @param sub
     * @return
     */
    static int subsrting_rec(String str, String sub){
        if (str.contains(sub)){
            return 1 + subsrting_rec(str.replaceFirst(sub, ""), sub);
        }
        return 0;
    }
}
