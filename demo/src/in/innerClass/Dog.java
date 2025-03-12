package in.innerClass;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("woof...");
    }

    public void hello(){
        System.out.println("woof woof...");
    }
}
