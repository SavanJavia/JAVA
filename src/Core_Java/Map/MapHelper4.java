package Core_Java.Map;

import java.util.Map;

public class MapHelper4 implements Runnable {
    Map<String, String> map;

    public MapHelper4(Map<String, String> map) {
        this.map = map;
        new Thread(this, "MapHelper4").start();
    }

    public void run() {
        map.put("four", "4");
        try {
            System.out.println("MapHelper4 sleeping");
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}