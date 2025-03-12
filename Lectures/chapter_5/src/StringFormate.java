public class StringFormate {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        String name = "Abhay";
        int marks = 45523589;
        System.out.println("Hello, " + name + " your marks are " + marks);
        System.out.printf("Hello, %s your marks are %d\n", name,marks);
        System.out.printf("Hello, '%s' your marks are %d\n", name,marks);
        System.out.printf("Hello, %S your marks are %d\n", name,marks);
        System.out.printf("Hello, %8s your marks are %d\n", name,marks);
        System.out.printf("Hello, %-8s your marks are %d\n", name,marks);
        System.out.printf("Hello, %s your marks are %,d", name,marks);


    }
}
