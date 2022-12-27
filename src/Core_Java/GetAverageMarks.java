package Core_Java;

import java.util.*;

public class GetAverageMarks {
    public static void main(String[] args) {
        String[][] data = {{"xxx","30"},{"yyy","50"},{"zzz","80"},{"xxx","50"},{"xxx","30"},{"yyy","80"}};

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> count = new HashMap<>();
        Map<String,Integer> tm = new TreeMap<>();

        for(int i=0;i<data.length;i++){
            for(int j=0;j<1;j++){
                map.put(data[i][j], map.containsKey(data[i][j]) ?
                        map.get(data[i][j]) + Integer.parseInt(data[i][j+1]): Integer.parseInt(data[i][j+1]));
                count.put(data[i][j], count.containsKey(data[i][j]) ?
                        count.get(data[i][j]) + 1: 1);

                tm.put(data[i][j],map.get(data[i][j])/count.get(data[i][j]));
            }
        }
        System.out.println(tm);
        tm.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach(System.out::println);
        System.out.println(tm.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).findFirst().get());

    }
}
