package in.object;

public class student{
    String stdName;
    int stdId;

    public student(String stdName, int stdId) {
        this.stdName = stdName;
        this.stdId = stdId;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        System.out.println("Hello, welcome to java world!");

        student s = new student("adarsh",1); // first method to create object in java

        student s2 = (student) s.clone();   // second method to create object in java

        System.out.println(s2.stdName);
        System.out.println(s2.stdId);

        student std = (student)Class.forName("Demo.in.object.student").newInstance();
        System.out.println(std.stdName);
    }
}
