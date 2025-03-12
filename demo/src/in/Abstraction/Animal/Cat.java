package in.Abstraction.Animal;

public class Cat extends Animal {
    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public void sayHello() {
        System.out.println("Meow!");
    }

    public void sayBye(){
        System.out.println("Meow Meow!");
    }
}
