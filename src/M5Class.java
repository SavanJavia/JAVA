public class M5Class {
    public static void main(String[] args) {

        System.out.println(callMethod());


    }

    private static int callMethod() {
        try {
            int i = 5/0;
            System.out.println("ERROR");
        } catch(ArithmeticException ae) {
            System.out.println("CATCH");
            return -1;
        } /*finally {
            System.out.println("FINALLY");
            return -2;
        }*/
        return -3; //NOT EXECUTE
    }
}
