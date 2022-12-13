package Core_Java.Map;

import java.util.Map;

public class MapHelper2 implements Runnable {
    Map<String, String> map;

    public MapHelper2(Map<String, String> map) {
        this.map = map;
        new Thread(this, "MapHelper2").start();
    }

    public void run() {
        map.put("two", "2");
        try {
            System.out.println("MapHelper2 sleeping");
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}