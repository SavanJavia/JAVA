package Core_Java;

public class TryFinallyClass {

    public static void main(String[] args) {

        int a = method();

        System.out.println(a);

    }

    private static int method() {
        try{
            System.out.println("TRY");

            return 1;

        }finally {
            System.out.println("FINALLY");

           // return 2;
        }
    }
}
