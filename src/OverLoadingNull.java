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
        o.method(3);
        int i=4;
        o.method(i);
        Integer j=5;
        o.method(j);

        o.method(new WRAPPERCLASS());

    }


}

class WRAPPERCLASS{
    public WRAPPERCLASS() {
        System.out.println("WRAPPERCLASS..");
    }
}
