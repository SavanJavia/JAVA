public class M4Class {
    public static void main(String[] args) {

      /*  Ambiguous method call. Both
                sum(int,long) in M4Class and
                sum(long,int) in M4Class match
      */

       //FOR CHECK OPEN THIS COMMENT
        // sum(2,3);

    }

    /*static void sum(int a, int b){
        System.out.println(a+b);
    }*/
    void sum(int a, long b){
        System.out.println(a+b);
    }
    void sum(long a, int b){
        System.out.println(a+b);
    }


}
