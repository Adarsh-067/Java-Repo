package demo;

import in.getterAndSetter.Car;

public class getterTest {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Car swift = new Car("swift","black",1,2000);
        System.out.printf("%s %s",swift.getColour() ,swift.getCarName());
        swift.setCarName("thar");
        swift.setColour("Red");
        System.out.println(swift);
    }
}
