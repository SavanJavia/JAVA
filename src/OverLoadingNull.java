public class OverLoadingNull {


    public void method(String str){
        System.out.println("STRING");

    }

    public void method(Object obj){

        System.out.println("Object");


    }

    public static void main(String[] args) {

        OverLoadingNull o = new OverLoadingNull();

        o.method(null);

    }
}
