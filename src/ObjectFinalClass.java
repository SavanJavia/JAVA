public class ObjectFinalClass {

    public static void main(String[] args) {

        FinalParent finalParent = new FinalParent();
        finalParent.method();

        FinalParent finalParent1 = new FinalParent();
        finalParent1.method();
    }
}


final class FinalParent{

    public void method(){
        System.out.println("final parent");
    }
}
