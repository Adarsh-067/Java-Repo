package challenge81;

public class testClass {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        person fist = new person("Adarsh",19);
        person second = new person("Adarsh",13);

        if (fist.equals(second)) {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
