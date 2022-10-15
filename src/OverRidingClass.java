public class OverRidingClass {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.method();

        Parent p1 = new Child();
        p1.method();
    }
}

class Parent{

    public void method(){
        System.out.println("VOID METHOD OF PARENT CLASS");
    }
    public int method1(){
        System.out.println("INT METHOD1 OF PARENT CLASS");
        return 1;
    }
}
class Child extends Parent{

    public void method(){
        System.out.println("VOID METHOD OF CHILD CLASS");
    }

    /**
     * 'method1()' in 'Child' clashes with 'method1()' in 'Parent'; attempting to use incompatible return type
     */
    //UNCOMMENT METHOD1
    /*public void method1(){
        System.out.println("VOID METHOD1 OF CHILD CLASS");
    }*/
}
