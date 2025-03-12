package in.collections;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Map<String,Integer>  map = new HashMap<>();

        map.put("Age",19);
        map.put("rollNo",101);
        map.put("adarsh",58);

        System.out.println(map.get("Age"));
        System.out.println(map.get("rollNo"));
        System.out.println(map.containsKey("rollNo"));
        System.out.println(map.containsKey("rollN"));
        System.out.println(map.containsValue(19));
        System.out.println(map.containsValue(190));
        System.out.println(map.keySet());
        System.out.println(map.values());

//        System.out.println(map.remove("Age"));
        map.remove("Age");
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
