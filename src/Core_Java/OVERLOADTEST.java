package Core_Java;

public class OVERLOADTEST {

    public static void main(String[] args) {

        ParentTest p = new ParentTest();
        System.out.println(p.Method(5));

        ParentTest p1 = new ChildTest();
        System.out.println(p1.Method(4));
    }
}

class ParentTest{
    public double Method(double a){
        System.out.println(a);
        return 2;
    }
}

class ChildTest extends ParentTest{

    public double Method(int a){
        System.out.println(a);
        return 3;
    }
}
