package in.Collection;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to collection in java!");

        Map<String,Integer> map = new HashMap<>();
        map.put("student1",85);
        map.put("student2",80);
        map.put("student3",79);

        System.out.println(map.get("student2"));

        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
