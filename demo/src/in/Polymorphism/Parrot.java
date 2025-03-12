package in.Polymorphism;

import in.Abstraction.Animal.Animal;

public class Parrot extends Animal {
    String name = "parrot";
    protected Parrot(String animalName) {
        super(animalName);
    }

    @Override
    public void sayHello() {
        System.out.println("good morning!☺");
    }

    public void sayBye(){
        System.out.println("Bye Bye!");
    }

    @Override
    public String toString() {
        return name;
    }
}
