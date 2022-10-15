public class OverLoadingClass {

    public static void main(String[] args) {


    }
}


class Test{

    /**
     *  Compiler time exception due to
     * 'method(int, int)' clashes with 'method(int, int)'; both methods have same erasure
     */ //UNCOMMENT METHOD
    /*public void method(int a,int b){
        System.out.println(a+"<void method with 3 parameter>"+b);
    }*/

    public int method(int a,int b){
        System.out.println(a+"<int method with 2 parameter>"+b);
        return 1;
    }

    public int method(int a,int b,int c){
        System.out.println(a+"<int method with 3 parameter>"+b);
        return 1;
    }
}