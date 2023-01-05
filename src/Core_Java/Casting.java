package Core_Java;

public class Casting {

    public static void main(String[] args) {

        Class2 obj2 = new Class3();
        obj2.method1(); // Call Core_Java.Class3 method
        System.out.println("-----------------------");
        /*Core_Java.Class3 obj4 = new Core_Java.Class2();
        obj4.method1();*/ // Compile time error

        Class3 obj1 = new Class3();
        obj1.method1(); // Call Core_Java.Class3 method
        System.out.println("-----------------------");
        Class2 obj3 = new Class2();
        obj3.method1(); // Call Core_Java.Class2 method

    }

}

class Class2{

    public Class2() {
        System.out.println("Core_Java.Class2 init");
    }

    public void method1(){
        System.out.println("Core_Java.Class2 method1");
    }
}

class Class3 extends Class2{

    public Class3() {
        System.out.println("Core_Java.Class3 init");
    }

    public void method1(){
        System.out.println("Core_Java.Class3 method1");
    }


}
