package Core_Java;

public class MainOverride{
/* STATIC METHOD VS NON STATIC */
    public static void main(String args) {
        System.out.println("Core_Java.MainOverride>"+args);
    }

    public void method(){
        System.out.println("Core_Java.MainOverride method>");
    }
}

class MainChildOverride extends MainOverride{

    public static void main(String args) {
        System.out.println("Core_Java.MainChildOverride>"+args);
    }

    public void method(){
        System.out.println("Core_Java.MainChildOverride method>");
    }
}
class Separate {

    public static void main(String[] args) {

        MainChildOverride mc = new MainChildOverride();
        mc.main("TEST");//Core_Java.MainChildOverride
        mc.method();//Core_Java.MainChildOverride

        MainOverride mc1 = new MainOverride();
        mc1.main("TEST1");//Core_Java.MainOverride
        mc1.method();//Core_Java.MainOverride

        MainOverride mc2 = new MainChildOverride();
        mc2.main("TEST2");//Core_Java.MainOverride
        mc2.method();//Core_Java.MainChildOverride
    }
}