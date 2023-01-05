package Core_Java;

public class InheritanceClass {

    public static void main(String[] args) {

        ParentI pi = new ParentI(4);
        System.out.println(pi.i);

        ParentI ci = new ChildI(3);
        System.out.println(ci.i);
    }
}

class ParentI{

    public int i = 1;

    public ParentI(int i) {
        this.i=i;
    }
}

class ChildI extends ParentI{

    public int i = 2;


    public ChildI(int i) {
        super(5);
        this.i=i;
    }
}