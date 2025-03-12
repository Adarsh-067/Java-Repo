import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n------------------ HELLO,WELCOME TO LOGIN PAGE! ------------------\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Press 1, to New User And\nPress 2, to Already User\n");
        System.out.print("Enter Your Choice: ");
        int value = input.nextInt();

        switch (value){
            case 1:{
                System.out.println("\n-------------- CREATE NEW ACCOUNT -------------");

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginProject",
                            "root",
                            "alpha18");
                    Statement statement = connection.createStatement();

                    System.out.print("\nEnter Your Name: ");
                    String name = input.next();
                    System.out.print("Enter Your Email: ");
                    String email = input.next();
                    System.out.print("Create Your UserName: ");
                    String userName = input.next();
                    System.out.print("Create Your Password: ");
                    String password = input.next();

                    String query = String.format("insert into login_info values('%s','%s','%s','%s')",name,email,userName,password);
                    int rowAff = statement.executeUpdate(query);

                    statement.close();
                    connection.close();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

                break;
            }
            case 2:{
                System.out.println("\n-------------- SIGN UP ACCOUNT ---------------\n");

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginProject",
                            "root",
                            "alpha18");
                    Statement statement = connection.createStatement();

                    System.out.print("Enter UserName: ");
                    String userName = input.next();
                    System.out.print("Enter Password: ");
                    String password = input.next();

                    String query = "select * from  login_info";
                    ResultSet result = statement.executeQuery(query);

//                    boolean isAuthentication = false;
                    while (result.next()){
                        if (userName.equals(result.getString("username")) && password.equals(result.getString("password"))){
                            System.out.println("\nYOUR DETAILS IS:\n");

                            System.out.println("Name: " + result.getString("name"));
                            System.out.println("Email: " + result.getString("email"));
                            System.out.println("Username: " + result.getString("username"));
                            System.out.println("Password: " + result.getString("password"));
                            break;
                        }
                    }

                    /*if (!isAuthentication){
                        System.out.println("your username or password is wrong");
                    }*/
                    statement.close();
                    result.close();
                    connection.close();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
