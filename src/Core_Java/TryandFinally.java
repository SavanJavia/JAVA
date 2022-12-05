package Core_Java;

public class TryandFinally {
    public static void main(String[] args) {

        int x = extracted();
        System.out.println("last>"+x);

    }

    private static int extracted() {
        int i=0;

        try{
            System.out.println("TRY>"+i);
            return i;
        }finally {

            i++;
            System.out.println("finally>"+i);
        }
    }
}
