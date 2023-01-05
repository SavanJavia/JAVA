package Core_Java;

class Star {
    public void doStuff() {
        System.out.println("Twinkling Core_Java.Star");
    }
}
interface Universe {
    public void doStuff();
}
class Sun extends Star implements Universe {
    public void doStuff() {
        System.out.println("Shining Core_Java.Sun");
    }}
public class OverrideTest {
    public static void main(String[] args) {
        Sun obj2 = new Sun();
        Star obj3 = obj2;
        ((Sun) obj3).doStuff(); //Shining Core_Java.Sun
        ((Star) obj2).doStuff();//Shining Core_Java.Sun
        ((Universe) obj2).doStuff();//Shining Core_Java.Sun
    }}