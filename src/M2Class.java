public class M2Class {
    public static void main(String[] args) {
        int i = 100;
        int j = 100;
        int a = 500;
        int b = 500;

        Integer i1 = 100;
        Integer j1 = 100;
        Integer a1 = 500;
        Integer b1 = 500;

        if(i==j){
            System.out.println("FIRST");
        }

        if(a==b){
            System.out.println("SECOND");
        }


        if(i1==j1){
            System.out.println("FIRST-1");
        }

        if(i1.equals(j1)){
            System.out.println("equals FIRST-1");
        }

        /*Java maintains Integer pool from -128 to 127*/

        if(a1==b1){
            System.out.println("SECOND-1");
        }
        if(a1.equals(b1)){
            System.out.println("equals SECOND-1");
        }

        Integer a2 = new Integer(128);
        Integer b2 =  new Integer(128);

        if(a2==b2){
            System.out.println("SECOND-2");
        }
        if(a2.equals(b2)){
            System.out.println("equals SECOND-2");
        }


    }
}
