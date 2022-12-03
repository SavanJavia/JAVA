import java.util.HashMap;
import java.util.Map;

public class HasCodeANDEqual {
    public static void main(String[] args) {


                Map<String,Integer> map1 = new HashMap<>();
                String str1 = "Hello";
                map1.put(str1,1);
                System.out.println(map1);

                String str2 = new String("Hello");
                map1.put(str2,2);
                System.out.println(map1);

                String str3 = new String("Hello");
                map1.put(str3,3);
                System.out.println(map1);

                System.out.println(map1.size());//1
                System.out.println(map1.get("Hello"));//3
                System.out.println(map1.get(new String("Hello")));//3

        System.out.println("Hello".equals(new String("Hello")));
        System.out.println("Hello".hashCode()+" "+new String("Hello").hashCode());

        System.out.println("a".equals(new Integer(97)));
        System.out.println("a".hashCode()+" " +new Integer(97).hashCode());

    }
}
