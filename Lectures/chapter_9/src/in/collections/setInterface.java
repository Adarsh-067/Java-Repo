package in.collections;

import java.util.HashSet;
import java.util.Set;

public class setInterface {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Set<String> name = new HashSet<>();

        name.add("Adarsh");
        name.add("banti");

        utility.print(name);

        System.out.println(name.isEmpty());

        System.out.println(name.size());

        name.remove("Adarsh");
        name.clear();

        System.out.println(name.contains("chintu"));
        name.add("chintu");
        System.out.println(name.contains("chintu"));

        utility.print(name);

    }
}
