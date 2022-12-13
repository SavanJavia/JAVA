package Core_Java.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConcurrentHashMap {

    public static void main(String[] args) {

        Map<String,String> map = new java.util.concurrent.ConcurrentHashMap<>();

        MapHelper1 t1 = new MapHelper1(map);
        MapHelper2 t2 = new MapHelper2(map);
        MapHelper3 t3 = new MapHelper3(map);
        MapHelper4 t4 = new MapHelper4(map);

        for(Map.Entry<String,String> m:map.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());

        }

    }

}
