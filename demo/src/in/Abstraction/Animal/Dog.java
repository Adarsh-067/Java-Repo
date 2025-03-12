package in.Abstraction.Animal;

public class Dog extends Animal {
    public Dog(String animalName) {
        super(animalName);
    }

    @Override
    public void sayHello() {
        System.out.println("woof!");
    }
}
