package Core_Java;

public class PatternPrint {
    public static void main(String[] args) {
        /*
        1
        12
        123
        1234
        12345
        */

        for (int i = 1; i <= 5; i++) {
            String k = "";
             for (int j = 1; j <= i; j++) {
                k = k + j;
            }
            System.out.println(k);
        }

    }
}
