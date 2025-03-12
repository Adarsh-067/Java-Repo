package in.Array;

class student {
    String studentName;
    int studentId;

    student(String studentName, int studentId){
        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("studentName: ").append(studentName);
        sb.append(" , studentId: ").append(studentId);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello, welcome to Array concept!");

        student[] std = new student[3];

        std[0] = new student("adarsh",1);
        std[1] = new student("soni",2);
        std[2] = new student("abhay",3);

        for (student s : std){
            System.out.println(s);
        }
    }
}
