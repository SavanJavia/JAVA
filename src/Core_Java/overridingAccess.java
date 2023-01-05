package Core_Java;

public class overridingAccess {

    public static void main(String[] args) {
        A00 obj = new A00();
        obj.method1();
    }
}

class A0{

    private void method1(){
        System.out.println("Core_Java.A0");
    }
}

class A00 extends  A0{

    protected void method1(){
        System.out.println("Core_Java.A00");
    }
}