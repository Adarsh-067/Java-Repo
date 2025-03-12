import java.sql.*;
import java.util.Scanner;

public class Prepared_statement {
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

                java.sql.Connection connection = DriverManager.getConnection(url,userName,password);
                String query ="INSERT INTO STUDENT VALUES(?,?,?,?)";
//                Statement statement = connection.createStatement();
                PreparedStatement ps = connection.prepareStatement(query);

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

                   ps.setInt(1,id);
                   ps.setString(2,name);
                   ps.setInt(3,age);
                   ps.setDouble(4,marks);

                   ps.addBatch();
                   if (choice.equalsIgnoreCase("N")){
                       break;
                   }
               }

               int[] arr = ps.executeBatch();

                //Select data from database

              /*  ps.setInt(1,3);

                if (result.next()){
                    System.out.println("Name: " + result.getString("name"));
                }else {
                    System.out.println("Data Not Found!");
                }*/


                // Updated data from database

                /*ps.setString(1,"Ram");
                ps.setInt(2,6);*/

                // Inserted data into database

                /*ps.setInt(1,8);
                ps.setString(2,"Ansh");
                ps.setInt(3,15);
                ps.setDouble(4,34.5);*/


             /*   if (result>0) {
                    System.out.println("Updated successful!");
                }else {
                    System.out.println("Insertion is unsuccessful!");
                }
*/

                ps.close();
                connection.close();

            }catch (SQLException e){
                System.out.println(e.getMessage());
            }

        }
    }
