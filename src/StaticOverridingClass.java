public class StaticOverridingClass {
    public static void main(String[] args) {
        child2 c2 = new child2();
        c2.method1();//child
        c2.method1(111);//child-1

        parent2 p2 =new parent2();
        p2.method1();//parent

        parent2 pc2 =new child2();
        pc2.method1();//parent
        //pc2.method1(123);
    }
}


class parent2{

    public static void method1(){
        System.out.println("parent");
    }

}

class child2 extends parent2{

    public static void method1(){
        System.out.println("child");
    }

    public final void method1(int i){
        System.out.println("child-1");
    }
}
