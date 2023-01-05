public class MainOverload {

    public static void main(String[] args) {
        System.out.println("A");
    }

    public static void main(String[] args,int integer) {
        System.out.println("B");
    }
}

class SeprateOverload{
    public static void main(String[] args) {

        String[] str = new String[2];
        str[0]="A0";
        str[1]="Core_Java.A1";


        MainOverload mo = new MainOverload();
        mo.main(str);//A
        mo.main(str,1001);//B
    }
}
