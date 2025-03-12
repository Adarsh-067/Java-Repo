public class Course {
    /*challenge2
    * Design a course class
    * */

    String courseName;  // instance variable
    int enrollment;

    static int maxEnrollStudent = 100;        // static variable

    String[] enrolledStudents = new String[maxEnrollStudent];

    Course(String courseName , int enrollment){           // constructor
        this.courseName = courseName;
        this.enrollment = enrollment;
    }

    Course(String courseName){                           // constructor chaining
        this.courseName = courseName;
        this.enrollment = 0;
    }

    static void setMaxEnrollStudent(int maxEnrollStudent){                // static mehtod
        course.maxEnrollStudent = maxEnrollStudent;
    }

    void enrollStudent(String studentName){                        // instance method
        enrolledStudents[enrollment] = studentName;
        enrollment++;
    }

    void unEnrollStudent(String studentName){
        System.out.println("student removed");
        enrollment--;
    }
}
