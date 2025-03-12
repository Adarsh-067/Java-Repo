package in.Abstraction.Animal;
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to Abstraction concept");
      /*  Animal animal = new Animal("dog") {
            @Override
            void sayHello() {
                System.out.println("hello");
            }
        };*/

//        animal.sayHello();
        Dog dog = new Dog("Dog");
        dog.sayHello();
        dog.sleep();
        dog.setAge("15");
        System.out.println(dog.getAge());

        Animal cat = new Cat("cat");
        cat.sleep();
        cat.setAge("5");
        System.out.println(cat.getAge());
    }
}
