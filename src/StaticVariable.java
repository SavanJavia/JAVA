public class StaticVariable {
    public static void main(String[] args) {
        StaticParent sp = new StaticParent();
        sp.method();
        sp.method(1);

        StaticParent sp1 = new StaticChild();
        sp1.method();
        sp1.method(1);

        StaticParent sp2 = new StaticChild();
        sp2.method();
        sp2.method(1);
    }
}

class StaticParent{

    public static int i = 9;
    public static int z = 99;

    public void method(){
        i=10;
        System.out.println("STATIC StaticParent>"+i);
    }

    public static void method(int j){
        z=11;
        System.out.println("STATIC METHOD StaticParent>"+z);
    }

}

class StaticChild extends StaticParent{

    public void method(){
        i=101;
        System.out.println("STATIC ChildParent>"+i);
    }

}