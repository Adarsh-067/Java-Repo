package in.innerClass;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to car manufacturing company!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your car name: ");
        String carName = input.next();
        Car thar = new Car(carName);
        Car.Engine engine = thar.new Engine();
        engine.start();
        engine.stop();

       /* Student s1 = new Student("Adarsh",35);
        Student.Result result = s1.new Result();
        result.pass();

        Student.standard std = new Student.standard(12);
        System.out.println(std.standard);

        Animal dog = new Dog();
        dog.sound();*/
//        dog.hello();
    }
}
