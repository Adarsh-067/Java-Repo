package in;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class challenge7 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String userInp = input.next();

        for (char c : userInp.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("Your String has %s unique characters", unique.size());
    }
}
