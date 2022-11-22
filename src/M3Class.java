public class M3Class extends A11 {

    public static void main(String[] args) {
        A11 a = new M3Class();

        System.out.println(a.data);
        System.out.println(a.printData());
    }

}

class A11{

    int data = 1;

    boolean printData(){
        data = 2;
        System.out.println(data);

        return false;
    }
}


