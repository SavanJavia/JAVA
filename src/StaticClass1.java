public class StaticClass1 {

    public static void main(String[] args) {
        System.out.println("MAIN");
        class1ABC c = new class1ABC();
    }
}


class class1ABC{


    public class1ABC() {
        System.out.println("class1ABC");
    }

    {
        System.out.println("INTIALIZATION");

    }


    static {
        System.out.println("STATIC");
    }


}