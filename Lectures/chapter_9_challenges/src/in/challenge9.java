package in;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class challenge9 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);

        Map<String,String> map = new HashMap<>();

        map.put("mp","Bhopal");
        map.put("up","Lucknow");
        map.put("j&k","ShriNagar");

        System.out.print("Please Enter A District Name: ");
        String user = input.next();

        System.out.printf("Capital of your district is: %s ",map.get(user));
    }
}
