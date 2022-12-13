package Core_Java.Map;

import java.util.Map;

public class MapHelper1 implements Runnable {
    Map<String, String> map;

    public MapHelper1(Map<String, String> map) {
        this.map = map;
        new Thread(this, "MapHelper1").start();
    }

    public void run() {
        map.put("One", "1");
        try {
            System.out.println("MapHelper1 sleeping");
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}