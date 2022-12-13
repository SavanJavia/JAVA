package Core_Java.Map;

import java.util.Map;

public class MapHelper3 implements Runnable {
    Map<String, String> map;

    public MapHelper3(Map<String, String> map) {
        this.map = map;
        new Thread(this, "MapHelper3").start();
    }

    public void run() {
        map.put("three", "3");
        try {
            System.out.println("MapHelper3 sleeping");
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}