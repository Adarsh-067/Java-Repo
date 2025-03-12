package in.Polymorphism;

import in.Abstraction.Animal.Animal;
import in.Abstraction.Animal.Cat;
import in.Abstraction.Animal.Dog;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to polymorphism concept in java!");
        Animal dog = new Dog("Dog");
        dog.sayHello();

        Animal cat = new Cat("cat");
        cat.sayHello();
//        cat.sayBye();

        Object catt = new Cat("car");
        System.out.println(catt.getClass());

        Object pat = new Parrot("paddy");
        System.out.println(pat.toString());
        System.out.println( pat.hashCode());

        try {
            Cat p = (Cat) new Object();
            p.sayHello();
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
        }

    }
}
