public class AbstractClass {

    //Real Time Example Of Abstract Class in JAVA

    /*public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>

    abstract public E get(int index);

    public class ArrayList<E> extends AbstractList<E>
            implements List<E>, RandomAccess, Cloneable, java.io.Serializable

    public E get(int index) {
        rangeCheck(index);

        return elementData(index);
    }
*/

    public static void main(String[] args) {

        ParentA ca = new ChildA();
        System.out.println(ca.strTest());
        System.out.println(ca.intTest());

        ParentA pa = new ParentA() {
            @Override
            String strTest() {
                return "ParentA strTest Method Calling...";
            }
        };
        System.out.println(pa.strTest());
        System.out.println(pa.intTest());


    }
}

abstract class ParentA{

    abstract String strTest();

    int intTest(){

        return 1;
    }
}

class ChildA extends ParentA{

    @Override
    String strTest() {
        return "ChildA strTest Method Calling...";
    }

    int intTest(){

        return 2;
    }

}
