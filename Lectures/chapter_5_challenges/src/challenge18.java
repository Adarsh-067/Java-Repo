 class Student{
     // show the student details using to string
     String name;
     int age;

     Student(String name , int age){
         this.name = name;
         this.age = age;
     }

     @Override
     public String toString() {
         return "Student Name: " + name + " , " +
                         "Age: " + age + "year";
     }

     public static void main(String[] args) {
         System.out.println("Hello, Adarsh welcome to java world!\n");
         Student first = new Student("Amit" , 20);
         System.out.println(first);
     }
 }
