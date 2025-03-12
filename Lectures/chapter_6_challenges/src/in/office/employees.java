package in.office;

public class employees {
    private String name;
    private int salary;
    private int Age;

    String getEmployeeDetails(){
        return "EmployeeDetails: Name: " + name
                                 + ", Age: " + Age
                                 + ", Salary: " + salary;
    }
    public employees(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
