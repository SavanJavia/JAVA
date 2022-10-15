public class PassByValue {

    int classLevel = 3;

    public static void main(String[] args) {

        int i = 1;
        callMethodPrimitive(i);//PASSING AN COPY OF VALUE
        System.out.println("<<MAIN METHOD PRIMITIVE VALUE>>"+i);

        PassByValue passByValue = new PassByValue();
        callMethodObject(passByValue);//PASSING AN OBJECT REFERENCE/ADDRESS
        System.out.println("<<MAIN METHOD OBJECT>>"+passByValue.classLevel);

    }

    private static void callMethodObject(PassByValue passByValue) {
        passByValue.classLevel = 4;
        System.out.println("<<CALLMETHODOBJECT METHOD OBJECT>>"+passByValue.classLevel);
    }

    private static void callMethodPrimitive(int i) {
        i = 2;
        System.out.println("<<CALLMETHODPRIMITIVE METHOD PRIMITIVE VALUE>>"+i);
    }


}