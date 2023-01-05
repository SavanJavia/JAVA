package Core_Java;

public class FINALCLASS {

    public static void main(String[] args) {
        final int a;
        a = 1;
        System.out.println(a);
        //a = 2; compile time error

        final Integer a1; //IMMUTABLE
        a1 = 11;
        System.out.println(a1);
        //a1=12; compile time error

        final StringBuffer sb = new StringBuffer(); //MUTABLE
        sb.append("A");
        sb.append("B");

        System.out.println(sb);

    }
}
