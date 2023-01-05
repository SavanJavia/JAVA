package Core_Java;

/**
 * final method overload is possible but overriding not possible
 */
public class FinalClassOverriding {
    public static void main(String[] args) {

        child1 c = new child1();
        c.method1(12);
        c.method1();
    }
}

class parent1{

    public void method1(){
        System.out.println("parent");
    }

}

class child1 extends parent1{

    public final void method1(){
        System.out.println("child");
    }

    public final void method1(int i){
        System.out.println("child-1");
    }
}
