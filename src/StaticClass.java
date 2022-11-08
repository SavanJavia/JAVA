public class StaticClass {
    static class ABC{

        public static String method(){

            return "TEST";
        }

        public static String method1(){

            return "TEST1";
        }
    }

    public static void main(String[] args) {

        System.out.println(StaticClass.ABC.method());

        ABC a = new ABC();
        System.out.println(a.method1());
    }


}


