package in.Enumeration;

import java.util.Scanner;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to enum class in java~");
        Day day = Day.MONDAY;
        day = Day.SUNDAY;
        System.out.println(day);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String str = input.next();
    }
}
