package in.office;

public class project {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        employees first = new employees("Adarsh",15000,19);
        System.out.println(first.getEmployeeDetails());
        first.setName("Abhay");
        System.out.println(first.getEmployeeDetails());

    }
}
