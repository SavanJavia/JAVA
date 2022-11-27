public class MainOverride{
/* STATIC METHOD VS NON STATIC */
    public static void main(String args) {
        System.out.println("MainOverride>"+args);
    }

    public void method(){
        System.out.println("MainOverride method>");
    }
}

class MainChildOverride extends MainOverride{

    public static void main(String args) {
        System.out.println("MainChildOverride>"+args);
    }

    public void method(){
        System.out.println("MainChildOverride method>");
    }
}
class Separate {

    public static void main(String[] args) {

        MainChildOverride mc = new MainChildOverride();
        mc.main("TEST");//MainChildOverride
        mc.method();//MainChildOverride

        MainOverride mc1 = new MainOverride();
        mc1.main("TEST1");//MainOverride
        mc1.method();//MainOverride

        MainOverride mc2 = new MainChildOverride();
        mc2.main("TEST2");//MainOverride
        mc2.method();//MainChildOverride
    }
}