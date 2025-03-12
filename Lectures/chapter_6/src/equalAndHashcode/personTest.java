package equalAndHashcode;

public class personTest {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        person person1 = new person("Adarsh",15,15);
        person person2 = new person("Adarsh",15,15);

        if (person1.equals(person2)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
