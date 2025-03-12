import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Statement {
    private static final String url = "jdbc:mysql://localhost:3306/adarsh";
    private static final String userName = "root";
    private static final String password = "alpha18";

    public static void main(String[] args) {
        System.out.println("Hello, welcome to JDBC concept!");
        Scanner input = new Scanner(System.in);

        try {
            //Driver load in this class.

            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            // connection establish

            Connection connection = DriverManager.getConnection(url,userName,password);
            java.sql.Statement statement = connection.createStatement();
            while (true){
                System.out.print("\nEnter your name: ");
                String name = input.next();
                System.out.print("Enter your id: ");
                int id = input.nextInt();
                System.out.print("Enter your age: ");
                int age = input.nextInt();
                System.out.print("Enter your marks: ");
                double marks = input.nextDouble();

                System.out.print("Enter more data(Y/N): ");
                String choice = input.next();

                String query = String.format("INSERT INTO STUDENT(id,name,age,marks) VALUES(%d,'%s',%d,%f)",id,name,age,marks);
                statement.addBatch(query);
                if (choice.equalsIgnoreCase("N")){
                    break;
                }
            }

            int[] arr = statement.executeBatch();


            // Insert data from database

           /* System.out.println("-------------- Enter you details: --------------");
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.print("Enter your id: ");
            int id = input.nextInt();
            System.out.print("Enter your age: ");
            int age = input.nextInt();
            System.out.print("Enter your marks: ");
            double marks = input.nextDouble();

            String query = String.format("insert into student values(%d,'%s',%d,%f)",id,name,age,marks);
            int rowAffec = statement.executeUpdate(query);
            if (rowAffec>0){
                System.out.println("Insertion Successful!");
//                System.out.println(rowAffec);
            }else {
                System.out.println("Data Not Insert!");
            }*/



            // update data from database.

            /*String query = String.format("update student set marks = %f where id = %d",90.0,3);
            int rowAffec = statement.executeUpdate(query);
            if (rowAffec>0){
                System.out.println("Data Updated Successful!");
            }else {
                System.out.println("Data Not Updated!");
            }*/



            // Delete data from database.

           /* String query = String.format("delete from student where id = %d",4);
            int rowAffec = statement.executeUpdate(query);
            if (rowAffec>0){
                System.out.println("Deleted Successful!");
            }else {
                System.out.println("Not Deleted!");
            }*/



            // Retrieving data from database

           /* String query = "select * from student";
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");
                double marks = result.getLong("marks");

                System.out.println("\nid: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Marks: " + marks);
            }*/



            /*String query = String.format("create table details(name varchar(25),age int)");
            int rowAff = statement.executeUpdate(query);*/
             statement.close();
            connection.close();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
